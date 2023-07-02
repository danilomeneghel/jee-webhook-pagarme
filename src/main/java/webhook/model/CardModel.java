package webhook.model;

import java.util.Date;

public class CardModel {

	private String id;

	private String first_six_digits;

	private String last_four_digits;

	private String brand;

	private String holder_name;

	private String holder_document;

	private int exp_month;

	private int exp_year;

	private String status;

	private String type;

	private String label;

	private Date created_at;

	private Date updated_at;

	private BillingAddressModel billingAddress;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_six_digits() {
		return first_six_digits;
	}

	public void setFirst_six_digits(String first_six_digits) {
		this.first_six_digits = first_six_digits;
	}

	public String getLast_four_digits() {
		return last_four_digits;
	}

	public void setLast_four_digits(String last_four_digits) {
		this.last_four_digits = last_four_digits;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public String getHolder_document() {
		return holder_document;
	}

	public void setHolder_document(String holder_document) {
		this.holder_document = holder_document;
	}

	public int getExp_month() {
		return exp_month;
	}

	public void setExp_month(int exp_month) {
		this.exp_month = exp_month;
	}

	public int getExp_year() {
		return exp_year;
	}

	public void setExp_year(int exp_year) {
		this.exp_year = exp_year;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
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

	public BillingAddressModel getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddressModel billingAddress) {
		this.billingAddress = billingAddress;
	}

	public CardModel() {
		super();
	}

	public CardModel(String id, String first_six_digits, String last_four_digits, String brand, String holder_name,
			String holder_document, int exp_month, int exp_year, String status, String type, String label,
			Date created_at, Date updated_at, BillingAddressModel billingAddress) {
		super();
		this.id = id;
		this.first_six_digits = first_six_digits;
		this.last_four_digits = last_four_digits;
		this.brand = brand;
		this.holder_name = holder_name;
		this.holder_document = holder_document;
		this.exp_month = exp_month;
		this.exp_year = exp_year;
		this.status = status;
		this.type = type;
		this.label = label;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.billingAddress = billingAddress;
	}

}
