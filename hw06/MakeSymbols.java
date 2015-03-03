//John St. Pierre       2/27/15
//[CSE2] hw 06

// Make Symbols
// Program will:    generate a random number and print out that number of stars or ands


//import scanner class to take user inputs

public class MakeSymbols{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    
            
            // declare/assign the number and counter
            int number = (int) ((Math.random()*101) - 1);
            int counter = number;
            
            //print the number for the user
            System.out.println("Random number generated: " +number);
            
            
            //begin the do-while loop
            do{
                
                //take into account the case where the number is 0
                if(number == 0){
                    System.out.println(" ");
                }
                
                //print the stars if they are even
                else if(number%2.0 == 0.0){
   			        System.out.print("*");
   			        
   			        //decrement the counter
   			        counter--;
                }
                
                
                //print the ands if they are odd
                else{
                    System.out.print("&");
                    
                    //decrement the counter
                    counter--;
                }
   			   
   			   
   			//end the do-while loop   
   			} while(counter>0);
            
            //print a blank line to make it look nicer
            System.out.println(" ");

            
            
   			}//end method
}//end
