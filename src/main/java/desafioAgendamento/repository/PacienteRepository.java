package desafioAgendamento.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import desafioAgendamento.model.Medico;
import desafioAgendamento.model.Paciente;

public class PacienteRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public PacienteRepository() {
	}

	public PacienteRepository(EntityManager manager) {
		this.manager = manager;
	}

	public Paciente buscarPorId(Long id) {
		return manager.find(Paciente.class, id);
	}

	public List<Paciente> buscarPorNome(String nome) {
		TypedQuery<Paciente> query = manager.createQuery("from Paciente where nome like :nome", Paciente.class);
		query.setParameter("nome", nome + "%");
		return query.getResultList();
	}

	public List<Paciente> buscarTodos() {
		return manager.createQuery("from Paciente", Paciente.class).getResultList();
	}

	public Paciente salvar(Paciente paciente) {
		return manager.merge(paciente);
	}

	public void remover(Paciente paciente) {
		paciente = buscarPorId(paciente.getId());
		manager.remove(paciente);
	}

}
