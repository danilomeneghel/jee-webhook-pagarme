package pagarme.model;

import java.util.Date;

public class ItemModel {

    private Long item_id;
	
	private String id;

	private String type;

	private String description;

	private double amount;

	private int quantity;

	private String status;

	private Date created_at;

	private Date updated_at;

	private String code;

	private OrderModel order;

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public OrderModel getOrder() {
		return order;
	}

	public void setOrder(OrderModel order) {
		this.order = order;
	}

	public ItemModel() {
		super();
	}

	public ItemModel(Long item_id, String id, String type, String description, double amount, int quantity,
			String status, Date created_at, Date updated_at, String code, OrderModel order) {
		super();
		this.item_id = item_id;
		this.id = id;
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
