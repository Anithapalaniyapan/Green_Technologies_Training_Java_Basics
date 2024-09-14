package org.bank;
//Child 2
//Hierarchical Inheritance
public class IndiaBank extends ReserveBankOfIndia{
	private void amtTwoFrom() {
		System.out.println("From Amount: RBI2...");

	}
	public static void main (String[]args) {
		IndiaBank i = new IndiaBank();
		i.amtTo2();
		i.amtTwoFrom();
	}

}
