package desafioAgendamento.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import desafioAgendamento.model.Paciente;
import desafioAgendamento.model.enums.Sexo;

@Named 
@ViewScoped
public class PacienteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Paciente paciente=new Paciente();
	
	public void salvar() {
		System.out.println("Nome: "+paciente.getNome());
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}

}
