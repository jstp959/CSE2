//John St. Pierre       2/27/15
//[CSE2] hw 06

// Get Integers
// Program will:    calculate and print the sum of prime numbers


//import scanner class to take user inputs
import java.util.Scanner;


public class GetIntegers{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    
   			    
   			//declare Sanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in ); 
        
        int number = 0;
        int sum = 0;
        
        System.out.println("Please enter the five numbers: ");
        
        for (int i=0; i<5; i++){
        
        
            if(myScanner.hasNextInt()){
            number = myScanner.nextInt();
                
                if(number>0){           
                sum = number + sum;
                }
                
                else{
                    System.out.println("Please enter a positive integer");
                    i--;
                    myScanner = new Scanner ( System.in );
                }
            }
            
            else{
            System.out.println("Please enter a positive integer");
            i--;
            myScanner = new Scanner ( System.in );
            }
        
        
        }    
   		
   		System.out.println("Sum is " +sum);	    
   			    

   			    
   			} //end main method
} // end