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
@SequenceGenerator(sequenceName = "SEQ_HOME_PHONE_ID", name = "SEQ_HOME_PHONE_ID", allocationSize = 1)
public class HomePhoneEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_HOME_PHONE_ID")
    @Column(name = "home_phone_id", unique = true, nullable = false)
    private Long home_phone_id;

	@Column(name = "country_code")
	private String country_code;

	@Column(name = "phone_number")
	private String number;

	@Column(name = "area_code")
	private String area_code;

	public Long getHome_phone_id() {
		return home_phone_id;
	}

	public void setHome_phone_id(Long home_phone_id) {
		this.home_phone_id = home_phone_id;
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

	public HomePhoneEntity(Long home_phone_id, String country_code, String number, String area_code) {
		super();
		this.home_phone_id = home_phone_id;
		this.country_code = country_code;
		this.number = number;
		this.area_code = area_code;
	}

}
