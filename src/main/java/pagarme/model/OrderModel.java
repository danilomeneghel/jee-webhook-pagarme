package pagarme.model;

import java.util.Date;
import java.util.List;

public class OrderModel {

	private String order_id;

	private String code;

	private double amount;

	private String currency;

	private boolean closed;

	private List<ItemModel> items;

	private CustomerModel customer;

	private String status;

	private Date created_at;

	private Date updated_at;

	private Date closed_at;

	private List<ChargeModel> charges;

	private List<CheckoutModel> checkouts;

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
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

	public List<ItemModel> getItems() {
		return items;
	}

	public void setItems(List<ItemModel> items) {
		this.items = items;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
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

	public List<ChargeModel> getCharges() {
		return charges;
	}

	public void setCharges(List<ChargeModel> charges) {
		this.charges = charges;
	}

	public List<CheckoutModel> getCheckouts() {
		return checkouts;
	}

	public void setCheckouts(List<CheckoutModel> checkouts) {
		this.checkouts = checkouts;
	}

	public OrderModel() {
		super();
	}

	public OrderModel(String order_id, String code, double amount, String currency, boolean closed,
			List<ItemModel> items, CustomerModel customer, String status, Date created_at, Date updated_at,
			Date closed_at, List<ChargeModel> charges, List<CheckoutModel> checkouts) {
		super();
		this.order_id = order_id;
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
