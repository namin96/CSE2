/*
Neal Amin
CSE 002 HW 06
03/05/2015
This program will display fibonacci numbers depending on how many the user wants printed and also 
depending on what first two numbers the user enters.
*/


import java.util.Scanner;       //import scanner class



public class Fibonacci {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);     //create scanner object
        
        //ask user for the first two numbers and how many numbers they want printed
        System.out.println("Enter the first number in the sequence: ");
        int num1 = input.nextInt();
        
        System.out.println("Enter the second number in the sequence: ");
        int num2 = input.nextInt();
       
        System.out.println("How many custom Fibonacci numbers should be printed: ");
        int numTotal = input.nextInt();
        
        
        //while loop to check whether entered numbers are negative, if they are prompt user again
        while(num1 < 0 || num2 < 0 || numTotal < 0){
        
        System.out.println("Enter the first number in the sequence: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number in the sequence: ");
        num2 = input.nextInt();
        System.out.println("How many custom Fibonacci numbers should be printed: ");
        numTotal = input.nextInt();
        
        }
        
        int count = 2;      //set counter to two
        int sum = 0;        //set the sum to zero
        
        System.out.print("The numbers are: " + num1 + ", " + num2);     //print statement for first two entered numbers
        
        while(count < numTotal){
            sum = num1 + num2;      //third number is the sum of the first two numbers
            num1 = num2;            //assign the value of num2 to num1
            num2 = sum;             //sum becomes num2
            count++;                //increment the counter
            System.out.print(", " + num2);      //print out the comma before and after each number
            
        }
        System.out.print(".");      //period goes at the end of the numbers
    }
    
}