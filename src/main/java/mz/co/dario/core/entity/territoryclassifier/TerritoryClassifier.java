package mz.co.dario.core.entity.territoryclassifier;

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

import mz.co.dario.core.entity.simpleentity.AdministrativePost;
import mz.co.dario.core.entity.simpleentity.Country;
import mz.co.dario.core.entity.simpleentity.District;
import mz.co.dario.core.entity.simpleentity.Locality;
import mz.co.dario.core.entity.simpleentity.Province;
import mz.co.dario.core.entity.util.LifeCycleEntity;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "TERRITORY_CLASSIFIER")
public abstract class TerritoryClassifier extends LifeCycleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "TYPE", insertable = false, updatable = false)
	private String type;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_ID", insertable = false, updatable = false)
	private Country country;

	@Column(name = "COUNTRY_ID")
	private Long countryId;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROVINCE_ID", insertable = false, updatable = false)
	private Province province;

	@Column(name = "PROVINCE_ID")
	private Long provinceId;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADMINISTRATIVE_POST_ID", insertable = false, updatable = false)
	private AdministrativePost administrativePost;

	@Column(name = "ADMINISTRATIVE_POST_ID")
	private Long administrativePostId;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DISTRICT_ID", insertable = false, updatable = false)
	private District district;

	@Column(name = "DISTRICT_ID")
	private Long districtId;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOCALITY_ID", insertable = false, updatable = false)
	private Locality locality;

	@Column(name = "LOCALITY_ID")
	private Long localityId;

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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public AdministrativePost getAdministrativePost() {
		return administrativePost;
	}

	public void setAdministrativePost(AdministrativePost administrativePost) {
		this.administrativePost = administrativePost;
	}

	public Long getAdministrativePostId() {
		return administrativePostId;
	}

	public void setAdministrativePostId(Long administrativePostId) {
		this.administrativePostId = administrativePostId;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Locality getLocality() {
		return locality;
	}

	public void setLocality(Locality locality) {
		this.locality = locality;
	}

	public Long getLocalityId() {
		return localityId;
	}

	public void setLocalityId(Long localityId) {
		this.localityId = localityId;
	}

}
