/*
Neal Amin
CSE 2
03/22/2016

This program will create three number stacks which will each be created using a for loop,
while loop, and do while loop. They will all show the same result for the entered number.

*/
import java.util.Scanner;       //import scanner

public class Triangles{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);     //create scanner object
        System.out.print("Enter a number between 5 and 30: ");  //prompt user to enter a number inclusive between 5 and 30
        int num = input.nextInt();              //have user enter a integer value
        
        while(num < 5 || num > 30){
            System.out.print("Please enter a number between 5 and 30 only: ");
            num = input.nextInt();
        }
        
        int count = 1;  //initialize counter
        int j = 1;      //initialize another counter
        
        System.out.println();       //skip line
        System.out.println("FOR LOOP: ");
        
        for(count = 1; count <= num; count++){      //count = 1, loop runs till count <= entered num, increment counter
            for(j = 1; j < count; j++){         //nested for loop to keep track of what is displayed on each line
                System.out.print(count);        //print count value
            }
            
            System.out.println(count);          //print second count value
        }
        
        for(count = num - 1; count >= 1; count--){      //for loop for bottom of number stack - count will start from entered num - 1
            for(j = 1; j < count; j++){         //nested for loop to keep track of what is display on each line
                System.out.print(count);        //print count value
            }
            System.out.println(count);          //print more count values depending on the first count value
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        //number stack with while loop
        System.out.println("WHILE LOOP: ");     
        count = 1;      //initialize count value
        while(count <= num){    //while count value is less than or equal to entered num - how many total lines will be printed
            j = 1;              //initialize j value 
            while(j < count){   //nested while loop for j is less than count - controls what will be printed on each line
                System.out.print(count);        //print count value 
                j++;                            //increment j 
            }
            
            System.out.println(count);      //print more count values
            count++;                        //increment count
        }
        
        count = num - 1;                //bottom of number stack, set count = to entered num - 1
        while(count >= 1){              //loop will control how many lines are printed
            j = 1;                      //set j = 1
            while(j < count){           //nested while loop controls how many is printed on each line
                
                System.out.print(count);    //print count value
                j++;                        //increment j 
            }
            System.out.println(count);      //print multiple count values
            count--;                        //decrement count
        }
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        //number stack with do while loop
        System.out.println("DO WHILE LOOP: ");
        count = 1;                          //set count = 1
        do{                                 //outer do while loop controls how many total lines will be printed
            
            j = 1;                          //set j = 1
            do{
                System.out.print(count);    //inner do while loop controls how many is printed on each line
                j++;                        //increment j
            } while(j <= count);
            System.out.println();           //skip line
            count ++;                       //increment count
            }while(count <= num);
            
       count = num - 1;                     //bottom of number stack, set count = num -1 
        do{                                 //outer do while loop controls how many total lines are printed
            j = 1;                          //set j = 1
            do{                             //inner do while loop controls how many is printed on each line
                System.out.print(count);
                j++;
            } while(j <= count);
            System.out.println();
            count--;                        //decrement count
            }while(count >= 1);
    }
}