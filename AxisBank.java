package org.bank;

public class AxisBank extends BankInfo{
	public void deposit() {

		System.out.println("Minimum deposit of Rs 1,00,000 with no maximum limit on deposits");
	}
	
	public static void main(String[] args) {

	
	BankInfo bankInfo = new BankInfo();
	bankInfo.saving();
    bankInfo.fixed();
	bankInfo.deposit();

	AxisBank axisBank = new AxisBank();
	axisBank.deposit();
	
	
	}
}
