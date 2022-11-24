package mz.co.dario.core.entity.util;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class CodeEntity extends LifeCycleEntity {
	private String code;
	private String description;

	public String getCode() {
		return code;
	}

	@Column(name = "CODE")
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	@Column(name = "DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

}
