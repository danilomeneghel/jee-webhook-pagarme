package webhook.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "card", schema = "DUMMY")
public class CardEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "card_id")
	private String card_id;

	@Column(name = "first_six_digits")
	private String first_six_digits;

	@Column(name = "last_four_digits")
	private String last_four_digits;

	@Column(name = "card_brand")
	private String card_brand;

	@Column(name = "holder_name")
	private String holder_name;

	@Column(name = "holder_document")
	private String holder_document;

	@Column(name = "exp_month")
	private Integer exp_month;

	@Column(name = "exp_year")
	private Integer exp_year;

	@Column(name = "card_status")
	private String card_status;

	@Column(name = "card_type")
	private String card_type;

	@Column(name = "card_label")
	private String card_label;

	@Column(name = "created_at")
	private Date created_at;

	@Column(name = "updated_at")
	private Date updated_at;
	
	@OneToOne(mappedBy = "card")
	private LastTransactionEntity last_transaction;

	@Embedded
	private BillingAddressEntity billingAddress;

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

	public LastTransactionEntity getLast_transaction() {
		return last_transaction;
	}

	public void setLast_transaction(LastTransactionEntity last_transaction) {
		this.last_transaction = last_transaction;
	}

	public BillingAddressEntity getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddressEntity billingAddress) {
		this.billingAddress = billingAddress;
	}

	public CardEntity() {
		super();
	}

	public CardEntity(String card_id, String first_six_digits, String last_four_digits, String card_brand,
			String holder_name, String holder_document, Integer exp_month, Integer exp_year, String card_status,
			String card_type, String card_label, Date created_at, Date updated_at,
			LastTransactionEntity last_transaction, BillingAddressEntity billingAddress) {
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
