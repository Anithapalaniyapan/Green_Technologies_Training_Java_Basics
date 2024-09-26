package org.collections;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetMethods {
	public static void main(String[]args) {
		
		//Using HashSet() Class--->Random Order
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
		
		//Using remove() methods
//		a.remove('T');
		
		
		Set g=new HashSet();
		g.add(10);
		g.add(20);
		g.add(30);
		a.addAll(g);
		
		
		
		
		System.out.println("=======Using HashSet Class======");
		
		System.out.println(a);
		
		System.out.println("=======Using Contains() Methods======");
		//Using Contains() Methods
		boolean d=a.contains('T');
		System.out.println(d);
		
		System.out.println("=======Using size() Methods======");
		//Using Size() Methods
		int f=a.size();
		System.out.println(f); 
		
		System.out.println("=======Using for each() (Iteration)======");
		for(Object e:a) {
			System.out.println(e);
		}
		

		
		
		//Using LinkedHashSet() Class----->Insertion Order
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
		   
		 
		 System.out.println("=======Using LinkedHashSet Class======");
		 System.out.println(b);
		
		 
		 //Using TreeSet Class---->Ascending Order
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
		   
		 System.out.println("=======Using TreeSet Class======");
		 System.out.println(c);
		
		 
		 
		 //OUTPUT
		 
//		 =======Using HashSet Class======
//				 [C, S, T, 20, E, I, 10, L, N, 30, O]
//				 =======Using Contains() Methods======
//				 true
//				 =======Using size() Methods======
//				 11
//				 =======Using for each() (Iteration)======
//				 C
//				 S
//				 T
//				 20
//				 E
//				 I
//				 10
//				 L
//				 N
//				 30
//				 O
//				 =======Using LinkedHashSet Class======
//				 [C, O, L, E, T, I, N, S]
//				 =======Using TreeSet Class======
//				 [C, E, I, L, N, O, S, T]

	}
	
}
