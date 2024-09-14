package org.atchennai;
//Child
//Multilevel Inheritance
public class RateOfPhone extends NameOfProduct{
	private void PhoneRate() {
		System.out.println("Phone Rate : 22000");
		
	}
	public static void main (String[]args) {
		RateOfPhone r = new RateOfPhone();
		r.PhoneName();
		r.MadeAt();
		r.ProductName();
		r.PhoneRate();
	}

}
 