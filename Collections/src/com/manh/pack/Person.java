package com.manh.pack;

import com.manh.pack.SordDemo.Student;

public class Person  implements Comparable<Person >{

	String name;
	int age;
	int marks;
	public Person(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	public int compareTo(Person  o)
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
	/*@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;
	}*/
		
		}

