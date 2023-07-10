package pagarme.model;

import java.util.Date;

public class CustomerModel {

    private Long customer_id;
	
	private String id;

	private String name;

	private String email;

	private String code;

	private String document;

	private String document_type;

	private String type;

	private String gender;

	private boolean delinquent;

	private AddressModel address;

	private Date created_at;

	private Date updated_at;

	private Date birthdate;

	private PhonesModel phones;

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

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

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
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

	public PhonesModel getPhones() {
		return phones;
	}

	public void setPhones(PhonesModel phones) {
		this.phones = phones;
	}

	public CustomerModel() {
		super();
	}

	public CustomerModel(Long customer_id, String id, String name, String email, String code, String document,
			String document_type, String type, String gender, boolean delinquent, AddressModel address,
			Date created_at, Date updated_at, Date birthdate, PhonesModel phones) {
		super();
		this.customer_id = customer_id;
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
