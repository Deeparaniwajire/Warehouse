package com.manh.pack;

import java.util.*;

public class SordDemo {

	public static void main(String[] args) {
		ArrayList<Student>  s=new ArrayList<Student>();
		s.add(new Student("Deepa",120));
		s.add(new Student("Rani",100));
		s.add(new Student("Wajire",50));
		Collections.sort(s);
		 Iterator<Student> it=s.iterator();
			
		 while(it.hasNext())
		 {
			 Student a=it.next();
			 System.out.println(a+"  " +s.indexOf(a));
			
		 }
		 
		 Set<Student>  s1=new TreeSet<Student>();
		 s1.add(new Student("Deepa",120));
			s1.add(new Student("Rani",100));
			s1.add(new Student("Wajire",50));
			
			System.out.println(s1);
			
			
			TreeMap<Student,String> t=new 	TreeMap<Student,String >();
			
			t.put(new Student("deepa",100),"a");
			t.put(new Student("apple",120),"b");
			t.put(new Student("rani",50),"c");
			t.put(new Student("deepa",10),"d");
			System.out.println((t.entrySet()));
	}
public static class Student implements Comparable<Student>
{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
public int compareTo(Student o)
{
int res= getMarks()-o.getMarks();
  if(res==0)
	  return 0;
  else
	  if(res<0)
		  return -1;
	  else 
		  return 1;
  }
	
	}
}
