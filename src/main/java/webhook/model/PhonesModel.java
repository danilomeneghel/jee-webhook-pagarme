package webhook.model;

public class PhonesModel {

	private HomePhoneModel home_phone;

	private MobilePhoneModel mobile_phone;

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

	public PhonesModel(HomePhoneModel home_phone, MobilePhoneModel mobile_phone) {
		super();
		this.home_phone = home_phone;
		this.mobile_phone = mobile_phone;
	}

}
