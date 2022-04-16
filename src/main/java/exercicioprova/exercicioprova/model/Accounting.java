package exercicioprova.exercicioprova.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import exercicioprova.exercicioprova.enums.AccountingType;

@Entity
public class Accounting implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String code;

	@Column()
	private AccountingType type;
	@Column()
	private String description;
	@Column()
	private Date date;
	@Column()
	private Double value;
	@Column()
	private Double profit;

	public Accounting() {
	}

	public Accounting(AccountingType type, String description, Date date, Double value, Double profit) {
		this.type = type;
		this.description = description;
		this.date = date;
		this.value = value;
		this.profit = profit;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public AccountingType getType() {
		return type;
	}

	public void setType(AccountingType type) {
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
