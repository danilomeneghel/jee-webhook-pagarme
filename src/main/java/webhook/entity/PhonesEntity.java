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
@Table(name = "phones")
public class PhonesEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phones_sequence")
    @SequenceGenerator(name = "phones_sequence", sequenceName = "PHONES_SEQ", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "home_phone_id")
	private HomePhoneEntity home_phone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobile_phone_id")
	private MobilePhoneEntity mobile_phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public PhonesEntity(Long id, HomePhoneEntity home_phone, MobilePhoneEntity mobile_phone) {
		super();
		this.id = id;
		this.home_phone = home_phone;
		this.mobile_phone = mobile_phone;
	}

}
