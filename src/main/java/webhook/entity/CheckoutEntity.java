package webhook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "checkout", schema = "DUMMY")
public class CheckoutEntity {

	@Id
	@Column(name = "checkout_id")
	private String checkout_id;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	public String getCheckout_id() {
		return checkout_id;
	}

	public void setCheckout_id(String checkout_id) {
		this.checkout_id = checkout_id;
	}

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	public CheckoutEntity() {
		super();
	}

	public CheckoutEntity(String checkout_id, OrderEntity order) {
		super();
		this.checkout_id = checkout_id;
		this.order = order;
	}

}
