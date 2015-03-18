//John St. Pierre       3/17/15
//[CSE2] hw07

// waves
// Program will:   print waves using user input using for, while, and do while loops

//import scanner class to take user inputs
import java.util.Scanner;


public class waves{
    			// main method required for every Java program
   			public static void main(String[] args) {

        //declare Sanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
    
    
        
        
        
        int number=0; //declare and initialize the number
        int control = 1; //declare and intialitze the control
        
        //use loops and if's to ensure that the number is in the range
        if(number<1 || number>30){
            
            //begin infinite loop that only ends when a valid input is reached
            while(control > 0){
                System.out.print("Enter a number between 1 and 30   ");
            
                
                if(!myScanner.hasNextInt()){
                    while(control>0){
                        String kanyeWest = myScanner.next();    //dummy variable to catch the bad value
                        System.out.print("You did not enter a valide input, please enter again  ");
                        if(myScanner.hasNextInt()){     //break from the loop if they entered an integer
                            break;
                        }
                    }
                }
                
                //end loop if the value is within range
                number = myScanner.nextInt();
                if (number >= 1 && number <= 30){ //
                    break;
                }
            }
        }


        
//=======================================================================================================        

                
                System.out.println("FOR LOOP:");
                System.out.println(1);
                
                //begin the for loop section
                for (int k = 2; k <(number + 1); k++){
                        
                    //use even values in ascending order
                    if(k%2 != 0){
                        
                    
                        for(int j = k; j > 0; j--){
                            String space = ""; //space is initially a blank space
                            
                                for(int i = 0; i < j; i++ ){
                                space = space + k + ""; //continuously add more numbers to "space"
                                }
                                
                          
                        System.out.println(space); //print the result
                        
                        }
                        
                    }
                        //use odd values in descending order
                        else{
                            
                            System.out.println(k);
                        
                        for(int j = 1; j < k; j++){
                        String space = "";
                        
                            for(int i = 0; i < j; i++ ){
                            space = space + k + "";
                            
                            
                           }
                           
                         
                        System.out.print(k); 
                        System.out.println(space);
                        
                        }
                        }
                }
            
        
//======================================================================================================== 
      
      
        //reset variables
        int i=0;
        int j=1;
        int k=2;
        
        //begin the while loop section
        System.out.println("");
        System.out.println("");
        System.out.println("WHILE:");
        
        System.out.println(1);
        
        //so long as k is less than the number
        while (k<(number + 1)){
            
            if(k==2)
            System.out.println(2); //print out a 2 for the first one
            
            if(k%2 == 0){
                
                while (j < k){
                    String space = "";
                    
                        while (i < j){
                        space = space + k + "";
                        i++;
                        }
                
                i=0;  //reset i so the loop will re-run      
                j++;    //incrament j
                
                System.out.print(k); 
                System.out.println(space);
                
                }
                
            }
                
                else{
                    j=k;
                
                while (j > 0){
                String space = "";
                
                    while(i<j){
                    space = space + k + "";
                    i++;
                    
                   }
                   
                i=0;
                j--;
                System.out.println(space);
                
                }
                }
        k++;
        }
        
//======================================================================================================== 
        
        i=0;
        j=1;
        k=2;
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("DO WHILE:");
        
        System.out.println(1);
        
        if(number>1){
            
            do{
                    
                if(k==2)
                System.out.println(2);
                
                if(k%2 == 0){
                    
                    do{
                        String space = "";
                        
                            
                            do{
                                if(i!= 0){
                                space = space + k;
                                }
                                ++i;
                                
                            }while(i<(j+1));
                            
                    
                    i=0;        
                    j++;
                    System.out.print(k); 
                    System.out.println(space);
                    
                    }while (j < k);
                    
                }
                    
                    else{
                        j=k;
                    
                    do{
                    String space = "";
                    
                        do{
                        space = space + k + "";
                        i++;
                        
                       }while(i<j);
                       
                    i=0;
                    j--;
                    System.out.println(space);
                    
                    }while (j > 0);
                    }
            k++;
            }while (k<(number + 1));

        }
        
        
   			}
}
        
        
        