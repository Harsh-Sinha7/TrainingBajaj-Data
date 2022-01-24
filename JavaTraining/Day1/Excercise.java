package com.bajaj.helloworld;
import java.util.Scanner;
public class Excercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Print an Integer entered by User
        //Program to add two integers
        int input1, input2;

        System.out.println("Enter a number");
        input1 = sc.nextInt();
        System.out.println("First Number entered by the use is: "+input1);

        System.out.println("Enter another number");
        input2 = sc.nextInt();
        System.out.println("Second Number entered by the use is: "+input2);

        System.out.println("Sum of the numbers by the user is: "+(input1+input2));

        //check maximum of three numbers using if else
        int input3,max=0;
        System.out.println("Enter third number so we can check which one is maximum");
        input3 = sc.nextInt();

        if(input1 >=input2){
            if(input1 >= input3){
                max = input1;
            }
            else if(input1 <input3){
                max = input3;
            }
        }
        else if(input2 >=input1){
            if(input2>=input3){
                max=input2;
            }
            else if(input2 < input3) {
                max = input3;
            }

        }
        System.out.println("Largest number is : "+max);

        //swapping two numbers using third variable
        int third;
        third = input1;
        input1 = input2;
        input2 = third;

        System.out.println("Using third variable the values have been swapped");
        System.out.println("First Number is "+input1+" and Second Number is "+input2);


        //Program to show multiplication of two floating point numbers
        float num1, num2,mult;

        System.out.println("Enter two floating point numbers");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        mult = num1 * num2;
        System.out.println("Multiplication of two floating numbers is : "+String.format("%.2f",mult));

        //Program to print ASCII value of character
        char inp;
        System.out.println("Enter a character");
        inp = sc.next().charAt(0);
        int ascii_val;
        ascii_val = inp - '0';
        System.out.println("ASCI value of character "+inp+" is : "+ascii_val);



    }
}
