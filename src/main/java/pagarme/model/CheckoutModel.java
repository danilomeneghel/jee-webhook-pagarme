package pagarme.model;

public class CheckoutModel {

	private String checkout_id;

	private OrderModel order;

	public String getCheckout_id() {
		return checkout_id;
	}

	public void setCheckout_id(String checkout_id) {
		this.checkout_id = checkout_id;
	}

	public OrderModel getOrder() {
		return order;
	}

	public void setOrder(OrderModel order) {
		this.order = order;
	}

	public CheckoutModel() {
		super();
	}

	public CheckoutModel(String checkout_id, OrderModel order) {
		super();
		this.checkout_id = checkout_id;
		this.order = order;
	}

}
