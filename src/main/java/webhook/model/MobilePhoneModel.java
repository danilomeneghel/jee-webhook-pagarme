package webhook.model;

public class MobilePhoneModel {

	private String country_code;

	private String number;

	private String area_code;

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

	public MobilePhoneModel(String country_code, String number, String area_code) {
		super();
		this.country_code = country_code;
		this.number = number;
		this.area_code = area_code;
	}

}
