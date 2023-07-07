package webhook.entity;

import java.io.Serializable;
import java.util.Date;

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
	private String card_id;

	private String first_six_digits;

	private String last_four_digits;

	private String brand;

	private String holder_name;

	private String holder_document;

	private Integer exp_month;

	private Integer exp_year;

	private String card_status;

	private String type;

	private String label;

	private Date created_at;

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

	public CardEntity(String card_id, String first_six_digits, String last_four_digits, String brand, String holder_name,
			String holder_document, Integer exp_month, Integer exp_year, String card_status, String type, String label,
			Date created_at, Date updated_at, LastTransactionEntity last_transaction,
			BillingAddressEntity billingAddress) {
		super();
		this.card_id = card_id;
		this.first_six_digits = first_six_digits;
		this.last_four_digits = last_four_digits;
		this.brand = brand;
		this.holder_name = holder_name;
		this.holder_document = holder_document;
		this.exp_month = exp_month;
		this.exp_year = exp_year;
		this.card_status = card_status;
		this.type = type;
		this.label = label;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.last_transaction = last_transaction;
		this.billingAddress = billingAddress;
	}

}
