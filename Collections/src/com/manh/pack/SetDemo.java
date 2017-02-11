package com.manh.pack;

import java.util.*;

public class SetDemo {
	public static void main(String[] args)
	{
		set();
		treeSet();
		
	}
public static void set()
{
	Set<Integer> hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(10);
	hs.add(20);
	hs.add(5);
	Iterator<Integer> it=hs.iterator();
while(it.hasNext())
{
	Integer i=it.next();
	System.out.println(i);
	}
}

public static void treeSet()
{
	Set<Integer> t=new TreeSet<Integer>();
	t.add(2);
	t.add(1);
	t.add(0);
	System.out.println(t);
	
	Iterator<Integer> it=t.iterator();
	while(it.hasNext())
	{
		Integer i=it.next();
		System.out.println(i);
		}
	Set<String> ts=new TreeSet<String>();
	ts.add("Deepa");
	ts.add("Rani");
	ts.add("Apple");
	System.out.println(ts);
  
	}
}
