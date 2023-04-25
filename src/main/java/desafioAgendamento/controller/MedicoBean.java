package desafioAgendamento.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import desafioAgendamento.model.Medico;
import desafioAgendamento.model.enums.Especializacao;
import desafioAgendamento.model.enums.Sexo;
import desafioAgendamento.repository.MedicoRepository;
import desafioAgendamento.service.CadastroMedicoService;
import desafioAgendamento.utils.FacesMessages;

@Named
@ViewScoped
public class MedicoBean implements Serializable{
	
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
		medico=new Medico();
	}
	
	public void salvar() {
		service.salvar(medico);
		
		if(jaHouvePesquisa()) {
			pesquisar();
		}
		
		messages.info("Médico salvo com sucesso!");
	}
	
	public void pesquisar() {
		listaMedicos=repository.buscarPorNome(termoPesquisa);
		
		if(listaMedicos.isEmpty()) {
			messages.info("Sua consulta não retornou registros");
		}
	}
	
	public void buscarTodos() {
		listaMedicos= repository.buscarTodos();
	}
	
	private boolean jaHouvePesquisa() {
		return termoPesquisa!=null && !"".equals(termoPesquisa);
	}
	
	public List<Medico> getListaMedicos() {
		return listaMedicos;
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
