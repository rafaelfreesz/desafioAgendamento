package desafioAgendamento.service;

import java.io.Serializable;

import javax.inject.Inject;

import desafioAgendamento.model.Paciente;
import desafioAgendamento.repository.PacienteRepository;
import desafioAgendamento.utils.Transacional;

public class CadastroPacienteService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PacienteRepository repository;

	@Transacional
	public void salvar(Paciente paciente) {
		repository.salvar(paciente);
	}
	
	@Transacional
	public void excluir(Paciente paciente) {
		repository.remover(paciente);
	}
}
