package org.student;
//child
//method overloading
public class Company extends Emp{
	private void employee(String name) {
		System.out.println("My name is:"+name);
		this.employee(20);
		this.employee('F');
		super.headOfficer(30000);
		
		
	}
	
	private void employee(int age) {
		System.out.println("My age is:"+age);
		
	}
	private void employee(char gender) {
		System.out.println("My gender is:"+gender);
		
	}
	public static void main(String[]agrs) {
		Company d = new Company();
		d.employee("Anitha");
	
	}

	
	

}
