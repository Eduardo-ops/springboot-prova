package exercicioprova.exercicioprova.enums;

import java.util.stream.Stream;

public enum AccountingType {

	CONTA_CORRENTE(1, "Conta corrente"), CONTA_POUPANÇA(2, "Conta poupança");

	private int code;
	private String description;

	private AccountingType(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
