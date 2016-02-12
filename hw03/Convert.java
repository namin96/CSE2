/*
Neal Amin
CSE 2 HW 03
02/16/2016

This program will prompt the user for a measurement in meters and then convert the measurement to inches and display 
the correct amount of inches on the screen.

*/
import java.util.Scanner; //import class

public class Convert {
    public static void main(String[] args){
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter measurement in meters 
        System.out.print("Enter the distance in meters: ");
        double meters = input.nextDouble();
        
        //convert meters to inches
        double inches = meters * 39.3701;
        
        //display the measurement in inches on screen
        System.out.println(meters + " meters is " + inches + " inches");
        
    }
}

