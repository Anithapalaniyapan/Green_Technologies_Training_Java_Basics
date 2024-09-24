package org.task;

public class Vote {
	private void votes(int age) {
		if(age>=18) {
			System.out.println("ok");
			
		}
		else {
			System.out.println("Not Okay");
		}
	}
	private void even(int number) {
		if(number%2==0) {
			System.out.println("This is Even Number");
		}
		else {
			System.out.println("This is odd number");
		}

	}
	
	
	
	public static void main (String[]args){
		Vote a=new Vote();
		Vote b=new Vote();
		a.votes(18);
		b.even(7);
		
		
	}
	
	

}
