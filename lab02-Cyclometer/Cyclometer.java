// Neal Amin
// 02/05/16
// CSE 2
// The purpose of this program is to print the number of minutes per each bicycle trip, print the number of rotation counts for 
// each bicycle trip, print the distance of each bicycle trip in miles, and print the total distance for both bicycle trips combined.

public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
    
    //our input data
    
    int secsTrip1 = 480;    //trip 1 is an int variable type and 480 seconds is assigned to the variable
    int secsTrip2 = 3220;   //trip 2 is an int variable type and 3220 seconds is assigned to the variable
    int countsTrip1 = 1561; //rotation counts for trip 1 is an int variable type and 1561 rotations are assigned to it
    int countsTrip2 = 9037; //rotation counts for trip 2 is an int variable type and 9037 rotations are assigned to it
    
    //our intermediate variables and output data
    
    double wheelDiameter = 27.0, //wheel diameter is a double data type and 27.0 is the value assigned to it
    PI = 3.14159, //constant PI is declared
    feetPerMile = 5280, //assign 5280 feet to feetPerMile(conversion factor)
    inchesPerFoot = 12, //assign 12 inches to a foot (conversion factor)
    secondsPerMinute = 60; //assign 60 seconds to a minute (conversion factor)
    
    double distanceTrip1, distanceTrip2, totalDistance; //declare distanceTrip1, distanceTrip2, and totalDistance as double data types
    
    //print data to screen
    System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + "counts.");
    System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + "counts.");
    
    //calculate distance of both trips
    distanceTrip1 = countsTrip1*wheelDiameter*PI; //distance in inches(for each count, a rotation of the wheel travels
    //the diameter in inches times pi)
    distanceTrip1 /= inchesPerFoot*feetPerMile; //Gives distance in miles
    distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance = distanceTrip1+distanceTrip2; //total distance
    
    //print out distances
    System.out.println("Trip 1 was " + distanceTrip1 + " miles");
    System.out.println("Trip 2 was " + distanceTrip2 + " miles");
    System.out.println("The total distance was " + totalDistance + " miles");
    
    
    } //end of main method
}