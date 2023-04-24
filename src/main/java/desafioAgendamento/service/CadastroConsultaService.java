package desafioAgendamento.service;

import java.io.Serializable;

import javax.inject.Inject;

import desafioAgendamento.model.Consulta;
import desafioAgendamento.repository.ConsultaRepository;
import desafioAgendamento.utils.Transacional;

public class CadastroConsultaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ConsultaRepository repository;

	@Transacional
	public void salvar(Consulta consulta) {
		repository.salvar(consulta);
	}
	
	@Transacional
	public void excluir(Consulta consulta) {
		repository.remover(consulta);
	}
}
