package pagarme.model;

import java.io.Serializable;

public class MobilePhoneModel implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long mobile_phone_id;

	private String country_code;

	private String number;

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

	public MobilePhoneModel() {
		super();
	}

	public MobilePhoneModel(Long mobile_phone_id, String country_code, String number, String area_code) {
		super();
		this.mobile_phone_id = mobile_phone_id;
		this.country_code = country_code;
		this.number = number;
		this.area_code = area_code;
	}

}
