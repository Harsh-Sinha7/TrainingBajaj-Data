package com.bajaj.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student 
{

@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
public Student(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
//three sort id	
private int id;
//name
private String name;
//fees
private int fees;
/*
 * @Override public int compareTo(Student o) { // TODO Auto-generated method
 * stub return this.getName().compareTo(o.getName()); }}
 */
}
public class MyStudent {
	
	
	public static void main(String args[])
	{
      List<Student> students=new ArrayList<Student>();
      students.add(new Student(3, "Pooja", 2000));
      students.add(new Student(1, "Kamesh", 1000));
      students.add(new Student(60, "Zee", 400));
      students.add(new Student(5, "Priya", 2000));
      students.add(new Student(100, "Jiya", 100));
      students.add(new Student(30, "Sam", 20000));
      students.add(new Student(50, "Ayuesh", 500));
      //System.out.println(students);
      
      for(Student s:students)
      {
    	//System.out.println(s);  
      }
      
     //call the Collections.sort method
      // pass the students list to sort method
      //implement the comparable interface 
      // pass the key for sorting
      // E1 > E2 == 1
      //E1  < E2 ==-1
      //E1==E2==0
     // Collections.sort(students,new SortByName());
      //Collections.reverseOrder();
      for(Student s:students)
      {
    	System.out.println(s);  
      }
      
	}

}
