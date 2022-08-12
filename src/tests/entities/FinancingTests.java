package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void construtorShouldCreateObjectWhenValidData() {
		// Arrange
		// Act
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		// Assert
		Assertions.assertEquals(100000.0, fin.getTotalAmount());
		Assertions.assertEquals(2000.0, fin.getIncome());
		Assertions.assertEquals(80, fin.getMonths());
	}

	@Test
	public void construtorShouldIllegalArgumentExceptionWhenInValidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 20);
		});
	}

	// -----------------------------------------------------------------------------------
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		// Arrange
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		// Act
		fin.setTotalAmount(90000.0);
		// Assert
		Assertions.assertEquals(90000.0, fin.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldIllegalArgumentExceptionWhenInValidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
			// Act
			fin.setTotalAmount(110000.0);
		});
	}

	// -----------------------------------------------------------------------------------

	@Test
	public void setIncomeAmountShouldSetDataWhenValidData() {
		// Arrange
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);

		// Act
		fin.setIncome(2100.0);

		// Assert
		Assertions.assertEquals(2100.0, fin.getIncome());

	}

	@Test
	public void setIncomeAmountShouldIllegalArgumentExceptionWhenInValidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
			fin.setIncome(1900.0);
		});
	}

	// -----------------------------------------------------------------------------------

	@Test
	public void setMonthsAmountShouldSetDataWhenValidData() {
		// Arrange
		Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		// Act
		fin.setMonths(81);
		// Assert
		Assertions.assertEquals(81, fin.getMonths());
	}

	@Test
	public void setMonthsAmountShouldIllegalArgumentExceptionWhenInValidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
			fin.setMonths(79);
		});
	}

	// -----------------------------------------------------------------------------------

	@Test
	public void entryShouldCalculateEntryCorrectly() {
		double expectedValue = 20000.0;
		double totalAmount = 100000.00;
		double income = 2000.0;
		Integer months = 80;

		Financing fin = FinancingFactory.createFinancing(totalAmount, income, months);

		double result = fin.entry();

		Assertions.assertEquals(expectedValue, result);

	}

	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		double expectedValue = 1000.0;
		double totalAmount = 100000.00;
		double income = 2000.0;
		Integer months = 80;

		Financing fin = FinancingFactory.createFinancing(totalAmount, income, months);

		double result = fin.quota();

		Assertions.assertEquals(expectedValue, result);

	}
}
