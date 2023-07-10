package pagarme.model;

public class CheckoutModel {

    private Long checkout_id;
	
	private String id;

	private OrderModel order;

	public Long getCheckout_id() {
		return checkout_id;
	}

	public void setCheckout_id(Long checkout_id) {
		this.checkout_id = checkout_id;
	}

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

	public CheckoutModel(Long checkout_id, String id, OrderModel order) {
		super();
		this.checkout_id = checkout_id;
		this.id = id;
		this.order = order;
	}

}
