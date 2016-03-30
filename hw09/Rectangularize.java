/*
Neal Amin
CSE 2
3/29/16

This program will use two methods, one will pass on an int and one will pass on a string
the user will be first prompted to enter a string and then that string will be printed out 
as many times as the number of characters in that entered string. For the number that is entered 
the % will be printed out depending on which number is entered.
*/

import java.util.Scanner;   //import class

public class Rectangularize{    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);     //scanner object
        System.out.println("Please enter an input (string): ");     //prompt user to enter string
        String word = input.nextLine();             //string word will store the entered string
        
        rectangle(word);                            //call method rectangle and pass on string word
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter an input (int): ");
        int num = input2.nextInt();
        
        rectangle(num);
    }
    public static void rectangle(String word){      //will run when method is called
        int i = 0;                                  //have i = 0
        System.out.println("Output: ");             
        for(i = 0; i < word.length(); i++){         //for loop will run upto the length of the entered word
            System.out.println(word);               //will print the word and skip line each iteration
        }
    } //end of method
    
    public static void rectangle(int num){          //will run when method rectangle is called with int num being passed on
        int i = 0;                                  //have i = 0;
        System.out.println("Output: ");             
        for(i = 0; i < num; i++){                   //for loop will run from 0 upto the entered number
        System.out.print("%");                      //each iteration the % will be printed on same line
        }
        System.out.println("");                     //skip line
    } //end of method
        
        }
