package com.bajaj.day2;

//i have private variable
//those variable should be access by class only

//Employee
//Laptop --private userid and private password 
//Employee  --- 
class Employee1
{
	//do not share your private details to anyone 
	//private
	private String username;
	private int password;
	//1234567890
	
	//Different user can login
	//IT
	//Employee
	//Manager
	//method should be public
	public void login(String username, int password)
	{
		
	System.out.println("working on System");	
		
	}
	
	
}


public class MyEncapsulation {
	
	public static void main(String args[])
	{
		Employee1 s1=new Employee1();
		s1.login("root", 12345);
		//
	}

}
