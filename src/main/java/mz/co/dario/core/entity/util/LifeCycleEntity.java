package mz.co.dario.core.entity.util;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class LifeCycleEntity {
	private Timestamp creationDate;
	private Long creationBy;
	private Timestamp updateDate;
	private Long updateBy;
	private Timestamp activationDate;
	private Long activationBy;
	private int state = IObjectState.DELETED;
	private boolean active = IObjectState.ACTIVE;

	@Column(name = "CREATION_DATE")
	public Timestamp getCrestionDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp crestionDate) {
		this.creationDate = crestionDate;
	}

	@Column(name = "CREATED_BY")
	public Long getCreationBy() {
		return creationBy;
	}

	public void setCrestionBy(Long crestionBy) {
		this.creationBy = crestionBy;
	}

	@Column(name = "UPDATED_DATE")
	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "UPDATED_BY")
	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	@Column(name = "ACTIVATED_DATE")
	public Timestamp getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Timestamp activationDate) {
		this.activationDate = activationDate;
	}

	@Column(name = "ACTIVATED_BY")
	public Long getActivationBy() {
		return activationBy;
	}

	public void setActivationBy(Long activationBy) {
		this.activationBy = activationBy;
	}

	@Column(name = "STATE")
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Column(name = "ACTIVE")
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
