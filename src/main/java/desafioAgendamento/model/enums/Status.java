package desafioAgendamento.model.enums;

public enum Status {
	MARCADA("Marcada"),
	CANCELADA("Cancelada"),
	REALIZADA("Realizada");
	
	private String descricao;
	
	Status(String descricao){
		this.descricao=descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}
