package com.manh.pack;

import java.util.Comparator;

public class NameSort implements Comparator<Person>
{		
	public int compare(Person p1, Person p2) {
		int res= p1.getName().compareTo(p2.getName());
		 if(res==0)
			  return 0;
		  else
			  if(res<0)
				  return -1;
			  else 
				  return 1;
	}
}
