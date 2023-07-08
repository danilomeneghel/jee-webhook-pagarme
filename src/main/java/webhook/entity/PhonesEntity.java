package webhook.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "phones", schema = "DUMMY")
@SequenceGenerator(sequenceName = "SEQ_PHONES_ID", name = "SEQ_PHONES_ID", allocationSize = 1)
public class PhonesEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PHONES_ID")
    @Column(name = "phones_id", unique = true, nullable = false)
    private Long phones_id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "home_phone_id", nullable = true)
	private HomePhoneEntity home_phone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobile_phone_id", nullable = true)
	private MobilePhoneEntity mobile_phone;

	public Long getPhones_id() {
		return phones_id;
	}

	public void setPhones_id(Long phones_id) {
		this.phones_id = phones_id;
	}

	public HomePhoneEntity getHome_phone() {
		return home_phone;
	}

	public void setHome_phone(HomePhoneEntity home_phone) {
		this.home_phone = home_phone;
	}

	public MobilePhoneEntity getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(MobilePhoneEntity mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public PhonesEntity() {
		super();
	}

	public PhonesEntity(Long phones_id, HomePhoneEntity home_phone, MobilePhoneEntity mobile_phone) {
		super();
		this.phones_id = phones_id;
		this.home_phone = home_phone;
		this.mobile_phone = mobile_phone;
	}

}
