package org.emp;
//child
//create method,create main method,create object name,method call

public class Employee {
	private void empId() {
		System.out.println("E21IT004");
	}
	private void empName() {
		System.out.println("Anitha Palaniyappan");
		
	}
	private void empDob() {
		System.out.println("10-1-2004");
	}
	private void empPhone() {
		System.out.println("6798453209");
		
	}
	private void empEmail() {
		System.out.println("anithapalaniyappan2@gmail.com");
		
	}
	private void empAddress() {
		System.out.println("Pullipalayam,Sankari,Salem,Tamilnadu");
		
	}
	public static void main(String[]args) {
		Employee a = new Employee();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();
		
	}

}
