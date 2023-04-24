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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import desafioAgendamento.model.enums.Especializacao;

@Entity
@Table(name="tb_medico")
@PrimaryKeyJoinColumn(name="fk_pessoa")
public class Medico implements Serializable {
	
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
	private String crm;
	
	@Column(nullable=false, length=11)
	private String sexo;
	
	@Column(nullable=false, length=22)
	@Enumerated(EnumType.STRING)
	private Especializacao especializacao;
	
	@OneToMany(mappedBy="medico",cascade = CascadeType.ALL)
	private List<Consulta> consultas = new ArrayList<>();
	
	public Medico() {
	}

	

	public Medico(Long id, String nome, String cpf, Date dtNascimento, String crm, String sexo,
			Especializacao especializacao) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.crm = crm;
		this.sexo = sexo;
		this.especializacao = especializacao;
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

	public List<Consulta> getConsultas() {
		return consultas;
	}

	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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
		return "Medico [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dtNascimento=" + dtNascimento + ", crm="
				+ crm + ", sexo=" + sexo + ", especializacao=" + especializacao + ", consultas=" + consultas + "]";
	}

	
	


	

	
}
