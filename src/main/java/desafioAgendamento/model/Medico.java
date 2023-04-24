package desafioAgendamento.model;

import java.util.Date;
import java.util.Objects;

import desafioAgendamento.model.enums.Especializacao;

public class Medico extends Pessoa {
	
	private String crm;
	private Especializacao especializacao;
	
	public Medico() {
		super();
	}

	public Medico(Long id, String nome, String cpf, Date dataDeNascimento, String sexo, String crm, Especializacao especializacao) {
		super(id, nome, cpf, dataDeNascimento, sexo);
		this.crm = crm;
		this.especializacao = especializacao;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Especializacao getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(Especializacao especializacao) {
		this.especializacao = especializacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(crm);
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
		Medico other = (Medico) obj;
		return Objects.equals(crm, other.crm);
	}

	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", especializacao=" + especializacao + "]";
	}
	
	

	
	
}
