package desafioAgendamento.model;

import java.util.Date;
import java.util.Objects;

import desafioAgendamento.model.enums.Status;

public class Consulta {
	
	private Integer id;
	private Date dataHoraAgendamento;
	private String descricao;
	private Medico medico;
	private Paciente paciente;
	private Status status;
	
	public Consulta() {}

	public Consulta(Integer id, Date dataHoraAgendamento, String descricao, Medico medico, Paciente paciente,
			Status status) {
		this.id = id;
		this.dataHoraAgendamento = dataHoraAgendamento;
		this.descricao = descricao;
		this.medico = medico;
		this.paciente = paciente;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
