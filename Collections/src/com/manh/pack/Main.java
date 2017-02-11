package com.manh.pack;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<Person>();
		System.out.println("heloo");
		//System.out.println("yellloo");
		System.out.println("heloo");
		//System.out.println("yellloo");
		p.add(new Person("deepa",100,12));
		p.add(new Person("apple",120,10));
		p.add(new Person("rani",50,13));
		p.add(new Person("deepa",10,5));
	 Collections.sort(p, new NameSort()) ;
	 System.out.println(p);
		TreeMap<Person,String> t=new 	TreeMap<Person,String >();
		
		t.put(new Person("deepa",100,12),"a");
		t.put(new Person("apple",120,10),"b");
		t.put(new Person("rani",50,13),"c");
		t.put(new Person("deepa",10,5),"d");
		 System.out.println((t.entrySet()));
			//Collections.sort(t,  new AgeSort());
	//	Collections.sort(p,  new AgeSort());
		 Iterator<Person> it=p.iterator();
			
		 while(it.hasNext())
		 {
			 Person a=it.next();
			 System.out.println(a+"  " +p.indexOf(a));
			
		 }
		System.out.println("*******");

		 Collections.sort(p,  new NameSort());
	        it=p.iterator();
			
		 while(it.hasNext())
		 {
			 Person a=it.next();
			 System.out.println(a+"  " +p.indexOf(a));
			
		 }
		 System.out.println("*******");
		 Collections.sort(p,  new Marks());
		  it=p.iterator();
			
		 while(it.hasNext())
		 {
			 Person a=it.next();
			 System.out.println(a+"  " +p.indexOf(a));
			
		 }
	}

}
