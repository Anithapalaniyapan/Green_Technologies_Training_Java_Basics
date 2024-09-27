package org.task;

public class FirstTask {
	public static void main(String[]args) {
		String name="Anitha";
		
		String n="";
		             //1            2   4
		for(int p=name.length()-1;p>=0;p--) {
			     //3
			//System.out.print(name.charAt(p));
			n=n+name.charAt(p);
			
		} 
		System.out.println(n);
		
		if(n.equals(name)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Polindrome");
		}
	}

}
