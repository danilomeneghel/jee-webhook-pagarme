package pagarme.model;

public class PhonesModel {

    private Long phones_id;

	private HomePhoneModel home_phone;

	private MobilePhoneModel mobile_phone;

	public Long getPhones_id() {
		return phones_id;
	}

	public void setPhones_id(Long phones_id) {
		this.phones_id = phones_id;
	}

	public HomePhoneModel getHome_phone() {
		return home_phone;
	}

	public void setHome_phone(HomePhoneModel home_phone) {
		this.home_phone = home_phone;
	}

	public MobilePhoneModel getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(MobilePhoneModel mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public PhonesModel() {
		super();
	}

	public PhonesModel(Long phones_id, HomePhoneModel home_phone, MobilePhoneModel mobile_phone) {
		super();
		this.phones_id = phones_id;
		this.home_phone = home_phone;
		this.mobile_phone = mobile_phone;
	}

}
