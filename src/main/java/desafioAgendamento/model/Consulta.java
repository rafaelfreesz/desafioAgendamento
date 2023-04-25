package desafioAgendamento.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import desafioAgendamento.model.enums.Status;

@Entity
@Table(name="tb_consulta")
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@NotNull
	@Column(name="dt_hora_agendamento", nullable=false)
	private Date dataHoraAgendamento;
	
	@Column(nullable=false)
	private String descricao;

	@NotEmpty
	@ManyToOne
	@JoinColumn(name="fk_medico", nullable=false)
	private Medico medico;
	
	@NotEmpty
	@ManyToOne
	@JoinColumn(name="fk_paciente", nullable=false)
	private Paciente paciente;

	@NotNull
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Consulta() {}

	public Consulta(Long id, Date dataHoraAgendamento, String descricao, Medico medico, Paciente paciente,
			Status status) {
		this.id = id;
		this.dataHoraAgendamento = dataHoraAgendamento;
		this.descricao = descricao;
		this.medico = medico;
		this.paciente = paciente;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataHoraAgendamento() {
		return dataHoraAgendamento;
	}

	public void setDataHoraAgendamento(Date dataHoraAgendamento) {
		this.dataHoraAgendamento = dataHoraAgendamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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
		Consulta other = (Consulta) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", dataHoraAgendamento=" + dataHoraAgendamento + ", descricao=" + descricao + "]";
	}
	
	
	
}
