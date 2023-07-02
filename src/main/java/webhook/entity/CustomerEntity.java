package webhook.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String name;

	private String email;

	private String code;

	private String document;

	private String document_type;

	private String type;

	private String gender;

	private boolean delinquent;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity address;

	private Date created_at;

	private Date updated_at;

	private Date birthdate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "phones_id")
	private PhonesEntity phones;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getDocument_type() {
		return document_type;
	}

	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isDelinquent() {
		return delinquent;
	}

	public void setDelinquent(boolean delinquent) {
		this.delinquent = delinquent;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public PhonesEntity getPhones() {
		return phones;
	}

	public void setPhones(PhonesEntity phones) {
		this.phones = phones;
	}

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(String id, String name, String email, String code, String document, String document_type,
			String type, String gender, boolean delinquent, AddressEntity address, Date created_at, Date updated_at,
			Date birthdate, PhonesEntity phones) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.code = code;
		this.document = document;
		this.document_type = document_type;
		this.type = type;
		this.gender = gender;
		this.delinquent = delinquent;
		this.address = address;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.birthdate = birthdate;
		this.phones = phones;
	}

}