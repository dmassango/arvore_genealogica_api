package mz.co.dario.core.entity.simpleentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import mz.co.dario.core.entity.util.CodeEntity;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "SIMPLE_ENTITY")
public abstract class SimpleEntity extends CodeEntity implements Serializable{

	private static final long serialVersionUID = 9126983535190279217L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name = "TYPE", insertable = false, updatable = false)
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "type", insertable = false, updatable = false)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
