package desafioAgendamento.model;

import java.util.Date;
import java.util.Objects;

public class Paciente extends Pessoa {
	
	private Integer prontuario;
	
	public Paciente() {
		super();
	}

	public Paciente(Long id, String nome, String cpf, Date dataDeNascimento, String sexo, Integer prontuario) {
		super(id, nome, cpf, dataDeNascimento, sexo);
		this.prontuario = prontuario;
	}

	public Integer getProntuario() {
		return prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(prontuario);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(prontuario, other.prontuario);
	}

	@Override
	public String toString() {
		return "Paciente [prontuario=" + prontuario + "]";
	}
	
	
	
	
}
