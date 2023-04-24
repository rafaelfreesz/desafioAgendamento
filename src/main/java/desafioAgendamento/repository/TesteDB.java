package desafioAgendamento.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteDB {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DbAgendamento");

		EntityManager em = emf.createEntityManager();

		//List<Empresa> lista = em.createQuery("from Empresa", Empresa.class).getResultList();

		//System.out.println(lista);

		em.close();
		emf.close();

	}

}
