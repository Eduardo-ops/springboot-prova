package exercicioprova.exercicioprova.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Accounting extends Auditing implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;

	@Column(name = "type")
	private String type;
	@Column(name = "description")
	private String description;
	@Column(name = "date")
	private Date date;
	@Column(name = "value")
	private Double value;
	@Column(name = "profit")
	private Double profit;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Auditing> auditings = new ArrayList<Auditing>();

	public Accounting() {
	}

	public Accounting(Long code, String type, String description, Date date, Double value, Double profit) {
		this.code = code;
		this.type = type;
		this.description = description;
		this.date = date;
		this.value = value;
		this.profit = profit;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
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

	public List<Auditing> getAuditings() {
		return auditings;
	}

	public void setAuditings(List<Auditing> auditings) {
		this.auditings = auditings;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accounting other = (Accounting) obj;
		return Objects.equals(code, other.code);
	}

}
