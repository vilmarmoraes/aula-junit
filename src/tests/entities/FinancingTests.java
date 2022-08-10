package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void quotaShouldCalculateInstallmentAmount() {
		double expectedValue = 1000.0;
		double totalAmount = 100000.00;
		double income = 2000.0;
		Integer months = 80;
		
		Financing fin = new Financing(totalAmount, income, months );
		
		double result = fin.quota();
		
		Assertions.assertEquals(expectedValue, result);
		
	}
}
