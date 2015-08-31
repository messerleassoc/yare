package gov.va.domain.impl;

import java.util.ArrayList;
import java.util.List;

import org.yare.gui.annotations.RuleAttribute;
import org.yare.gui.annotations.RuleObserveable;

@RuleObserveable
public class Vet {

	@RuleAttribute
	private String firstName;
	
	@RuleAttribute
	private String middleName;
	
	@RuleAttribute
	private String lastName;
	
	@RuleAttribute
	private int age;

	@RuleAttribute
	private List<VetAddress> addresses = new ArrayList<VetAddress>();
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<VetAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<VetAddress> addresses) {
		this.addresses = addresses;
	}
	
	
	
}
