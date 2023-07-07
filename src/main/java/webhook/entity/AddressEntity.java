package webhook.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addresses", schema = "DUMMY")
public class AddressEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "address_id")
	private String address_id;

	@Column(name = "line_1")
	private String line_1;

	@Column(name = "line_2")
	private String line_2;

	@Column(name = "zip_code")
	private String zip_code;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "status")
	private String status;
	
	@Column(name = "created_at")
	private Date created_at;

	@Column(name = "updated_at")
	private Date updated_at;

	@OneToOne(mappedBy = "addresses")
	private CustomerEntity customer;

	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
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

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public AddressEntity() {
		super();
	}

	public AddressEntity(String address_id, String line_1, String line_2, String zip_code, String city, String state,
			String country, String status, Date created_at, Date updated_at, CustomerEntity customer) {
		super();
		this.address_id = address_id;
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
