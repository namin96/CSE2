/*
Neal Amin
CSE 2  
03/22/16

This program will print a twist pattern with *, \,/, and spaces. 


*/

import java.util.Scanner;       //import scanner
public class Twisty{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); //create scanner object
        System.out.print("Input your desired length: ");    //have user enter desired length
        int length = input.nextInt();
        System.out.print("Input your desired width: ");     //have user enter desired width
        int width = input.nextInt();
        
        /*bool acceptable = false;
        while(!acceptable){
            if(input.hasnextInt()){
                length = input.nextInt();
                width = input.nextInt();
                acceptable = true;
                
            }
            else{
                System.out.print("ERROR, please type in an integer: ");
                input.next();
            }
        }*/
        while(length > 80 || width > length){
            System.out.print("Input a length less than 80 only: ");
            length = input.nextInt();
            System.out.print("Input your desired width which is less than the length: ");
            width = input.nextInt();
        }
       
        
        
        
        
        
        //initialize counters
        int i= 0;
        int j = 0;
        
        
        
        
        
        for(i = 0; i < width; i++){     //for loop to control how many lines are printed
        	
            
            
            for(j = 0; j < length; j++){    //inner for loop controls how many characters and what characters are printed on each line
                
                if(i % length == j % width && (j / width) % 2 == 0) {   //use modulus to print #
                    System.out.print("#");
                }  
                else if(i % length == j % width && (j / width) % 2==1){ //if modulus is equal to 1 
                	System.out.print("\\");                             //print out backward slash
                } 
                else{
                    System.out.print(" ");          //print out space
                }
                
            }
            System.out.println();   //skip line
        }
    }
}