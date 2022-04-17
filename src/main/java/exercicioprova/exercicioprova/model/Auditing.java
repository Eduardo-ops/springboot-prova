package exercicioprova.exercicioprova.model;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auditing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identifier;

	private Long code;
	private Date date;

	public Auditing() {
	}

	public Auditing(int identifier, Long code, Date date) {
		this.identifier = identifier;
		this.code = code;
		this.date = date;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
		Auditing other = (Auditing) obj;
		return Objects.equals(code, other.code);
	}

}
