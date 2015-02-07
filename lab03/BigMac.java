//Big Mac
//Program will calculate:   how many big macs
//                          cost per big mac
//                          percentage tax
//                          display cost

import java.util.Scanner;

// import java scanner to use scanner class
//
// begin class BigMac
public class BigMac {
    //main nmethod required
    public static void main (String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        System.out.print("Enter the number of Big Macs (an integer > 0) : "); //ask user for an input for number
        int nBigMacs = myScanner.nextInt();
        
        System.out.print("Enter the cost per Big Mac as"+  //ask user for input of cost
            " a double (in the form xx.xx): " );
            
        double bigMac$ = myScanner.nextDouble();  //declare variable for cost
	    
	    System.out.print(
             "Enter the percent tax as a whole number (xx): ");
       
        double taxRate = myScanner.nextDouble();    //declare variable for tax
        
        taxRate/=100; //user enters percent, but I want
                        //proportion, so we multiply by 100
                        
        double cost$;   //declare variable for cost in dollars
        
        int dollars, dimes, pennies;     //whole dollar amount of cost as an integer dimes, pennies;
                            //for storing digits to the right of the decimal point 
                            //to the right of the decimal point for the cost$ 
                            
        cost$ = nBigMacs*bigMac$*(1+taxRate);
                //get the whole amount, dropping decimal fraction
        
        dollars=(int)cost$;
                //get dimes amount, e.g., 
                // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
                //  where the % (mod) operator returns the remainder
                //  after the division:   583%100 -> 83, 27%5 -> 2 
        
        dimes=(int)(cost$*10)%10;   //assign the thents place of cost
        
        pennies=(int)(cost$*100)%10;  //assign the hundreths place of cost
        
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per BigMac, with a sales tax of "+ (int)(taxRate*100) + "%, is $" +dollars+'.'+dimes+pennies);
        
    } //end of main method
} //end of clas