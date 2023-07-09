package pagarme.model;

public class WebhookModel {

	private String id;

	private String url;

	private String event;

	private String status;

	private String attempts;

	private String lastAttempt;

	private String createdAt;

	private String response_status;

	private OrderModel data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAttempts() {
		return attempts;
	}

	public void setAttempts(String attempts) {
		this.attempts = attempts;
	}

	public String getLastAttempt() {
		return lastAttempt;
	}

	public void setLastAttempt(String lastAttempt) {
		this.lastAttempt = lastAttempt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getResponse_status() {
		return response_status;
	}

	public void setResponse_status(String response_status) {
		this.response_status = response_status;
	}

	public OrderModel getData() {
		return data;
	}

	public void setData(OrderModel data) {
		this.data = data;
	}

	public WebhookModel() {
		super();
	}

	public WebhookModel(String id, String url, String event, String status, String attempts, String lastAttempt,
			String createdAt, String response_status, OrderModel data) {
		super();
		this.id = id;
		this.url = url;
		this.event = event;
		this.status = status;
		this.attempts = attempts;
		this.lastAttempt = lastAttempt;
		this.createdAt = createdAt;
		this.response_status = response_status;
		this.data = data;
	}

}
