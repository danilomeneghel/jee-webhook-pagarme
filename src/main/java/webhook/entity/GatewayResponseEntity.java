package webhook.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class GatewayResponseEntity {

	private String code;

	@ElementCollection
	@CollectionTable(name = "gateway_response_errors")
	private List<String> errors;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public GatewayResponseEntity() {
		super();
	}

	public GatewayResponseEntity(String code, List<String> errors) {
		super();
		this.code = code;
		this.errors = errors;
	}

}
