package org.collections;
import java.util.*;
import java.util.Map.Entry;

public class MapMethods {
	public static void main(String[]args) {
		
		//Using HashMap() Class---->Random Order
		System.out.println("==========Using HashMap Class========");
		
		Map a=new HashMap();
		
		//Using put() Methods
		a.put("Red Rose", 30);
		a.put("Pink Rose", 40);
		a.put("White Rose",50);
		a.put("Yellow Rose",60);
		a.put("Blue Rose",70);
	
	
		
		
		System.out.println(a);
		
		System.out.println("==========Using size() Methods========");
		//Using size() Methods
		System.out.println(a.size());
		
		System.out.println("==========Using containsKey() Methods========");
		//Using containsKey() Methods
		System.out.println(a.containsKey("Blue Rose"));
		
		System.out.println("==========Using containsValue() Methods========");
		//Using containsValue() Methods
		System.out.println(a.containsValue(60));
		
		System.out.println("==========Using remove() Methods========");
		//Using remove() Methods
		System.out.println(a.remove("Yellow Rose",60));
		
		System.out.println(a);
		
		System.out.println("==========Using keySet() Methods========");
		
		//Using keySet() Methods
		Set<String> b=a.keySet();
		System.out.println(b);
		
		System.out.println("==========Using values() Methods========");
		
		//Using values() Methods
		Collection<Integer> c=a.values();
		System.out.println(c);
		
		
		System.out.println("=====Using entrySet()->for each(set),getKey(),getValues() Methods=====");
		
		//Using Using entrySet()->for each(set),getKey(),getValues() Methods
		Set<Entry<String,Integer>> d=a.entrySet();
		for(Entry<String,Integer> e:d) {
			//System.out.println(e);
			
			System.out.println(e.getKey());
			
			System.out.println(e.getValue());
			
			
			
//			String f=e.getKey();
//			System.out.println(f);
			
			
		}
		
		
		//Using LinkedHashMap() Class---->Insertion Order
		System.out.println("==========Using LinkedHashMap Class========");
		
		Map g=new LinkedHashMap();
		
		g.put("Red Rose", 30);
		g.put("Pink Rose", 40);
		g.put("White Rose",50);
		g.put("Yellow Rose",60);
		g.put("Blue Rose",70);
		
		System.out.println(g);
		
		
		//Using TreeMap() Class---->ascending Order
		//ASCII Through ascending the values
		System.out.println("==========Using TreeMap Class========");
		
		Map h=new TreeMap();
		
		h.put("Red Rose", 30);
		h.put("Pink Rose", 40);
		h.put("White Rose",50);
		h.put("Yellow Rose",60);
		h.put("Blue Rose",70);
		
		System.out.println(h);
		
		
		//Using Hashtable() Class---->Random Order
        System.out.println("==========Using Hashtable Class========");
		
		Map i=new Hashtable();
		
		i.put("Red Rose", 30);
		i.put("Pink Rose", 40);
		i.put("White Rose",50);
		i.put("Yellow Rose",60);
		i.put("Blue Rose",70);
		
		System.out.println(i);
		
		
		
		//OUTPUT
		
//		==========Using HashMap Class========
//			{Pink Rose=40, White Rose=50, Red Rose=30, Blue Rose=70, Yellow Rose=60}
//			==========Using size() Methods========
//			5
//			==========Using containsKey() Methods========
//			true
//			==========Using containsValue() Methods========
//			true
//			==========Using remove() Methods========
//			true
//			{Pink Rose=40, White Rose=50, Red Rose=30, Blue Rose=70}
//			==========Using keySet() Methods========
//			[Pink Rose, White Rose, Red Rose, Blue Rose]
//			==========Using values() Methods========
//			[40, 50, 30, 70]
//			=====Using entrySet()->for each(set),getKey(),getValues() Methods=====
//			Pink Rose
//			40
//			White Rose
//			50
//			Red Rose
//			30
//			Blue Rose
//			70
//			==========Using LinkedHashMap Class========
//			{Red Rose=30, Pink Rose=40, White Rose=50, Yellow Rose=60, Blue Rose=70}
//			==========Using TreeMap Class========
//			{Blue Rose=70, Pink Rose=40, Red Rose=30, White Rose=50, Yellow Rose=60}
//			==========Using Hashtable Class========
//			{Yellow Rose=60, Pink Rose=40, Blue Rose=70, Red Rose=30, White Rose=50}

		
		
		
		
		
		
		
		
	
		
		
	}

}
