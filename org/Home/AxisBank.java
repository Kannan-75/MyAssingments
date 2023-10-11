package org.Home;

public class AxisBank extends BankInfo{
	
	public void deposit()  {
		System.out.println("Cash");
 	}
	
	public void fixed()  {
		System.out.println("97675");
	}
	
	public void saving()  {
		System.out.println("Kannan");
	}
	
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit();
		bank.fixed();
		bank.saving();
	}

}
