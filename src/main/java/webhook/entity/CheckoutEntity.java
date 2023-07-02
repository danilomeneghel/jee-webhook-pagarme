package webhook.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "checkout")
public class CheckoutEntity {

	@Id
	private String id;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public CheckoutEntity(String id, OrderEntity order) {
		super();
		this.id = id;
		this.order = order;
	}

}
