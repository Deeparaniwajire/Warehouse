package com.manh.pack;

import java.util.Comparator;

public class AgeSort implements Comparator<Person>
{		
	public int compare(Person p1, Person p2) {
		int res= p1.getAge()- p2.getAge();
		 if(res==0)
			  return 0;
		  else
			  if(res<0)
				  return -1;
			  else 
				  return 1;
	}

	/*@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
