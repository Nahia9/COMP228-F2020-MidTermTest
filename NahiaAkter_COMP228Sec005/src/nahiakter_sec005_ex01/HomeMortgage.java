package nahiakter_sec005_ex01;

import java.time.LocalDate;

public class HomeMortgage extends Mortgage {

	private double yearlyPropertyTax;
	private double infraStructureTax;

	public double getPropertyTax() {
		return yearlyPropertyTax;
	}

	public void setPropertyTax(double yearlyPropertyTax) {
		if (yearlyPropertyTax > 0)
			this.yearlyPropertyTax = yearlyPropertyTax;
	}

	public double getInfraStructureTax() {
		return infraStructureTax;
	}

	public void setInfraStructureTax(double infraStructureTax) {
		if (infraStructureTax > 0)
			this.infraStructureTax = infraStructureTax;
	}

	public HomeMortgage(String customerName, LocalDate DOB, Address address, double propertyTax,
			double infrastructureTax) {
		super(customerName, DOB, address);
		this.yearlyPropertyTax = propertyTax;
		this.infraStructureTax = infrastructureTax;
	}

	@Override
	public double CalculateMonthlyMortgageInstallment() {
		// TODO Auto-generated method stub
		Integer time = 12;
		//System.out.println("Rate of itnerest: "+ rateOfInterest + mortgageAmount);
		return (mortgageAmount * (rateOfInterest / 100) * time) / 12 + yearlyPropertyTax / 12 + infraStructureTax;
	}

	@Override
	public String toString() {
		return super.toString() + "\nYearly Property Tax: " + yearlyPropertyTax +" "+ "\nInfraStructurTax: " + infraStructureTax + " "
				+ "\nMonthly mortgage installment: " + CalculateMonthlyMortgageInstallment();
	}

}
