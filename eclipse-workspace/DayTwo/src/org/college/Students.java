package org.college;
//child
public class Students {
	private void stuName(){
		System.out.println("Anitha Palaniyappan");
		
	}
	private void stuSinNmuber() {
		System.out.println("E21IT004");
		
	}
	private void stuDept() {
		System.out.println("Information Technology");
		
	}
	public static void main(String[]args) {
		InstituteDetails I = new InstituteDetails();
		I.clgName();
		I.clgType();
		Students S = new Students();
		S.stuName();
		S.stuSinNmuber();
		S.stuDept();
	}
	

}
