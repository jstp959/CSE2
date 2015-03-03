//John St. Pierre       2/27/15
//[CSE2] hw 06

// Run Factorial
// Program will:    find the factorial of a user inputtet number

//import scanner class to take user inputs
import java.util.Scanner;


public class RunFactorial{
    			// main method required for every Java program
   			public static void main(String[] args) {

        //declare Sanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        //declare and assign the variables
        int inputNo = 1;
        int factorial = 1;
        int multiple = 1;
        int firstTime = 1;
        
        System.out.println("Please enter an integer betweem 9 and 16");
        
        //create a boolean to test for an integer (I was having issues just using .hasNextInt in the later if statement)
        boolean isItAnInt = myScanner.hasNextInt();
        
        //begin the while loop
        while(multiple>0){
            
            
            //here, just using .hasNextInt was giving me trouble, so I set it as a variable outside the loop
            if(isItAnInt){
                
                //set the variables only once                
                if(firstTime>=1){
                inputNo = myScanner.nextInt();
                multiple = inputNo;
                
                //decrement to ensure this only runs once
                firstTime--;
                }
                
                //calculate the factorial and test for valid input
                if(inputNo>=9 && inputNo<=16){           
                factorial *= multiple;
                
                //decrement the multiple so that it will multiply by one less each time
                multiple--;
                
                
                }
                
                else{
                    
                    //tell the user he inputted an invalid input
                    System.out.println("Invalid input, enter again!");
                    
                    //ask for new scanner
                    myScanner = new Scanner ( System.in );
                    
                    //re-test to see if it is an int
                    isItAnInt = myScanner.hasNextInt();
                    
                    //incrament firstTime so that it will re-run that portion of the code
                    firstTime++;
                }
                
                //re-set for negative numners (I got weird results with negatives, so i put this in)
                if(inputNo<=0){
                    multiple = 1;
                }
            }
            
            else{
            
            //tell the user he inputted an invalid input
            System.out.println("Invalid input, you must enter an integer, enter again!");
            
            //make a dummy varibale to store bad value
            String dummy = myScanner.nextLine();
            
            //re-test to see if it is an int
            isItAnInt = myScanner.hasNextInt();

            
            }
            
        } //end the while loop
        
    //print the result
    System.out.println("Input Accepted");
    System.out.println(inputNo+ "!= " +factorial);        
    
   			}//end method
}//end
        
        