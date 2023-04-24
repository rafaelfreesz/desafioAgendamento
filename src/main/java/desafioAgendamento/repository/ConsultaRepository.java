package desafioAgendamento.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import desafioAgendamento.model.Consulta;
import desafioAgendamento.model.Medico;
import desafioAgendamento.model.Paciente;

public class ConsultaRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	public ConsultaRepository() {
	}

	public ConsultaRepository(EntityManager manager) {
		this.manager = manager;
	}
	
	public Consulta buscarPorId(Long id) {
		return manager.find(Consulta.class, id);
	}
	
	public List<Consulta> buscarPorMedico(Medico medico){
		TypedQuery<Consulta> query = manager.createQuery("from tb_consulta where fk_medico like :fk_medico",
				Consulta.class);
		query.setParameter("fk_medico", medico.getId() + "%");
		return query.getResultList();
	}
	
	public List<Consulta> buscarPorPaciente(Paciente paciente){
		TypedQuery<Consulta> query = manager.createQuery("from tb_consulta where fk_paciente like :fk_paciente",
				Consulta.class);
		query.setParameter("fk_paciente", paciente.getId() + "%");
		return query.getResultList();
	}
	
	public List<Consulta> buscarTodas(){
		return manager.createQuery("from tb_consulta", Consulta.class).getResultList();
	}
	
	public Consulta salvar(Consulta consulta) {
		return manager.merge(consulta);
	}
	
	public void remover(Consulta consulta) {
		consulta = buscarPorId(consulta.getId());
		manager.remove(consulta);
	}
	
	
	
}
