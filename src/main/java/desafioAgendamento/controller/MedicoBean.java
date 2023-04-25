package desafioAgendamento.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.RollbackException;

import org.primefaces.context.RequestContext;

import desafioAgendamento.model.Medico;
import desafioAgendamento.model.enums.Especializacao;
import desafioAgendamento.model.enums.Sexo;
import desafioAgendamento.repository.MedicoRepository;
import desafioAgendamento.service.CadastroMedicoService;
import desafioAgendamento.utils.FacesMessages;

@Named
@ViewScoped
public class MedicoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private MedicoRepository repository;

	@Inject
	private CadastroMedicoService service;

	@Inject
	private FacesMessages messages;

	private List<Medico> listaMedicos;

	private String termoPesquisa;

	private Medico medico;

	public void prepararNovoMedico() {
		medico = new Medico();
	}

	public void salvar() {
		service.salvar(medico);

		atualizarRegistros();

		messages.info("Médico salvo com sucesso!");

		RequestContext.getCurrentInstance().update(Arrays.asList("frm:medicosDataTable", "frm:messages"));
	}

	public void excluir() {
		
		try {
		service.excluir(medico);
		medico = null;
		
		atualizarRegistros();
		
		messages.info("Médico excluido com sucesso");
		}catch(RollbackException e) {
			messages.error("Médico não excluido. Existem consultas cadastradas para este médico.");			
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
		listaMedicos = repository.buscarPorNome(termoPesquisa);

		if (listaMedicos.isEmpty()) {
			messages.info("Sua consulta não retornou registros");
		}
	}

	public void buscarTodos() {
		listaMedicos = repository.buscarTodos();
	}

	private boolean jaHouvePesquisa() {
		return termoPesquisa != null && !"".equals(termoPesquisa);
	}

	public List<Medico> getListaMedicos() {
		return listaMedicos;
	}

	public boolean isMedicoSelecionado() {
		return medico != null && medico.getId() != null;
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

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}
