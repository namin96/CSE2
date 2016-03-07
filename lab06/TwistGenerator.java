/*
Neal Amin
CSE 2 Lab 06
03/04/16

This program will prompt the user for an integer and then print out a twist to the screen 
which consists of slashes and X's. The entered integer will serve as the twist length.
*/

import java.util.Scanner;

public class TwistGenerator{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter a positive integer value: ");
        int num = input.nextInt();
        
        while(num < 1){
            System.out.print("Please enter a postive integer value: ");
            num = input.nextInt();
        }
        
        int count = 0;
        
        while(count < num){
            System.out.println("\\");
            count ++;
            
        }
    }
}