package desafioAgendamento.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

import desafioAgendamento.model.enums.Especializacao;
import desafioAgendamento.model.enums.Sexo;

@Entity
@Table(name="tb_medico")
public class Medico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@NotEmpty
	@Column(nullable=false, length=150)
	private String nome;
	
	@NotEmpty
	@Column(nullable=false, length=14)
	private String cpf;
	
	@NotNull
	@Past
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Date dtNascimento;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Sexo sexo;
	
	@NotEmpty
	@Column(nullable=false, length=8)
	private String crm;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column
	private Especializacao especializacao;
	
	@OneToMany(mappedBy="medico", cascade = CascadeType.ALL)
	private List<Consulta> consultas = new ArrayList<>();
	

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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Especializacao getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(Especializacao especializacao) {
		this.especializacao = especializacao;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}
	
	

	public String getCrm() {
		return crm;
	}


	public void setCrm(String crm) {
		this.crm = crm;
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
		Medico other = (Medico) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Medico [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", crm=" + crm + ", dtNascimento="
				+ dtNascimento + ", sexo=" + sexo + ", especializacao=" + especializacao + ", consultas=" + consultas
				+ "]";
	}

	
	
	

}
