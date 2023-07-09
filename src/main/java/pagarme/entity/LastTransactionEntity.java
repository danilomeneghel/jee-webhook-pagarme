package pagarme.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "last_transaction")
public class LastTransactionEntity {

	@Id
	@Column(name = "last_transaction_id")
	private String last_transaction_id;

	@Column(name = "transaction_type")
	private String transaction_type;

	@Column(name = "gateway_id")
	private String gateway_id;

	@Column(name = "amount")
	private double amount;

	@Column(name = "status")
	private String status;

	@Column(name = "success")
	private boolean success;

	@Column(name = "installments")
	private int installments;

	@Column(name = "statement_descriptor")
	private String statement_descriptor;

	@Column(name = "acquirer_name")
	private String acquirer_name;

	@Column(name = "acquirer_tid")
	private String acquirer_tid;

	@Column(name = "acquirer_nsu")
	private String acquirer_nsu;

	@Column(name = "acquirer_auth_code")
	private String acquirer_auth_code;

	@Column(name = "acquirer_message")
	private String acquirer_message;

	@Column(name = "acquirer_return_code")
	private String acquirer_return_code;

	@Column(name = "operation_type")
	private String operation_type;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "card_id")
	private CardEntity card;

	@Column(name = "funding_source")
	private String funding_source;

	@Column(name = "created_at")
	private Date created_at;

	@Column(name = "updated_at")
	private Date updated_at;

	/*@Embedded
	@Column(name = "gateway_response")
	private GatewayResponseEntity gateway_response;

	@Embedded
	@Column(name = "antifraud_response")
	private AntifraudResponseEntity antifraud_response;

	@ElementCollection
	@CollectionTable(name = "last_transaction_metadata", joinColumns
	= @JoinColumn(name = "last_transaction_id"))
	@MapKeyColumn(name = "metadata_key")
	@Column(name = "metadata_value")
	private Map<String, String> metadata;*/

	@ManyToOne
	@JoinColumn(name = "charge_id")
	private ChargeEntity charge;

	public String getLast_transaction_id() {
		return last_transaction_id;
	}

	public void setLast_transaction_id(String last_transaction_id) {
		this.last_transaction_id = last_transaction_id;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getGateway_id() {
		return gateway_id;
	}

	public void setGateway_id(String gateway_id) {
		this.gateway_id = gateway_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getInstallments() {
		return installments;
	}

	public void setInstallments(int installments) {
		this.installments = installments;
	}

	public String getStatement_descriptor() {
		return statement_descriptor;
	}

	public void setStatement_descriptor(String statement_descriptor) {
		this.statement_descriptor = statement_descriptor;
	}

	public String getAcquirer_name() {
		return acquirer_name;
	}

	public void setAcquirer_name(String acquirer_name) {
		this.acquirer_name = acquirer_name;
	}

	public String getAcquirer_tid() {
		return acquirer_tid;
	}

	public void setAcquirer_tid(String acquirer_tid) {
		this.acquirer_tid = acquirer_tid;
	}

	public String getAcquirer_nsu() {
		return acquirer_nsu;
	}

	public void setAcquirer_nsu(String acquirer_nsu) {
		this.acquirer_nsu = acquirer_nsu;
	}

	public String getAcquirer_auth_code() {
		return acquirer_auth_code;
	}

	public void setAcquirer_auth_code(String acquirer_auth_code) {
		this.acquirer_auth_code = acquirer_auth_code;
	}

	public String getAcquirer_message() {
		return acquirer_message;
	}

	public void setAcquirer_message(String acquirer_message) {
		this.acquirer_message = acquirer_message;
	}

	public String getAcquirer_return_code() {
		return acquirer_return_code;
	}

	public void setAcquirer_return_code(String acquirer_return_code) {
		this.acquirer_return_code = acquirer_return_code;
	}

	public String getOperation_type() {
		return operation_type;
	}

	public void setOperation_type(String operation_type) {
		this.operation_type = operation_type;
	}

	public CardEntity getCard() {
		return card;
	}

	public void setCard(CardEntity card) {
		this.card = card;
	}

	public String getFunding_source() {
		return funding_source;
	}

	public void setFunding_source(String funding_source) {
		this.funding_source = funding_source;
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

	public ChargeEntity getCharge() {
		return charge;
	}

	public void setCharge(ChargeEntity charge) {
		this.charge = charge;
	}

	public LastTransactionEntity() {
		super();
	}

	public LastTransactionEntity(String last_transaction_id, String transaction_type, String gateway_id, double amount,
			String status, boolean success, int installments, String statement_descriptor, String acquirer_name,
			String acquirer_tid, String acquirer_nsu, String acquirer_auth_code, String acquirer_message,
			String acquirer_return_code, String operation_type, CardEntity card, String funding_source, Date created_at,
			Date updated_at, ChargeEntity charge) {
		super();
		this.last_transaction_id = last_transaction_id;
		this.transaction_type = transaction_type;
		this.gateway_id = gateway_id;
		this.amount = amount;
		this.status = status;
		this.success = success;
		this.installments = installments;
		this.statement_descriptor = statement_descriptor;
		this.acquirer_name = acquirer_name;
		this.acquirer_tid = acquirer_tid;
		this.acquirer_nsu = acquirer_nsu;
		this.acquirer_auth_code = acquirer_auth_code;
		this.acquirer_message = acquirer_message;
		this.acquirer_return_code = acquirer_return_code;
		this.operation_type = operation_type;
		this.card = card;
		this.funding_source = funding_source;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.charge = charge;
	}

}
