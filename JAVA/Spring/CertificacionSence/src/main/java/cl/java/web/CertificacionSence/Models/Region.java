package cl.java.web.CertificacionSence.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name="regions")
	public class Region {
	private Long region_id;
	private String region_name;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="countries_id")
	private Region region;

	public Region() {
		super();
	}

	public Long getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Long region_id) {
		this.region_id = region_id;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
}

