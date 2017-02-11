package com.manh.pack;

import java.util.*;

public class ArrayListDemo {
	 public static void main(String args[])
	 {
		List<String> al=new ArrayList<String>();
		List<String> al1=new ArrayList<String>();
		 al.add("Deepa");
		 al.add("Rani");
		 al.add(0,"wajire");
		 al1.add("ashish");
		 al1.add("Geeta");
		System.out.println(al.contains("rani"));
	 System.out.println(	al.size());
	 //   al.addAll(al1);
		 Iterator<String> it=al.iterator();
		
		 while(it.hasNext())
		 {
			 String s=it.next();
			 System.out.println(s+"  " +al.indexOf(s));
			// System.out.println(s);
			 
		 }
		 System.out.println("*****************\n");
		 al1.addAll(1,al);
	  	  it=al1.iterator();
		 while(it.hasNext())
		 {
			 String s=it.next();
			 System.out.println(s);
			 
		 }
		 
		 
		System.out.println(al1.containsAll(al));
		System.out.println("*****************\n");
		System.out.println(al1.remove(0));
		System.out.println(al1.remove(3));
		System.out.println(	al1.equals(al));
		
		System.out.println(al.toArray());
		
		System.out.println("&&&&&*****************&&&&&&&&&&&&&&&&");
		
		LinkedList<Integer> ilist=new LinkedList<Integer>();
		
		ilist.add(Integer.valueOf(10));
		ilist.add(20);
		ilist.addFirst(100);
		ListIterator<Integer> lt=ilist.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		//	Integer i=lt.next();
		//	System.out.println(i);
			
		}
		
		
		
	 }

}
