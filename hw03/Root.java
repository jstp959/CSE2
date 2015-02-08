//Root
//Program will: crudely estimate the cube root of a number




//import scanner class to take user inputs

import java.util.Scanner;


// begin class Root
public class Root {
    //main nmethod required
    public static void main (String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        System.out.print("Enter a number, and I can print its cube root: "); //ask user for an input for seconds
        double number = myScanner.nextDouble();
        
        double guess = number / 3; //calculate first guess
        
        guess=(2*guess*guess*guess+number)/(3*guess*guess);  //incrament guesses to become closer and closer
        guess=(2*guess*guess*guess+number)/(3*guess*guess);
        guess=(2*guess*guess*guess+number)/(3*guess*guess);
        guess=(2*guess*guess*guess+number)/(3*guess*guess);
        double cubed=(2*guess*guess*guess+number)/(3*guess*guess);
        
        //print out results
        System.out.println("The cube root is "+cubed);
        System.out.println(""+cubed+"*"+cubed+"*"+cubed+" = "+cubed*cubed*cubed );
        
        
    }  //end of main method   
} //end of 
        