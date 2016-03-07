/*
Neal Amin
CSE 002 HW 06
03/05/2015
This program will calculate factorial using a while loop for numbers entered between 9 and 16 
inclusively.
*/

import java.util.Scanner;

public class RunFactorial{
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);         //create scanner object
        
        System.out.println("Please enter an integer that is between 9 and 16: ");
        int num = input.nextInt();
        
        while(num<9 || num > 16){
            System.out.println("Invalid input, enter again! ");
            num = input.nextInt();
            
        }
        
        
        
        int factor = num;       //set factor equal to the number entered
        int count = 1;          //initialize a counter that will begin at 1
        
        while(count < num){     //while count is less than the number entered
            
            factor = factor * count;    //factor equals num entered * count then factor gets reassigned each time loop runs
            count++;                    //increment counter
            
         }
        
        System.out.println(num + "! = " + factor);        //print statement for the factorial
    }
}

