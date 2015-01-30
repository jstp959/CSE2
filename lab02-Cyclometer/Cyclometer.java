//Cyclometer
//Program will: print the number of minutes for each trip
//              print the number of counts for each tirp
//              print the distance of each trip in miles
//              print the distance for the two trips combined



public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {



int secsTrip1=480;  // variable stores information for the first trip
       	int secsTrip2=3220;  // variable stores information for the second trip
		int countsTrip1=1561;  // variable stores info for counts 1
		int countsTrip2=9037; // variable stores info for counts 2
		
	
double wheelDiameter=27.0,  // double type constant for diameter of wheel
    PI=3.14159, //  store constant for pi
  	feetPerMile=5280,  // store conversion for feet per mile
  	inchesPerFoot=12,   // store conversion for inches per foot
  	secondsPerMinute=60;  // store conversion for seconds per minutes
	double distanceTrip1, distanceTrip2,totalDistance;  // etablish distance variables as double
	

System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");  //print the minutes and spins for trip one
System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts."); //print the minutes and spins for trip two
       	      
   	      
		//compute the distance taken for trip one
	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	totalDistance=distanceTrip1+distanceTrip2; //calculate total distance by adding other distances

//Print out the previously calculates distances data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
	
   	}  //end of main method   
} //end of 


