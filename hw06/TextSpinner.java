/*
Neal Amin
CSE 2
03/05/2016
This program will use an infinite loop to print 4 characters to the screen.The counter will reset once it hits 4
and therefore it's an infinite loop. 
*/

public class TextSpinner{
    public static void main(String[] args){
        
        int i = 0;  //initialize a counter i 
        
        while(i < 5){   //while i is less than 5
            
            i++;        //increment counter
            
            if(i == 1){ //when i = 1
                System.out.print("\b/");    //print statement deletes previous character and prints new one
            }
            if(i == 2){ //when i = 2
                System.out.print("\b-");    //delete previous character and print new one
                
            }
            if(i == 3){
                System.out.print("\b\\");   //delete previous character and print new one
                
            }
            if(i == 4){
                System.out.print("\b|");    //delete previous character and print new one
                i = 0;                      //reset counter to 0
            }
            
        }
    }
}