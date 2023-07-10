package pagarme.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ADDRESS_ID")
	@SequenceGenerator(sequenceName = "SEQ_ADDRESS_ID", name = "SEQ_ADDRESS_ID", allocationSize = 1)
    @Column(name = "address_id", unique = true, nullable = false)
    private Long address_id;
	
	@Column(name = "uuid")
	private String id;

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

	public Long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}

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

	public AddressEntity() {
		super();
	}

	public AddressEntity(Long address_id, String id, String line_1, String line_2, String zip_code, String city,
			String state, String country, String status, Date created_at, Date updated_at) {
		super();
		this.address_id = address_id;
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
	}

}
