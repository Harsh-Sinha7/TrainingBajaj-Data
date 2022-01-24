package com.bajaj.helloworld;

//class
//object
//inheritance -extending the properties of another class
//variable
//method

//1 rule --we always have two or more classes

//any number of class in on file

//Single Level
class A
{
//DI

    //method
    //method overloading
    //you can have any number of method with same name but different parameters
//
    int a;
    //one
    A(int a)
    {
        this.a=a;
    }
    //one
    A()
    {

    }
    //three
    A(int a,int b)
    {

    }

    public A(int i, int j, int k) {
        // TODO Auto-generated constructor stub
    }
    public void printA() {
        System.out.println("A class");
    }
}
//extends -
//class name
class B extends A
{


    B(int a)
    {
        super();
        //super is keyword
        //it is used to send back the value to parent class
        //calling the parent call constructor

        //Calling constructor of A class

        System.out.println("A  ");
        System.out.println("b  ");
        System.out.println("c ");
        // super();

    }

    public void printB()
    {
        System.out.println("B class " + a);
        //System.out.println(a);
    }
}



public class MyInheritance {

    public static void main(String args[])
    {

        B obj=new B(200);
        System.out.println(obj.a);
        //extending the method
        obj.printA();
        obj.printB();
    }

}
