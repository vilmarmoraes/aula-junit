package tests.factory;

import entities.Financing;

public class FinancingFactory {

	public static Financing createEmptyFinancing() {
		return new Financing(0.0, 0.0, 0);
	}
		
	public static Financing createFinancing(double initialTotalAmount, double initialIncome, int initialMonths) {
		return new Financing(initialTotalAmount, initialIncome, initialMonths);
	}
	
}
