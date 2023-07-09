package pagarme.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_phone", schema = "DUMMY")
public class MobilePhoneEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MOBILE_PHONE_ID")
	@SequenceGenerator(sequenceName = "SEQ_MOBILE_PHONE_ID", name = "SEQ_MOBILE_PHONE_ID", allocationSize = 1)
    @Column(name = "mobile_phone_id", unique = true, nullable = false)
    private Long mobile_phone_id;

	@Column(name = "country_code")
	private String country_code;

	@Column(name = "phone_number")
	private String number;

	@Column(name = "area_code")
	private String area_code;

	public Long getMobile_phone_id() {
		return mobile_phone_id;
	}

	public void setMobile_phone_id(Long mobile_phone_id) {
		this.mobile_phone_id = mobile_phone_id;
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

	public MobilePhoneEntity() {
		super();
	}

	public MobilePhoneEntity(Long mobile_phone_id, String country_code, String number, String area_code) {
		super();
		this.mobile_phone_id = mobile_phone_id;
		this.country_code = country_code;
		this.number = number;
		this.area_code = area_code;
	}

}
