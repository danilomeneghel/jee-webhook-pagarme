package webhook.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item", schema = "DUMMY")
public class ItemEntity {

	@Id
	@Column(name = "item_id")
	private String item_id;

	@Column(name = "type")
	private String type;

	@Column(name = "description")
	private String description;

	@Column(name = "amount")
	private double amount;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "status")
	private String status;

	@Column(name = "created_at")
	private Date created_at;

	@Column(name = "updated_at")
	private Date updated_at;

	@Column(name = "code")
	private String code;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	public ItemEntity() {
		super();
	}

	public ItemEntity(String item_id, String type, String description, double amount, int quantity, String status,
			Date created_at, Date updated_at, String code, OrderEntity order) {
		super();
		this.item_id = item_id;
		this.type = type;
		this.description = description;
		this.amount = amount;
		this.quantity = quantity;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.code = code;
		this.order = order;
	}

}
