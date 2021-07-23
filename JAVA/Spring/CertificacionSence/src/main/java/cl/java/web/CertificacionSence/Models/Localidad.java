package cl.java.web.CertificacionSence.Models;
	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



	@Entity
	@Table(name="locations")
	public class Localidad {
		private Long location_id;
		private String address;
		private String postal_code;
		private String city;
		private String state;
		private Long country_id;
		
		@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="countries_id")
	    private Paises p;
		
		@OneToMany(fetch = FetchType.LAZY)
		 @JoinColumn(name="countries_id")
	    private Paises paises;
		

		public Localidad() {
			super();
		}


		public Long getLocation_id() {
			return location_id;
		}


		public void setLocation_id(Long location_id) {
			this.location_id = location_id;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getPostal_code() {
			return postal_code;
		}


		public void setPostal_code(String postal_code) {
			this.postal_code = postal_code;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public Long getCountry_id() {
			return country_id;
		}


		public void setCountry_id(Long country_id) {
			this.country_id = country_id;
		}


		public Paises getP() {
			return p;
		}


		public void setP(Paises p) {
			this.p = p;
		}


		public Paises getPaises() {
			return paises;
		}


		public void setPaises(Paises paises) {
			this.paises = paises;
		}


		
	}
