package org.task;

public class SecondTask {
	
	public static void main(String[]args) {
		int a[]= {10,20,30,40};
		int sum=0;//starting point
		        //1    //2     //4
		for(int i=0;i<a.length;i++) {
			//3
			sum+=a[i]; //sum=sum+value
		
			
		}
		      //                100/4
		 float average=(float)sum/a.length;
	     //5
		System.out.println("Total Sum:"+sum);
		
   
		System.out.println("The Average is:"+average);
		
		//System.out.println(sum/a.length);
	}

}
