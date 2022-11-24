package mz.co.dario.core.entity.family;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import mz.co.dario.core.entity.person.Father;
import mz.co.dario.core.entity.person.Mother;
import mz.co.dario.core.entity.person.Son;

@Entity
@Table(name = "FAMILY_BORN")
@SequenceGenerator(name = "GENERATOR", sequenceName = "FILHO_SEQUENCE", initialValue = 100, allocationSize = 1)
public class FamilyBorn {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FATHER_ID", insertable = false, updatable = false)
	private Father father;

	@Column(name = "FATHER_ID")
	private Long fatherId;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MOTHER_ID", insertable = false, updatable = false)
	private Mother mother;

	@Column(name = "MOTHER_ID")
	private Long motherId;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SON_ID", insertable = false, updatable = false)
	private Son son;

	@Column(name = "SON_ID")
	private Long sonId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public Long getFatherId() {
		return fatherId;
	}

	public void setFatherId(Long fatherId) {
		this.fatherId = fatherId;
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public Long getMotherId() {
		return motherId;
	}

	public void setMotherId(Long motherId) {
		this.motherId = motherId;
	}

	public Son getSon() {
		return son;
	}

	public void setSon(Son son) {
		this.son = son;
	}

	public Long getSonId() {
		return sonId;
	}

	public void setSonId(Long sonId) {
		this.sonId = sonId;
	}

}
