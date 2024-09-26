package org.collections;
import java.util.*;
import java.util.List;

public class ListMethods {
	public static void main(String[]args) {
		
		System.out.println("==========Using ArrayList() Class========");
		
		List q=new ArrayList();
		
		//Using add() Method
		q.add(10);
		q.add(true);
		q.add('m');
		q.add(null);
		q.add("arun");
		q.add(23.234f);
		q.add(10);
		
		System.out.println(q);
		
		System.out.println("==========Using indexOf() Method========");

		//Using indexOf() Method
		System.out.println(q.indexOf('m'));
		
		System.out.println("==========Using contains() Method========");
		//Using contains() Method
		boolean l=q.contains(10);
		System.out.println(l);
		
		System.out.println("==========Using remove() Method========");
		//Using remove() Method
		System.out.println(q.remove(3));
		System.out.println(q);
		
		System.out.println("==========Using get() Method========");
		//Using get() Method
		System.out.println(q.get(4));
		
		
		System.out.println("==========Using (for loop)->Iteration ========");
		for(int i=0;i<q.size();i++) {
			System.out.println(q.get(i));
		}
		
		
		
		System.out.println("==========Using LinkedList() Class========");
		List s=new LinkedList();
		s.add(10);
		s.add(true);
		s.add('m');
		s.add(null);
		s.add("arun");
		s.add(23.234f);
		s.add(10);
		
		System.out.println(s);
		System.out.println("==================");
		
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		
		
		
		System.out.println("==========Using Vector() Class========");
		List p=new Vector();
		p.add(10);
		p.add(true);
		p.add('m');
		p.add(null);
		p.add("arun");
		p.add(23.234f);
		p.add(10);
		
		System.out.println(q);
		System.out.println("==================");
		
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
//		
		
	}
	
	
	
	//OUTPUT
	
	
//	        ==========Using ArrayList() Class========
//			[10, true, m, null, arun, 23.234, 10]
//			==========Using indexOf() Method========
//			2
//			==========Using contains() Method========
//			true
//			==========Using remove() Method========
//			null
//			[10, true, m, arun, 23.234, 10]
//			==========Using get() Method========
//			23.234
//			==========Using (for loop)->Iteration ========
//			10
//			true
//			m
//			arun
//			23.234
//			10
//			==========Using LinkedList() Class========
//			[10, true, m, null, arun, 23.234, 10]
//			==================
//			10
//			true
//			m
//			null
//			arun
//			23.234
//			10
//			==========Using Vector() Class========
//			[10, true, m, arun, 23.234, 10]
//			==================
//			10
//			true
//			m
//			null
//			arun
//			23.234
//			10


}
