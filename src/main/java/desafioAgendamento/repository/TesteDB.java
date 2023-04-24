package desafioAgendamento.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import desafioAgendamento.model.Medico;
import desafioAgendamento.model.Paciente;

public class TesteDB {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DbAgendamento");

		EntityManager em = emf.createEntityManager();

		MedicoRepository medicoRepository=new MedicoRepository(em);
		PacienteRepository pacienteRepository=new PacienteRepository(em);
		ConsultaRepository consultaRepository=new ConsultaRepository(em);

		Medico medico=medicoRepository.buscarPorId(1L);
		System.out.println(medico);
		
		
		Paciente paciente=pacienteRepository.buscarPorId(1L);
		System.out.println(paciente);
		
		List<Paciente> pacientes=pacienteRepository.buscarPorNome("Leticia");

		for(Paciente p: pacientes) {
			System.out.println(p);
		}
		
		/*List<Medico> medico2=medicoRepository.buscarPorNome("Rafael");
		System.out.println(medico);*/
		
		
		List<Medico> medicos=medicoRepository.buscarTodos();
		
		for(Medico m: medicos) {
			System.out.println(m);
		}
		
		em.close();
		emf.close();

	}

}
