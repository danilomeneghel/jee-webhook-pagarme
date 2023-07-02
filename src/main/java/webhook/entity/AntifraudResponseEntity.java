package webhook.entity;

import javax.persistence.Embeddable;

@Embeddable
public class AntifraudResponseEntity {

	private String antifraud_status;

	private String score;

	private String provider_name;

	public String getAntifraud_status() {
		return antifraud_status;
	}

	public void setAntifraud_status(String antifraud_status) {
		this.antifraud_status = antifraud_status;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getProvider_name() {
		return provider_name;
	}

	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}

	public AntifraudResponseEntity() {
		super();
	}

	public AntifraudResponseEntity(String antifraud_status, String score, String provider_name) {
		super();
		this.antifraud_status = antifraud_status;
		this.score = score;
		this.provider_name = provider_name;
	}

}
