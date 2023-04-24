package desafioAgendamento.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_paciente")
public class Paciente implements Serializable{
	
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@Column(nullable=false, length=150)
	private String nome;
	
	@Column(nullable=false, length=11)
	private String cpf;
	
	@Column(name="dt_nascimento", nullable=false)
	private Date dtNascimento;
	
	@Column(nullable=false, length=11)
	private String sexo;
	
	@Column(nullable=false, length=6)
	private Integer prontuario;
	
	@OneToMany(mappedBy="paciente", cascade = CascadeType.ALL)
	private List<Consulta> consultas = new ArrayList<>();
	
	public Paciente() {
		super();
	}

	public Paciente(Long id, String nome, String cpf, Date dtNascimento, String sexo, Integer prontuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.prontuario = prontuario;
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

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getProntuario() {
		return prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	public List<Consulta> getConsultas() {
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
		Paciente other = (Paciente) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dtNascimento=" + dtNascimento + ", sexo="
				+ sexo + ", prontuario=" + prontuario + ", consultas=" + consultas + "]";
	}
	
	



	


	
	
	
}
