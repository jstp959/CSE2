//John St. Pierre       2/13/15
//[CSE2] lab 04

//Cookies
// Prograam will:   determine if you have enough cookies
//
//

//import scanner class to take user inputs
import java.util.Scanner;


public class Cookies{
    			// main method required for every Java program
   			public static void main(String[] args) {

        //declare Sanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        //ask user for an input  for people
        System.out.print("Enter the number of people: ");
        //initialize the value for people
        int nPeople=0;
        
        //test to make sure number is an integer
        if(myScanner.hasNextInt()){
            nPeople=myScanner.nextInt();
            if(nPeople<=0){
                System.out.println("You did not input an integer > 0");
            return;}}
        else{
            System.out.println("You did not enter an ineger");
            return;
        }
        
        //take input for number of cookies
        System.out.print("Enter the number of cookies: ");
        int nCookies=0;
        
        //test to make sure number is an integer
        if(myScanner.hasNextInt()){
            nCookies=myScanner.nextInt();
            if(nCookies<=0){
                System.out.println("You did not input an integer > 0");
                return;}}
        else{
            System.out.println("You did not enter an ineger");
            return;
        }   
        
        
        //take input for number for each person
        System.out.print("How many cookies do you want each person to get? ");
        int nEach=0;
        
        //test to make sure number is an integer
        if(myScanner.hasNextInt()){
            nEach=myScanner.nextInt();
            if(nEach<=0){
                System.out.println("You did not input an integer > 0");
                return;}}
        else{
            System.out.println("You did not enter an ineger");
            return;
        }    
          
            
        
        
       
            //test if there are enough cookies and it divides evenly
            if(nPeople*nEach<=nCookies && nCookies % nPeople==0) {
            System.out.println("You have enough for each person and the amount will deivide evenly");
            }
            
            //test if there are enough cookies and it does not divide evenly
            else if(nPeople*nEach<=nCookies && nCookies % nPeople != 0) {
            System.out.println("You have enough, but they will not divide evenly");
            }
            
            //test if there are not enough cookies
            else if(nPeople*nEach>=nCookies){
            System.out.println("You do not have enough cookies");
            }


}  //end of main method   
  	} //end of class
  	
  	
//FIX PROBLEM OF DECIMALS