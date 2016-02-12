/*
Neal Amin
02/12/2016
CSE 2 Lab 03

The purpose of this program is to use the scanner class to obtain the original cost of the check, the percentage tip they 
wish to pay, and the number of ways the check will be split after a group of friends dines outside. How much each person needs to pay 
will then be determined. 

*/

import java.util.Scanner;   //import class

public class Check {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the original cost of the check in the form xx.xx: ");  //prompt user to enter cost
        double checkCost = myScanner.nextDouble();  //read in the value entered by the user as a double
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100;  //we want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;  //whole dollar amount of cost for storing digits to the right of the decimal point for the cost
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost/numPeople;
        dollars = (int)costPerPerson; //get the whole amount dropping the decimal fraction
        dimes = (int)(costPerPerson*10) % 10;
        pennies = (int)(costPerPerson*100) % 10;
        
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
        
        
    }
}

