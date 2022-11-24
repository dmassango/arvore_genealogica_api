package mz.co.dario.core.entity.person;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import mz.co.dario.core.entity.territoryclassifier.BirthPlace;
import mz.co.dario.core.entity.util.LifeCycleEntity;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "PERSON")
public abstract class Person extends LifeCycleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "TYPE", insertable = false, updatable = false)
	private String type;
	
	@Column(name = "NORMALIZED_FULL_NAME")
	private String normalizedFullName;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BIRTH_PLACE_ID", insertable = false, updatable = false)
	private BirthPlace birthPlace;

	@Column(name = "BIRTH_PLACE_ID")
	private Long birthPlaceId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNormalizedFullName() {
		return normalizedFullName;
	}

	public void setNormalizedFullName(String normalizedFullName) {
		this.normalizedFullName = normalizedFullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public BirthPlace getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(BirthPlace birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Long getBirthPlaceId() {
		return birthPlaceId;
	}

	public void setBirthPlaceId(Long birthPlaceId) {
		this.birthPlaceId = birthPlaceId;
	}
}
