package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

class Person6 implements Comparable<Person6>
{
	String name;
	int age;
	
	Person6(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
	
				  System.out.println("Name :"+name +"  Age :"+age);
	}
	
public int compareTo(Person6 o) {
	// TODO Auto-generated method stub
	return 0;
}
}
public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person6> people=new ArrayList<>();
		people.add(new Person6("John",30));
		people.add(new Person6("Anil",20));
		people.add(new Person6("Baskar",17));
		
		Collections.sort(people);

		for(Person6 person:people)
		{
			person.display();
		}
	}
 }

		



