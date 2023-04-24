package desafioAgendamento.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import desafioAgendamento.model.Medico;

public class MedicoRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	public MedicoRepository() {
	}

	public MedicoRepository(EntityManager manager) {
		this.manager = manager;
	}
	
	public Medico buscarPorId(Long id) {
		return manager.find(Medico.class, id);
	}
	
	
	public List<Medico> buscarPorNome(String nome){
		TypedQuery<Medico> query = manager.createQuery("from Medico where nome like :nome",
				Medico.class);
		query.setParameter("nome", nome + "%");
		
		return query.getResultList();
	}
	
	public List<Medico> buscarTodos(){
		return manager.createQuery("from Medico", Medico.class).getResultList();
	}
	
	public Medico salvar(Medico medico) {
		return manager.merge(medico);
	}
	
	public void remover(Medico medico) {
		medico = buscarPorId(medico.getId());
		manager.remove(medico);
	}
	
	
	
}
