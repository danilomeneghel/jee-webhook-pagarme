package webhook.model;

public class BillingAddressModel {

	private String street;

	private String number;

	private String complement;

	private String zip_code;

	private String neighborhood;

	private String city;

	private String state;

	private String country;

	private String line1;

	private String line2;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public BillingAddressModel() {
		super();
	}

	public BillingAddressModel(String street, String number, String complement, String zip_code, String neighborhood,
			String city, String state, String country, String line1, String line2) {
		super();
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.zip_code = zip_code;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.country = country;
		this.line1 = line1;
		this.line2 = line2;
	}

}