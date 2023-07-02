package webhook.model;

import java.util.Date;

public class AddressModel {

	private String id;

	private String line_1;

	private String line_2;

	private String zip_code;

	private String city;

	private String state;

	private String country;

	private String status;

	private Date created_at;

	private Date updated_at;

	private CustomerModel customer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLine_1() {
		return line_1;
	}

	public void setLine_1(String line_1) {
		this.line_1 = line_1;
	}

	public String getLine_2() {
		return line_2;
	}

	public void setLine_2(String line_2) {
		this.line_2 = line_2;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}

	public AddressModel() {
		super();
	}

	public AddressModel(String id, String line_1, String line_2, String zip_code, String city, String state,
			String country, String status, Date created_at, Date updated_at, CustomerModel customer) {
		super();
		this.id = id;
		this.line_1 = line_1;
		this.line_2 = line_2;
		this.zip_code = zip_code;
		this.city = city;
		this.state = state;
		this.country = country;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.customer = customer;
	}

}
