package org.collections;
import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[]args) {
		List q=new ArrayList();
		q.add(10);
		q.add(true);
		q.add('m');
		q.add(null);
		q.add("arun");
		q.add(23.234f);
		q.add(10);
		
		System.out.println(q);
		System.out.println("==================");
		
		for(int i=0;i<q.size();i++) {
			System.out.println(q.get(i));
		}
		
		
	}

}
