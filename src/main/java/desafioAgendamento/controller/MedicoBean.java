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

@Named
@ViewScoped
public class MedicoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private MedicoRepository repository;

	private List<Medico> listaMedicos;
	
	
	public void buscarTodos() {
		listaMedicos= repository.buscarTodos();
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
	
	
	
	
	

}
