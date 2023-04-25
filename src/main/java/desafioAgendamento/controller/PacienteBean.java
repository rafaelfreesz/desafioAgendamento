package desafioAgendamento.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.RollbackException;

import org.primefaces.context.RequestContext;

import desafioAgendamento.model.Paciente;
import desafioAgendamento.model.enums.Especializacao;
import desafioAgendamento.model.enums.Sexo;
import desafioAgendamento.repository.PacienteRepository;
import desafioAgendamento.service.CadastroPacienteService;
import desafioAgendamento.utils.FacesMessages;

@Named
@ViewScoped
public class PacienteBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private PacienteRepository repository;

	@Inject
	private CadastroPacienteService service;

	@Inject
	private FacesMessages messages;

	private List<Paciente> listaPaciente;

	private String termoPesquisa;

	private Paciente paciente;

	public void prepararNovoPaciente() {
		paciente = new Paciente();
	}

	public void salvar() {
		service.salvar(paciente);

		atualizarRegistros();

		messages.info("Paciente salvo com sucesso!");

		RequestContext.getCurrentInstance().update(Arrays.asList("frm:pacientesDataTable", "frm:messages"));
	}

	public void excluir() {
		
		try {
		service.excluir(paciente);
		paciente = null;
		
		atualizarRegistros();
		
		messages.info("Paciente excluido com sucesso");
		}catch(RollbackException e) {
			messages.error("Paciente não excluido. Existem consultas cadastradas para este paciente.");			
		}
	}

	public void atualizarRegistros() {
		if (jaHouvePesquisa()) {
			pesquisar();
		} else {
			buscarTodos();
		}
	}

	public void pesquisar() {
		listaPaciente = repository.buscarPorNome(termoPesquisa);

		if (listaPaciente.isEmpty()) {
			messages.info("Sua consulta não retornou registros");
		}
	}

	public void buscarTodos() {
		listaPaciente = repository.buscarTodos();
	}

	private boolean jaHouvePesquisa() {
		return termoPesquisa != null && !"".equals(termoPesquisa);
	}

	public List<Paciente> getListaPacientes() {
		return listaPaciente;
	}

	public boolean isPacienteSelecionado() {
		return paciente != null && paciente.getId() != null;
	}

	public Sexo[] getSexos() {
		return Sexo.values();
	}

	public Especializacao[] getEspecializacoes() {
		return Especializacao.values();
	}

	public String getTermoPesquisa() {
		return termoPesquisa;
	}

	public void setTermoPesquisa(String termoPesquisa) {
		this.termoPesquisa = termoPesquisa;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
	
	
	
	
	

}
