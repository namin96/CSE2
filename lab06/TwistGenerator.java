/*
Neal Amin
CSE 2 Lab 06
03/04/16

This program will prompt the user for an integer and then print out a twist to the screen 
which consists of slashes and X's. The entered integer will serve as the twist length.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class TwistGenerator{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer value: ");
        String line = input.nextLine();
        
        while(!line.equals("-1")) {
			try {
				int num = Integer.parseInt(line);
				System.out.println("Length: " + num);
				
        
        while(num < 1){
            System.out.print("Please enter a postive integer value: ");
            num = input.nextInt();
        }
        
        int count = 1;
        
        while(count <= num){
            if(count % 3 == 1){
                System.out.print("\\");
            }
            else if (count % 3 == 2){
                System.out.print(" ");
            }
            else if (count % 3 == 0){
                System.out.print("/");
            }
            
            if(count == num){
                System.out.println();
            }
            count ++;
        }
        count = 1;
        while (count <= num){
            if (count % 3 == 1){
                System.out.print(" ");
            }
            else if(count % 3 == 2){
                System.out.print("X");
            }
            else if(count % 3 == 0){
                System.out.print(" ");
            }
            if (count == num){
                System.out.println();
            }
            count ++;
            
        }
        count = 1;
        while (count <= num){
            if(count % 3 == 1){
                System.out.print("/");
            }
            else if(count % 3 == 2){
                System.out.print(" ");
            }
            else if(count % 3 == 0){
                System.out.print("\\");
            }
            if (count == num){
                System.out.println();
            }
            count ++;
			} 
			}catch(NumberFormatException e) {
				System.out.println("Please enter a positive integer only: ");
			}
			
			line = input.nextLine();
		}
        
    }
}

