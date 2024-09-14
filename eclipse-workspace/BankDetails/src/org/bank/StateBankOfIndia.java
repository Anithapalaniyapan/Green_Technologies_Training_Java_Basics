package org.bank;
//child 1
//Hierarchical Inheritance
public class StateBankOfIndia extends ReserveBankOfIndia{
	private void amtFrom() {
		System.out.println("Amount Come From : RBI1...");


	}
	public static void main (String[]args) {
		StateBankOfIndia s = new StateBankOfIndia();
		s.amtTo();
		s.amtFrom();
	}
	

}
