package nahiakter_sec005_ex01;

import java.time.LocalDate;

public abstract class Mortgage {

	private final Integer mortgageNumber=9;
	private String customerName;
	private LocalDate DOB;
	private Address customerAddress;
	protected Integer mortgageAmount;
	protected double rateOfInterest;

	public Mortgage(String customerName, LocalDate DOB, Address address, Integer mortgageAmount,
			double rateOfInterest) {

		this.customerName = customerName;
		this.DOB = DOB;
		this.customerAddress = address;
		this.mortgageAmount = mortgageAmount;
		this.rateOfInterest = rateOfInterest;
	}

	public Mortgage(String customerName, LocalDate DOB, Address address) {
	
		this.customerName = customerName;
		this.DOB = DOB;
		this.customerAddress = address;
	}

	public Integer getMortgageNumber() {
		return mortgageNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate DOB) {
		this.DOB = DOB;
	}

	public Address getAddress() {
		return customerAddress;
	}
			
	public void setAddress(Address address) {
		this.customerAddress = address;
	}
	
	public Integer getMortgageAmount() {
		return mortgageAmount;
	}

	public void setMortgageAmount(Integer mortgageAmount) {
		if (mortgageAmount > 0)
			this.mortgageAmount = mortgageAmount;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double d) {
		if (d <= 5.0)
			this.rateOfInterest = d;
			
			else this.rateOfInterest =1.0;
	}
	
	abstract public double CalculateMonthlyMortgageInstallment();
	
	public String toString() {
		return "\nCustomer Name: " + customerName + "\nDate Of Birth: " + DOB + "\nCustomer Address: " + customerAddress
				+ "\nMortgage Amount: " + mortgageAmount + "\nRate of Interest: " + rateOfInterest;
	}
}
