package org.practice;
//child
//method overriding
public class NewStudent extends OldStudent {
	@Override
	public void studentName(String name) {
		System.out.println("New student name is:"+name);
		super.studentName("Anitha");
	}
	public static void main(String[]args) {
		NewStudent n = new NewStudent();
		n.studentName("Nandhini");
		
	}
		

	

}
