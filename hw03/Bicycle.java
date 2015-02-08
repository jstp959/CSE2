//Bicycle
//Program will: take input from user
//              calculate distance travled in a cyclometer
//              calculate time it took for trip

//import scanner class to take user inputs

import java.util.Scanner;


// begin class Bicycle
public class Bicycle {
    //main nmethod required
    public static void main (String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        System.out.print("Enter the number of seconds: "); //ask user for an input for seconds
        int nSeconds = myScanner.nextInt();
        
        System.out.print("Enter the number of counts: "); //ask user for an input for counts
        int nCounts = myScanner.nextInt();
        
        double wheelDiameter=27.0,  // double type constant for diameter of wheel
        PI=3.14159, //  store constant for pi
  	    feetPerMile=5280,  // store conversion for feet per mile
  	    inchesPerFoot=12,   // store conversion for inches per foot
    	secondsPerMinute=60;  // store conversion for seconds per minutes
	    double distance;
	    
	    
	    	//compute the distance taken for trip one
	    distance=nCounts*wheelDiameter*PI;
	    	// Above gives distance in inches
    	    //(for each count, a rotation of the wheel travels
    	    //the diameter in inches times PI)
    	    
	    distance/=inchesPerFoot*feetPerMile; // Gives distance in miles
	    
	    double distanceFake= distance*100;                   //convert to integer and then back in order to
        distanceFake= (int) distanceFake;                     //print with two decimals
        distanceFake= (double) distanceFake /100;
	    
	        //print the distance and time for trip
	    System.out.println("The distance was "+distanceFake+" and took "+(nSeconds/secondsPerMinute)+" minutes"); 
	    
	        //find time in hours to calculate miles per hour
	    double timeHours=nSeconds/secondsPerMinute/60;
	    
	    double avgSpeed=(distance/timeHours)*100;
	    avgSpeed= (int) avgSpeed;                     //print with two decimals
        avgSpeed= (double) avgSpeed /100;
	    
	    //print the average speed for the trip
	    System.out.println("The average mph was "+avgSpeed+"");
	    
        
    }  //end of main method   
} //end of 
