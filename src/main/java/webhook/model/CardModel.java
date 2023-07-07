package webhook.model;

import java.io.Serializable;
import java.util.Date;

public class CardModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String card_id;

	private String first_six_digits;

	private String last_four_digits;

	private String card_brand;

	private String holder_name;

	private String holder_document;

	private Integer exp_month;

	private Integer exp_year;

	private String card_status;

	private String card_type;

	private String card_label;

	private Date created_at;

	private Date updated_at;

	private LastTransactionModel last_transaction;

	private BillingAddressModel billingAddress;

	public String getCard_id() {
		return card_id;
	}

	public void setCard_id(String card_id) {
		this.card_id = card_id;
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

	public String getCard_brand() {
		return card_brand;
	}

	public void setCard_brand(String card_brand) {
		this.card_brand = card_brand;
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

	public Integer getExp_month() {
		return exp_month;
	}

	public void setExp_month(Integer exp_month) {
		this.exp_month = exp_month;
	}

	public Integer getExp_year() {
		return exp_year;
	}

	public void setExp_year(Integer exp_year) {
		this.exp_year = exp_year;
	}

	public String getCard_status() {
		return card_status;
	}

	public void setCard_status(String card_status) {
		this.card_status = card_status;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getCard_label() {
		return card_label;
	}

	public void setCard_label(String card_label) {
		this.card_label = card_label;
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

	public LastTransactionModel getLast_transaction() {
		return last_transaction;
	}

	public void setLast_transaction(LastTransactionModel last_transaction) {
		this.last_transaction = last_transaction;
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

	public CardModel(String card_id, String first_six_digits, String last_four_digits, String card_brand,
			String holder_name, String holder_document, Integer exp_month, Integer exp_year, String card_status,
			String card_type, String card_label, Date created_at, Date updated_at,
			LastTransactionModel last_transaction, BillingAddressModel billingAddress) {
		super();
		this.card_id = card_id;
		this.first_six_digits = first_six_digits;
		this.last_four_digits = last_four_digits;
		this.card_brand = card_brand;
		this.holder_name = holder_name;
		this.holder_document = holder_document;
		this.exp_month = exp_month;
		this.exp_year = exp_year;
		this.card_status = card_status;
		this.card_type = card_type;
		this.card_label = card_label;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.last_transaction = last_transaction;
		this.billingAddress = billingAddress;
	}

}
