package webhook.model;

public class CheckoutModel {

	private String id;

	private OrderModel order;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public CheckoutModel(String id, OrderModel order) {
		super();
		this.id = id;
		this.order = order;
	}

}
