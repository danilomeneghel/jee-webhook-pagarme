package webhook.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "home_phone", schema = "DUMMY")
public class HomePhoneEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "home_phone_sequence")
    @SequenceGenerator(name = "home_phone_sequence", sequenceName = "HOME_PHONE_SEQ", allocationSize = 1)
    @Column(name = "id_home_phone", unique = true, nullable = false)
    private Long id;
	
	@Column(name = "country_code")
	private String country_code;

	@Column(name = "number")
	private String number;

	@Column(name = "area_code")
	private String area_code;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public HomePhoneEntity() {
		super();
	}

	public HomePhoneEntity(Long id, String country_code, String number, String area_code) {
		super();
		this.id = id;
		this.country_code = country_code;
		this.number = number;
		this.area_code = area_code;
	}

}