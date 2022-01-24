package com.bajaj.day3;


//Generic Class --pass data type as paramters to class
//wrapper classes
class Employee<T,V,Z>
{
//fixed int
 private T id;
 //fixed String
 private V name;
 private Z salary;
 
 Employee(T id, V name,  Z salary)
 {
	this.id=id;
	this.name=name;
	this.salary=salary;
 }
}



public class GenericClass {
	
	public static void main(String args[])
	{
                            //long        //long
       Employee<Long,String,Long> e2=new Employee(100,"Ansar",100);
    
       Employee<Double,String,Long> e3=new Employee(100.00,"Ansar",100);
       
       
       
	}

}
