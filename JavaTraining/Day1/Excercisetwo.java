package com.bajaj.helloworld;
import java.util.Scanner;

public class Excercisetwo {
    public static void checkNum(int n){
        if(n%2==0) System.out.println("Number is Even");

        else System.out.println("Number is Odd");
    }
    public static void main(String[] args) {

        //check leap year
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Enter a Year ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            if(year %100!=0){
                System.out.println("Leap Year");
            }
            else{
                if(year%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }

        }
        else{
            System.out.println("Not a Leap Year");
        }

        //Check Number is even or odd using method
        int number;
        System.out.println("Enter Number to check Even or Odd");
        number = sc.nextInt();

        checkNum(number);


        //Check whether character is Vowel or Consonant
        char alpha;

        System.out.println("Enter Character to check Vowel or Consonant");
        alpha = sc.next().charAt(0);

        char alphabet = Character.toLowerCase(alpha);

        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': {
                System.out.println("Character is Vowel");
                break;
            }
            default:{
                System.out.println("Character is Consonant");
                break;
            }

        }

    }
}
