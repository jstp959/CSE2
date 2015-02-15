//John St. Pierre       2/15/15
//[CSE2] hw 04

// Banking
// Program will:    determine a random number to serve as a balance in a bank account
//                  allow user to deposit money, withdraw money, or view their balance


//import scanner class to take user inputs
import java.util.Scanner;


public class Banking {
    			// main method required for every Java program
   			public static void main(String[] args) {

        //declare Sanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        //establish a random number for the current balance
        double random = ((Math.random() * 4000) + 1000);
        random = random*100;                 //convert to integer and then back in order to
        random = (int) random;                             //show two decimals
        random = (double) random /100;
        
        //ask user what they want to do
        System.out.print("Would you like to deposit money (1), withdraw money (2), or view your balance (3) ");
        
        //declare a variable for their decision
        int decision=myScanner.nextInt();
        
        //begin the switch statement
        switch (decision){
            
            //begin case 1, where they choose to deposit money
            case 1:
                System.out.print("How much would you like to deposit? ");
                double deposit = myScanner.nextDouble();
                
                //calculate new balance
                double balance = random + deposit;
                balance = balance*100;                 //convert to integer and then back in order to
                balance = (int) balance;                             //show two decimals
                balance = (double) balance /100;
               
                    //use if statement to ensure they used a positive value
                    if (deposit>=0){
                        
                    //print out the new balance
                    System.out.println("Your balance was $"+random+" and is now $"+balance+" ");
                    }
                    
                    else if(deposit<0){
                    System.out.println("Sorry, that is not a positive value");
                    }
            break;
                
                
            //begin case 2, where they choose to withdraw money   
            case 2:
               System.out.print("How much would you like to withdraw? ");
               double withdraw = myScanner.nextDouble();
               double balance2 = random - withdraw;
               
               //calculate new balance
               balance2 = balance2*100;                 //convert to integer and then back in order to
                balance2 = (int) balance2;                             //show two decimals
                balance2 = (double) balance2 /100;
               
               
               //use if statement to ensure they used a positive value, and that they did not take out more than they currently have
                if(withdraw>=0&&withdraw<=random){
                System.out.println("Your balance was $"+random+" and is now $"+balance2+" ");
                }
                
                else if(withdraw>=random){
                System.out.println("Sorry, you only have $"+random+" in your account");
                }
                
                else if(withdraw<0){
                System.out.println("Sorry, you must withdraw a positive value");
                }
                
            break;
            
            //begin case 3, where they simply want to view their balance   
           case 3:
               System.out.println("Your balance is $"+random+"");
               break;
            
            //use the default case to give an error if they don't input either 1 2 or 3   
            default:
                System.out.println("Sorry, you did not select either 1, 2, or 3");
                break;
        }
                
        
        
        
        
   			}//end main method
}//end program
        
        