package pagarme.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "checkout")
public class CheckoutEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CHECKOUT_ID")
	@SequenceGenerator(sequenceName = "SEQ_CHECKOUT_ID", name = "SEQ_CHECKOUT_ID", allocationSize = 1)
    @Column(name = "checkout_id", unique = true, nullable = false)
    private Long checkout_id;
	
	@Column(name = "uuid")
	private String id;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity order;

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

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	public CheckoutEntity() {
		super();
	}

	public CheckoutEntity(Long checkout_id, String id, OrderEntity order) {
		super();
		this.checkout_id = checkout_id;
		this.id = id;
		this.order = order;
	}

}
