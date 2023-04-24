package desafioAgendamento.model.enums;

public enum Especializacao {
	CARDIO("Cardiologista"),
	ORTO("Ortopedista"),
	OTORRINO("Otorrinolaringologista"),
	CLINICO_GERAL("Clínico Geral");
	
	private String descricao;
	
	Especializacao(String descricao){
		this.descricao=descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}
