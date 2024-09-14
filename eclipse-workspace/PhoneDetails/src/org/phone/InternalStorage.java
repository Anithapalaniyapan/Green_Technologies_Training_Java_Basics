package org.phone;
//child
public class InternalStorage {
	private void processorName() {
		System.out.println("Processor Name:INTEL");
		
	}
	private void ramSize() {
		System.out.println("Ram size:8GB");
		
	}
	 public static void main(String[]args) {
		 ExternalStorege e = new ExternalStorege();
		 e.size();
		 
		 InternalStorage i = new InternalStorage();
		 i.processorName();
		 i.ramSize();
		 
	 }

}
