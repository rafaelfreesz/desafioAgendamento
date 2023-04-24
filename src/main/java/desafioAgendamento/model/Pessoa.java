package desafioAgendamento.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pessoa {
	
	private Long id;
	private String nome;
	private String cpf;
	private Date dataDeNascimento;
	private String sexo;
	private Set<Consulta> consultas = new HashSet<>();
	
		
	public Pessoa() {}
	
	public Pessoa(Long id, String nome, String cpf, Date dataDeNascimento, String sexo) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Set<Consulta> getConsultas() {
		return consultas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento
				+ ", sexo=" + sexo + "]";
	}
	
	
	

}
