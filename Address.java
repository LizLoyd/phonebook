package PhonebookLiz;


public class Address {
	
	public String street;
	public String city;
	public String state;
	public String zipCode;

	public Address() {

	}

	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getzZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void printAddress() {
		System.out.println("\nStreet: " + street + "\nCity: " + city + "\nState: " + state + "\nZipcode: " + zipCode);
	}

}
