//John St. Pierre       2/13/15
//[CSE2] hw 04

// ToHex
// Program will:    take input from user for 3 numbers: Red, Green, and Blue
//                  convert the numbers to base 16
//                  print the result as a string

//import scanner class to take user inputs
import java.util.Scanner;


public class ToHex{
    			// main method required for every Java program
   			public static void main(String[] args) {

        //declare Sanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );

//========================================================================================  
        //ask user for inputs of three colors
        System.out.println("");
        System.out.println("Please enter three numbers representing RGB values:");
        System.out.println("");
        
        //declare variables for colors
        int red, green, blue; 
        
        //declare strings for the digits in hexidecimak
        String rHex;
        String gHex;
        String bHex;
        
//=========================================================================================        
        //require that the user inputted an integer
        if(myScanner.hasNextInt()){
            //assign red to the inputted number
            red = myScanner.nextInt();
            
            //convert the number into hexidecimal and as a string
            rHex = Integer.toHexString(red);
            
            //give the user an error if they did not enter in range from 0-255
            if(red<0 || red>255){
                System.out.println("");
                System.out.println("Sorry, you must enter values between 0-255");
                return;
            }
            
            //add an extra 0 to the string if the color produces a single digit
            if(red<16){
                rHex = (0+rHex);
            }
        }
        
        //give user error for not inputting an integer
        else{
            System.out.println("");
            System.out.println("Sorry, you must enter integers");
            return;
            
        }
        
//========================================================================================        
        //require that the user inputted an integer
        if(myScanner.hasNextInt()){
            //assign green to the inputted number
            green = myScanner.nextInt();
            
            //convert the number into hexidecimal and as a string
            gHex = Integer.toHexString(green);
            
            //give the user an error if they did not enter in range from 0-255
            if(green<0 || green>255){
                System.out.println("");
                System.out.println("Sorry, you must enter values between 0-255");
                return;
            }
            
            //add an extra 0 to the string if the color produces a single digit
            if(green<16){
                gHex = (0+gHex);
            }
        }
        
        //give user error for not inputting an integer
        else{
            System.out.println("");
            System.out.println("Sorry, you must enter integers");
            return;
        }
            
//========================================================================================             
        //require that the user inputted an integer
        if(myScanner.hasNextInt()){
            //assign green to the inputted number
            blue = myScanner.nextInt();
            
            //convert the number into hexidecimal and as a string
            bHex = Integer.toHexString(blue);
            
            //give the user an error if they did not enter in range from 0-255
            if(blue<0 || blue>255){
                System.out.println("");
                System.out.println("Sorry, you must enter values between 0-255");
                return;
            }
            
            //add an extra 0 to the string if the color produces a single digit
            if(blue<16){
                bHex = (0+bHex);
            }
        }
        
        //give user error for not inputting an integer
        else{
            System.out.println("");
            System.out.println("Sorry, you must enter integers");
            return;
            
        }

//========================================================================================  


        //assign a variable for the final hexidecimal number as a string
        String hexadeci = rHex + gHex + bHex;
        
        //print the result
        System.out.println("");
        System.out.println("The decimal numbers R:"+red+", G:"+green+", B:"+blue+", is represented in hexidecimal as: "+hexadeci+"");
        System.out.println("");
        
   			} //end main method
}//end class
