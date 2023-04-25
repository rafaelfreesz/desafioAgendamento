package desafioAgendamento.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.RollbackException;

import org.primefaces.context.RequestContext;

import desafioAgendamento.model.Consulta;
import desafioAgendamento.model.enums.Status;
import desafioAgendamento.repository.ConsultaRepository;
import desafioAgendamento.service.CadastroConsultaService;
import desafioAgendamento.utils.FacesMessages;

@Named
@ViewScoped
public class ConsultaBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ConsultaRepository repository;

	@Inject
	private CadastroConsultaService service;

	@Inject
	private FacesMessages messages;

	private List <Consulta> listaConsulta;

	private String termoPesquisa;

	private Consulta consulta;

	public void prepararNovaConsulta() {
		consulta = new Consulta();
	}

	public void salvar() {
		service.salvar(consulta);

		atualizarRegistros();

		messages.info("Consulta salvo com sucesso!");

		RequestContext.getCurrentInstance().update(Arrays.asList("frm:pacientesDataTable", "frm:messages"));
	}

	public void excluir() {
		
		try {
		service.excluir(consulta);
		consulta = null;
		
		atualizarRegistros();
		
		messages.info("Consulta excluido com sucesso");
		}catch(RollbackException e) {
			messages.error("Consulta não excluido. Existem pacientes e médicos cadastradas para esta consulta.");			
		}
	}

	public void atualizarRegistros() {
		if (jaHouvePesquisa()) {
			pesquisarPorPaciente();
		} else {
			buscarTodas();
		}
	}

	public void pesquisarPorPaciente() {
		
		List<Consulta> listaAux=repository.buscarTodas();
		
		listaConsulta.clear();
		
		for(Consulta c: listaAux) {
			if(c.getPaciente().getNome().contains(termoPesquisa)) {
				listaConsulta.add(c);
			}
		}

		if (listaConsulta.isEmpty()) {
			messages.info("Sua consulta não retornou registros");
		}
	}

	public void buscarTodas() {
		listaConsulta = repository.buscarTodas();
	}

	private boolean jaHouvePesquisa() {
		return termoPesquisa != null && !"".equals(termoPesquisa);
	}

	public List<Consulta> getListaConsulta() {
		return listaConsulta;
	}

	public boolean isConsultaSelecionada() {
		return consulta != null && consulta.getId() != null;
	}

	public String getTermoPesquisa() {
		return termoPesquisa;
	}

	public void setTermoPesquisa(String termoPesquisa) {
		this.termoPesquisa = termoPesquisa;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	public Status[] getAllStatus() {
		return Status.values();
	}

	
	
	
	
	
	
	

}
