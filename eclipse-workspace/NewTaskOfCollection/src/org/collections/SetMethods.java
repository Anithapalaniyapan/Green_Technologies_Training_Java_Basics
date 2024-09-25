package org.collections;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetMethods {
	public static void main(String[]args) {
		
		//Using HashSet()--->Random Order
		Set a=new HashSet();
		
		a.add('C');
		a.add('O');
		a.add('L');
		a.add('L');
		a.add('E');
		a.add('C');
		a.add('T');
		a.add('I');
		a.add('O');
		a.add('N');
		a.add('S');
//		a.remove('T');
		
		
		Set g=new HashSet();
		g.add(10);
		g.add(20);
		g.add(30);
		a.addAll(g);
		
		
		
		
		System.out.println("=======Using HashSet======");
		
		System.out.println(a);
		
		System.out.println("=======Using Contains()======");
		//Using Contains()
		boolean d=a.contains('T');
		System.out.println(d);
		
		System.out.println("=======Using size()======");
		//Using Size()
		int f=a.size();
		System.out.println(f); 
		
		System.out.println("=======Using for each()======");
		for(Object e:a) {
			System.out.println(e);
		}
		

		
		
		//Using LinkedHashSet()----->Insertion Order
		Set b=new LinkedHashSet();
			
		 b.add('C');
		 b.add('O');
		 b.add('L');
		 b.add('L');
		 b.add('E');
	     b.add('C');
		 b.add('T');
		 b.add('I');
		 b.add('O');
		 b.add('N');
		 b.add('S');
		   
		 
		 System.out.println("=======Using LinkedHashSet======");
		 System.out.println(b);
		
		 
		 //Using TreeSet---->Ascending Order
		 Set c=new TreeSet();
			
		 c.add('C');
		 c.add('O');
		 c.add('L');
		 c.add('L');
		 c.add('E');
	     c.add('C');
		 c.add('T');
		 c.add('I');
		 c.add('O');
		 c.add('N');
		 c.add('S');
		   
		 System.out.println("=======Using TreeSet======");
		 System.out.println(c);
		
	}
	
}
