//John St. Pierre       3/6/15
//[CSE2] lab07

// Run Factorial
// Program will:   print stars using nested loops

//import scanner class to take user inputs
import java.util.Scanner;


public class zigzag{
    			// main method required for every Java program
   			public static void main(String[] args) {

        //declare Sanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
       
 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++      
        int nStars = 10;
        int i = 0;
        int j = 0;
       
        while (nStars>0){
            
            while (i>0){
            System.out.print(" ");
            i--;
            }
            
        System.out.println("*");
        nStars--;
        j++;
        i = j;
        }
        
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++        
       
        
        nStars = 10;
        i = 0;
        j = 0;
       
       if (nStars<3||nStars>33){
       
       
        while (nStars>0){
            
            while (i>0){
            System.out.print(" ");
            i--;
            }
            
        System.out.println("*");
        nStars--;
        j++;
        i = j;
        }
        
       }
        
        
        
        
        
   			}
}
