package org.task;

public class TaskOfMethod {
	 public static void main(String[]args) {
		 String name="Anitha Palaniyappan";
		 
		 //Methods
		 //CharAt()
		 char a=name.charAt(7);
		 System.out.println(a);
		 //indexOf()
		 
		 int b=name.indexOf('y');
		 System.out.println(b);

		 //lastIndex()
		 int c=name.lastIndexOf('n');
		 System.out.println(c);
		 
		 //Length()
		 int d=name.length();
		 System.out.println(d);
		 
		 //isEmpty()
		 boolean e=name.isEmpty();
		 System.out.println(e);
		 
		 //contains()
		 boolean f=name.contains("ani");
		 System.out.println(f);
		 
		 //Trim()
//		 String g=name.trim();
//		 System.out.println(g);
		 
		 //startWith()
		 boolean h=name.startsWith("Ani");
		 System.out.println(h);
		 
		 //endsWith()
		 boolean  i=name.endsWith("ppa");
		 System.out.println(i);
		 
		 //toUpperCase()
		 String j=name.toUpperCase();
		 System.out.println(j);
		 
		 //toLowerCase()
		 String k=name.toLowerCase();
		 System.out.println(k);
		 
		 //equals()
		 String l="Anitha";
		 String m="anitha";
		 
		 boolean n=l.equals(m);
		 System.out.println(n);
		 
		 
		 //equalsIgnoreCase()
		 boolean o=l.equalsIgnoreCase(m);
		 System.out.println(o);
		 
		 //replace()
		 String p = m.replace("anitha","kalai");
		 System.out.println(p);
		 
		 System.out.println(m);
		 
		 //replaceAll()
		 String q = m.replaceAll(m, p);
		 System.out.println(q);
		 
		 System.out.println(m);
		 
		 //subString()
		 String r=name.substring(10);
		 System.out.println(r);
		 
		 //substring(Start Index,end Index)
		 
		 String s=name.substring(4, 19);
		 System.out.println(s);
		 
		 //compareTo()
		 
		 int t=l.compareTo(m);
		 System.out.println(t);
		 
		 
		 //OUTPUT
//		 P
//		 13
//		 18
//		 19
//		 false
//		 true
//		 true
//		 false
//		 ANITHA PALANIYAPPAN
//		 anitha palaniyappan
//		 false
//		 true
//		 kalai
//		 anitha
//		 kalai
//		 anitha
//		 aniyappan
//		 ha Palaniyappan
//		 -32
		 
	 }

}
