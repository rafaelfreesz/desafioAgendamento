package desafioAgendamento.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import desafioAgendamento.model.Medico;
import desafioAgendamento.model.enums.Especializacao;
import desafioAgendamento.model.enums.Sexo;

@Named
@ViewScoped
public class MedicoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Medico medico=new Medico();
	
	public void salvar() {
		System.out.println(medico);
	}
	
	public Medico getMedico() {
		return medico;
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	public Especializacao[] getEspecializacoes() {
		return Especializacao.values();
	}
	
	
	
	
	

}
