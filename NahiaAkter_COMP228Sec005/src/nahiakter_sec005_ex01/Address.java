package nahiakter_sec005_ex01;

public class Address {
	
	private Integer houseNumber;
	private String streetName;
	private String city;
	private String zipCode;
	private String Address;

public Address(Integer houseNum, String streetName, String City, String zipCode) 
{
	this.houseNumber = houseNum;
	this.streetName = streetName;
	this.city = City;
	this.zipCode = zipCode;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	this.Address = address;
}

public String toString() {
	return "\tHouse Number: " + houseNumber + "\tStreet Name: " + streetName + "\tCity : " + city
			+ "\tZip Code : " + zipCode;
}
}
