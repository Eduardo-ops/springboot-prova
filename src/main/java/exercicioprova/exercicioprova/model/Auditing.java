package exercicioprova.exercicioprova.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import java.util.Date;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.parsing.Location;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
//@EntityListeners(AuditingEntityListener.class)
public class Auditing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;

	private Date date;

	@ManyToOne
	private Accounting accounting;

	@JoinColumn
	private int identifier;

	@CreatedBy
	protected String createBy;

	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	protected Date createDate;

	@LastModifiedBy
	protected String lastModifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	protected Date lastModifiedByDate;

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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedByDate() {
		return lastModifiedByDate;
	}

	public void setLastModifiedByDate(Date lastModifiedByDate) {
		this.lastModifiedByDate = lastModifiedByDate;
	}

	public Accounting getAccounting() {
		return accounting;
	}

	public void setAccounting(Accounting accounting) {
		this.accounting = accounting;
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
