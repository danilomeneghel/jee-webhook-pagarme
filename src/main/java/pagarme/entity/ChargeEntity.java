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
@Table(name = "charge")
public class ChargeEntity {

	@Id
	@Column(name = "charge_id")
	private String charge_id;

	@Column(name = "code")
	private String code;

	@Column(name = "gateway_id")
	private String gateway_id;

	@Column(name = "amount")
	private double amount;

	@Column(name = "paid_amount")
	private double paid_amount;

	@Column(name = "status")
	private String status;

	@Column(name = "currency")
	private String currency;

	@Column(name = "payment_method")
	private String payment_method;

	@Column(name = "paid_at")
	private Date paid_at;

	@Column(name = "created_at")
	private Date created_at;

	@Column(name = "updated_at")
	private Date updated_at;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "last_transaction_id")
	private LastTransactionEntity last_transaction;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	public String getId() {
		return charge_id;
	}

	public void setId(String charge_id) {
		this.charge_id = charge_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public double getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(double paid_amount) {
		this.paid_amount = paid_amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public Date getPaid_at() {
		return paid_at;
	}

	public void setPaid_at(Date paid_at) {
		this.paid_at = paid_at;
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

	public LastTransactionEntity getLast_transaction() {
		return last_transaction;
	}

	public void setLast_transaction(LastTransactionEntity last_transaction) {
		this.last_transaction = last_transaction;
	}

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	public ChargeEntity() {
		super();
	}

	public ChargeEntity(String charge_id, String code, String gateway_id, double amount, double paid_amount, String status,
			String currency, String payment_method, Date paid_at, Date created_at, Date updated_at,
			CustomerEntity customer, LastTransactionEntity last_transaction, OrderEntity order) {
		super();
		this.charge_id = charge_id;
		this.code = code;
		this.gateway_id = gateway_id;
		this.amount = amount;
		this.paid_amount = paid_amount;
		this.status = status;
		this.currency = currency;
		this.payment_method = payment_method;
		this.paid_at = paid_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.customer = customer;
		this.last_transaction = last_transaction;
		this.order = order;
	}

}
