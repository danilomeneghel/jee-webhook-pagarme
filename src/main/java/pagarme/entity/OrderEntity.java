package pagarme.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ORDER_ID")
	@SequenceGenerator(sequenceName = "SEQ_ORDER_ID", name = "SEQ_ORDER_ID", allocationSize = 1)
    @Column(name = "order_id", unique = true, nullable = false)
    private Long order_id;
	
	@Column(name = "uuid")
	private String id;

	@Column(name = "code")
	private String code;

	@Column(name = "amount")
	private double amount;

	@Column(name = "currency")
	private String currency;

	@Column(name = "closed")
	private boolean closed;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private List<ItemEntity> items;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;

	@Column(name = "status")
	private String status;

	@Column(name = "created_at")
	private Date created_at;

	@Column(name = "updated_at")
	private Date updated_at;

	@Column(name = "closed_at")
	private Date closed_at;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private List<ChargeEntity> charges;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private List<CheckoutEntity> checkouts;

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public List<ItemEntity> getItems() {
		return items;
	}

	public void setItems(List<ItemEntity> items) {
		this.items = items;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
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

	public Date getClosed_at() {
		return closed_at;
	}

	public void setClosed_at(Date closed_at) {
		this.closed_at = closed_at;
	}

	public List<ChargeEntity> getCharges() {
		return charges;
	}

	public void setCharges(List<ChargeEntity> charges) {
		this.charges = charges;
	}

	public List<CheckoutEntity> getCheckouts() {
		return checkouts;
	}

	public void setCheckouts(List<CheckoutEntity> checkouts) {
		this.checkouts = checkouts;
	}

	public OrderEntity() {
		super();
	}

	public OrderEntity(Long order_id, String id, String code, double amount, String currency, boolean closed,
			List<ItemEntity> items, CustomerEntity customer, String status, Date created_at, Date updated_at,
			Date closed_at, List<ChargeEntity> charges, List<CheckoutEntity> checkouts) {
		super();
		this.order_id = order_id;
		this.id = id;
		this.code = code;
		this.amount = amount;
		this.currency = currency;
		this.closed = closed;
		this.items = items;
		this.customer = customer;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.closed_at = closed_at;
		this.charges = charges;
		this.checkouts = checkouts;
	}

}
