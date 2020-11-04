package nahiakter_sec005_ex01;

import java.time.LocalDate;

public class MortgageTest {

	public static void main(String args[]) {
		HomeMortgage homeMortgage1 = new HomeMortgage ("Ruwaida Farheen", LocalDate.of(2001, 9, 10),new Address(11, "Pitt Avenue", "Scarborough", "A1B2C3"), 1000,300.0);				
		homeMortgage1.setMortgageAmount(2500);
		homeMortgage1.setRateOfInterest(5.0);
		System.out.println(homeMortgage1.toString());

		BusinessMortgage businessMortgage1 = new BusinessMortgage("Rubina Akhter", LocalDate.of(2002, 10, 8),new Address(22, "Florens Avenue", "Scarborough", "F1J4C5"), 300.0);
		businessMortgage1.setMortgageAmount(2300);
		businessMortgage1.setRateOfInterest(3.0);
		System.out.println(businessMortgage1.toString());

		HomeMortgage homeMortgage2 = new HomeMortgage ("Robin", LocalDate.of(1995, 3, 5),new Address(33, "Denton Avenue", "Pickering", "D1E2F3"), 1200,200.0);				
		homeMortgage2.setMortgageAmount(5000);
		homeMortgage2.setRateOfInterest(2.0);
		System.out.println(homeMortgage2.toString());

		BusinessMortgage businessMortgage2 = new BusinessMortgage("Rajib", LocalDate.of(1993, 7, 8), new Address(44, "Donside Drive", "Scarborough", "M1E2K3"), 200.0);
		businessMortgage2.setMortgageAmount(7000);
		businessMortgage2.setRateOfInterest(4.0);
		System.out.println(businessMortgage2.toString());

	}

}
