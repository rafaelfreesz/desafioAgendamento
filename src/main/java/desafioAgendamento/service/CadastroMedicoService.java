package desafioAgendamento.service;

import java.io.Serializable;

import javax.inject.Inject;

import desafioAgendamento.model.Medico;
import desafioAgendamento.repository.MedicoRepository;
import desafioAgendamento.utils.Transacional;

public class CadastroMedicoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private MedicoRepository repository;

	@Transacional
	public void salvar(Medico medico) {
		repository.salvar(medico);
	}
	
	@Transacional
	public void excluir(Medico medico) {
		repository.remover(medico);
	}
}
