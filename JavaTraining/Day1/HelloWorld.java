package com.bajaj.helloworld;
//keyword - special words having reserved meaning and hence cannot be used in the application, eg - package
//Access Specifier - Tells the level of access our class file has
//public -- anyone can access it
//private -- no outside world can access it
//default -- within package
//protected -- within package and inside class also

public class HelloWorld
//body of class
{
    //main method
    //static means you can access this method using class name and it is stored in stack area
    // void - return type of value that is going to be returns my main method
    //main function - entry point to program
    //String value to take command line parameter
    public static void main(String[] args) {
        System.out.println("Hello, World!!!!!");
        System.out.println("Harsh wishes you Good Morning");
    }
}
