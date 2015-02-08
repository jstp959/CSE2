//FourDigits
//Program will: take input of a double
//              print first four digits after the decimal point


//import scanner class to take user inputs

import java.util.Scanner;


// begin class Root
public class FourDigits {
    //main nmethod required
    public static void main (String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        //ask user for an input for double
        System.out.print("Enter a number and I display the four digits to the right of the decimal point: ");
        
        //assign variable to user's number
        double number = myScanner.nextDouble();
        
        int tenths, hundreths, thous, tenThuos;
        
        tenths=(int)(number*10)%10;   //calculate the thents place
        
        hundreths=(int)(number*100)%10;  //calculate the hundreths place
        
        thous=(int)(number*1000)%10;  //calculate the thousandths place 
        
        tenThuos=(int)(number*10000)%10;    //calculate the thenthousandths place
        
        //print the four digits
        System.out.println("The four digits are "+tenths+""+hundreths+""+thous+""+tenThuos);
        

    } //end of main method
} //end of clas