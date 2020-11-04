package nahiakter_sec005_ex01;

import java.time.LocalDate;

public class BusinessMortgage extends Mortgage {

	private double businessInsuranceAmount;

	public BusinessMortgage(String customerName, LocalDate DOB, Address address, double businessInsuranceAmount) {
		super(customerName, DOB, address);
		// TODO Auto-generated constructor stub
		this.businessInsuranceAmount = businessInsuranceAmount;
	}

	public double getBusinessInsuranceAmount() {
		return businessInsuranceAmount;
	}

	public void setBusinessInsuranceAmount(double businessInsuranceAmount) {
		if (businessInsuranceAmount > 0)
			this.businessInsuranceAmount = businessInsuranceAmount;
	}

	@Override
	public double CalculateMonthlyMortgageInstallment() {
		// TODO Auto-generated method stub
		Integer time = 20;
		return (mortgageAmount * (rateOfInterest / 100) * time) / 12 + businessInsuranceAmount;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBusiness Insurance Amount: " + businessInsuranceAmount +" " + "\nMonthly mortgage installment:"
				+ CalculateMonthlyMortgageInstallment();
	}

}
