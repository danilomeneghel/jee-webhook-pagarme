package webhook.model;

import java.util.List;

public class GatewayResponseModel {

	private String code;

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

	public GatewayResponseModel() {
		super();
	}

	public GatewayResponseModel(String code, List<String> errors) {
		super();
		this.code = code;
		this.errors = errors;
	}

}
