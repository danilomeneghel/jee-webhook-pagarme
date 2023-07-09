package pagarme.model;

public class HomePhoneModel {

    private Long home_phone_id;

	private String country_code;

	private String number;

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

	public HomePhoneModel() {
		super();
	}

	public HomePhoneModel(Long home_phone_id, String country_code, String number, String area_code) {
		super();
		this.home_phone_id = home_phone_id;
		this.country_code = country_code;
		this.number = number;
		this.area_code = area_code;
	}

}
