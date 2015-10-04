package gov.va.domain.impl;

import org.yare.annotations.RuleAttribute;
import org.yare.annotations.RuleObservable;

@RuleObservable
public class VetAddress {

	@RuleAttribute
	private String addressLine1;
	
	@RuleAttribute
	private String addressLine2;
	
	@RuleAttribute
	private String city;
	
	@RuleAttribute
	private String state;
	
	@RuleAttribute
	private String zipcode;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	
}
