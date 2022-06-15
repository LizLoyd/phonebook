package PhonebookLiz;

class Person {
	String fname;
	String mname;
	String lname;
	String fullname;
	String email;
	String birthday;
	String phone;
	String address;
	

	public Person(String fname, String mname, String lname, String email, String birthday, String phone, String street, String city, String state, String zipCode) {
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.fullname = fullname;
		this.email = email;
		this.birthday = birthday;
		this.phone = phone;
		this.address = street + " " + city + " " + state + " " + zipCode ;
		
	}
	public void addAddress(String street, String city, String state, String zipCode) {
		Address tempAddress = new Address(street, city, state, zipCode);
		
	
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String street, String city, String state, String zipCode) {
		this.address = street + city + state + zipCode;
	}
	public String getFullName() {
		return fname + " " + mname + " " + lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		String formated = String.valueOf(phone);
		String formatPhone = "(" + formated.charAt(0) +  formated.charAt(1) +  formated.charAt(2) + ")" 
				+ formated.charAt(3) +  formated.charAt(4) +  formated.charAt(5) + "-" 
				+ formated.charAt(6) +  formated.charAt(7) +  formated.charAt(8) +  formated.charAt(9);
	
//		String formated1 = String.valueOf(birthday);
//		String formatBirthday = formated1.charAt(0) +  formated1.charAt(1) + "/" + formated1.charAt(2) +  formated1.charAt(3) + "/"
//				+ formated1.charAt(4) +  formated1.charAt(5) + formated1.charAt(6) +  formated1.charAt(7);
//		
	return "\nPhone Number: " + formatPhone + "\nFirst Name: " + fname + "\nLast Name: " + lname + "\nMiddle Name: " +
	mname + "\nAddress: " + address + "\nBirthday: " + birthday + "\nEmail: " + email;
	

	}
	public void printPerson() {
		String formated = String.valueOf(phone);
		String formatPhone = "(" + formated.charAt(0) +  formated.charAt(1) +  formated.charAt(2) + ")" 
				+ formated.charAt(3) +  formated.charAt(4) +  formated.charAt(5) + "-" 
				+ formated.charAt(6) +  formated.charAt(7) +  formated.charAt(8) +  formated.charAt(9);
//		
//		String formated1 = String.valueOf(birthday);
//		String formatBirthday = formated1.charAt(0) +  formated1.charAt(1) + "/" + formated1.charAt(2) +  formated1.charAt(3) + "/"
//				+ formated1.charAt(4) +  formated1.charAt(5) + formated1.charAt(6) +  formated1.charAt(7);
//		
//				
//		System.out.println("\nFirst Name: " + fname + "\nLast Name: " + lname + "\nMiddle Name: " + mname + "\nPhone Number: " + formatPhone
//				+ "\nEmail: " + email + "\nBirth Date: " + birthday);
//		address.printAddress();
//		System.out.println("----------------------------");
}
}
