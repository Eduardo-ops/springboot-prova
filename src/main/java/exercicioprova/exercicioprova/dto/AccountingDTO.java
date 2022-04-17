package exercicioprova.exercicioprova.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import exercicioprova.exercicioprova.enums.AccountingType;
import exercicioprova.exercicioprova.model.Accounting;

public class AccountingDTO {

	@NotNull(message = "O tipo não pode ser nulo")
	@NotEmpty(message = "O tipo não pode ser vazio.")
	private Integer type;

	@NotNull(message = "O descrição não pode ser nula.")
	@NotEmpty(message = "O descrição não pode ser vazia.")
	private String description;

	@NotNull(message = "A data não pode ser nula")
	@NotEmpty(message = "A data não pode ser vazia.")
	private Date date;

	@NotNull(message = "O valor não pode ser nulo")
	@NotEmpty(message = "O valor não pode ser vazio.")
	private Double value;

	@NotNull(message = "O lucro não pode ser nulo")
	@NotEmpty(message = "O lucro não pode ser vazio.")
	private Double profit;

	public AccountingDTO() {
	}

	public AccountingDTO(Accounting accounting) {
		//this.type = accounting.getType().getCode();
		this.description = accounting.getDescription();
		this.date = accounting.getDate();
		this.value = accounting.getValue();
		this.profit = accounting.getProfit();
	}

	public AccountingDTO(Integer type, String description, Date date, Double value, Double profit) {
		super();
		this.type = type;
		this.description = description;
		this.date = date;
		this.value = value;
		this.profit = profit;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

}
