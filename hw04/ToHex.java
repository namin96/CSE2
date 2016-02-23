/*
Neal Amin
CSE 2
HW 04 
02/23/2016

This program will take decimal RGB values(three inputs) and convert them to hexadecimal and
display the hexadecimal(6 characters - letters or numbers) on the screen. 
*/



import java.util.Scanner; 

public class ToHex{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);         //create a scanner object
        
        System.out.print("Please enter three numbers representing RGB values: "); //prompt user to enter three sets of numbers
        
        int value1 = input.nextInt(), value2 = input.nextInt(), value3 = input.nextInt();   //declare the numbers to be entered by user as integer values
        
        
        //if statement to check whether the numbers entered are between 0-255 the allowed range
        if ((value1 > 255 || value2 > 255 || value3 > 255) || (value1 < 0 || value2 < 0 || value3 < 0)){
            
            System.out.println("Sorry, you must enter values between 0-255.");  //if if statement is true then print this statement
        }
        
        int decValue1 = value1 / 16;        //calculate decimal value for first entered value
        int decRemValue1 = value1 % 16;     //calculate remainder decimal value for first entered value
        int decValue2 = value2 / 16;        //calculate decimal value for second entered value
        int decRemValue2 = value2 % 16;     //calculate remainder decimal value for second entered value
        int decValue3 = value3 / 16;        //calculate decimal value for third entered value
        int decRemValue3 = value3 % 16;     //calculate remainder decimal value for third entered value
                        
        
        //print statement
        System.out.print("The decimal numbers R: " + value1 + ",G: " + value2 + ",B: " + value3 + " is represented in hexadecimal as: ");
            
        if (value1 /16 <= 9){               //check if the value of 16 being divided into the entered value is less than or equal to 9
                System.out.print(decValue1);    //if true then the hexadecimal is equal to the value obtained by the division
            }
            
            switch (decValue1){             //if that value is greater than 9 then a letter will be printed
            case 10: System.out.print("A");
            break;
            case 11: System.out.print("B");
            break;
            case 12: System.out.print("C");
            break;
            case 13: System.out.print("D");
            break;
            case 14: System.out.print("E");
            break;
            case 15: System.out.print("F");
            break;
            }
                
                
            if (value1 % 16 <= 9){      //check if the value of 16 being divided into the entered value is less than or equal to 9
                System.out.print(decRemValue1);     //if true then the hexadecimal is equal to the value obtained by the division
                
            }
            
            switch (decRemValue1){      //if true then the hexadecimal is equal to the value obtained by the division
            case 10: System.out.print("A");
            break;
            case 11: System.out.print("B");
            break;
            case 12: System.out.print("C");
            break;
            case 13: System.out.print("D");
            break;
            case 14: System.out.print("E");
            break;
            case 15: System.out.print("F");
            break;
        }
            
             if (value2 /16 <= 9){
                System.out.print(decValue2);
             }
             
             switch (decValue2){        //if true then the hexadecimal is equal to the value obtained by the division
            case 10: System.out.print("A");
            break;
            case 11: System.out.print("B");
            break;
            case 12: System.out.print("C");
            break;
            case 13: System.out.print("D");
            break;
            case 14: System.out.print("E");
            break;
            case 15: System.out.print("F");
            break;
            }
                
            if (value2 % 16 <= 9){
                System.out.print(decRemValue2);
                
            }
            
            switch (decRemValue2){
            case 10: System.out.print("A");
            break;
            case 11: System.out.print("B");
            break;
            case 12: System.out.print("C");
            break;
            case 13: System.out.print("D");
            break;
            case 14: System.out.print("E");
            break;
            case 15: System.out.print("F");
            break;
        }
            
             if (value3 /16 <= 9){
                System.out.print(decValue3);
             }
             
             switch (decValue3){
            case 10: System.out.print("A");
            break;
            case 11: System.out.print("B");
            break;
            case 12: System.out.print("C");
            break;
            case 13: System.out.print("D");
            break;
            case 14: System.out.print("E");
            break;
            case 15: System.out.print("F");
            break;
            }
                
            if (value3 % 16 <= 9){
                System.out.print(decRemValue3);
                
            }
            
            switch (decRemValue3){
            case 10: System.out.print("A");
            break;
            case 11: System.out.print("B");
            break;
            case 12: System.out.print("C");
            break;
            case 13: System.out.print("D");
            break;
            case 14: System.out.print("E");
            break;
            case 15: System.out.print("F");
            break;
        }
            
            
        
        
    }
}


