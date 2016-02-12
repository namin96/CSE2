/*
Neal Amin
CSE 2 HW 03 Program 2
02/16/2016

This program will prompt the user for dimensions of a pyramid and will return the calculated volume inside the pyramid.

*/
import java.util.Scanner; //import class

public class Pyramid {
    public static void main(String[] args){
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter the dimensions of a pyramid 
        System.out.print("The square side of the pyramid is (input length): ");
        double length = input.nextDouble();    //read a double value 
        
        System.out.print("The height of the pyramid is (input height): ");
        double height = input.nextDouble();    //read a double value
        
        //calculate the volume based off of the entered dimensions
        double volume = ((length*length)*height)/3;   //store calculated volume as a double

        //Display the calculated volume of the pyramid to the screen
        System.out.println("The volume inside the pyramid is: " + volume);
        
        
    }
}