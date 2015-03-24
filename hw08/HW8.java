//John St. Pierre       3/23/15
//[CSE2] hw08

// waves
// Program will: let you play a dope game!!

//import scanner class to take user inputs
import java.util.Scanner;

public class HW8{
    
    //this is the main method that was given
    public static void main(String[] args) {
            char option; //not sure what this is for, but my code runs correctly without using it
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc");
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10);
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
            box();
            input = getInput(scan);
            System.out.println("Hero! Have a good day!");
    
    }
    
    //thanks MG this drawing looks AWESOME!!
    public static void giant() {
            System.out.println("                                 ---------                    ");
            System.out.println("                                |  /    \\ |                   ");
            System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
            System.out.println("                           H     -----------   H              ");
            System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
            System.out.println("                           H    HHHHHHHHHHH    H                      ");
            System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
            System.out.println("                                HHHHHHHHHHH                   ");
            System.out.println("                                HHH     HHH                   ");
            System.out.println("                               HHH       HHH                   ");
        }
        
        //thanks MG this drawing looks AWESOME!!    
        public static void cave() {
            System.out.println("                              *****   * * * * * * * *        ");
            System.out.println("                         ***         ***                      ");
            System.out.println("                      ***               ***                   ");
            System.out.println("                 |    ***               ***                   ");
            System.out.println("                 |    ***               ***                   ");
            System.out.println("             O __|__  ***               ***                   ");
            System.out.println("           ******l    ***               ***                   ");
            System.out.println("            * *       ***               ***                   ");
            System.out.println("           *   *      ********************* * * * * * *       ");
        }
        
        //thanks MG this drawing looks AWESOME!!
        public static void box(){
            System.out.println("                     *********************     *********************    *********************             ");
            System.out.println("                     ***               ***     ***               ***    ***               ***              ");
            System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
            System.out.println("                     ***               ***     ***               ***    ***               ***              ");
            System.out.println("                     *********************     *********************    *********************               "); 
        }
        
        //begin the first of the getInput methods, which accepts c and C to continue the game
        public static String getInput(Scanner scan, String string){
            //assign and declare dummy variable to return
            String nothing = "nothing";
            //begin if to take only correct inputs
            if(scan.hasNextLine()){
                string = scan.nextLine();
                if(string.equals("C") || string.equals("c")){
                    return nothing;
                }
                //end game if they don't enter c or C
                else{
                    System.out.println("GAME OVER!");
                    System.exit(0);
                    return nothing;
                }
            }
            //end game if they don't enter c or C
            else{
                System.out.println("GAME OVER!");
                System.exit(0);
                return nothing;
            }
                
        }//end method
    
        //begin second getInput (tbh I feel like they should have been different names to make it less confusing)
        public static String getInput(Scanner scan, String string, int trial){
            
            //establish dummy variable and ask for user input
            String nothing = "nothing";
            scan = new Scanner(System.in);
            string = scan.nextLine();
            
            //begin loop that fights the giant
            while(trial>1){
                //attack the giant section
                if(string.equals("A") || string.equals("a")){
                    while(trial>1){
                        //get random number, either 0 or 1
                        int random1 = (int)(Math.random()*2);
                        
                        //if its 1, the giant loses a point of health
                        if (random1 == 1){
                            //the trial variable acts as its health
                            trial--;
                            System.out.println("Critical hit! The monster has " + trial + " hit points left!");
                            //ask for a new input to prevent multiple hits on one input
                            scan = new Scanner(System.in);
                            string = scan.nextLine();
                            break;
                        }
                        else{
                            System.out.println("You missed!");
                            scan = new Scanner(System.in);
                            string = scan.nextLine();
                            break;
                        }
                    }
                    
                    //end the fight if the giant runs out of health
                    if(trial == 1){
                        System.out.println("You've defeated the giant!");
                        return nothing;
                    }
                }
                
                 //escape portion of the fight                
                 else if (string.equals("E") || string.equals("e")){
                     int counter = 1;
                     //begin an infinite loop
                     while(counter>0){
                            //get random number between 1 and 10
                            int random2 = (int)(Math.random()*10) + 1;
                            
                            //successfully escape if the random number is 10
                            if(random2 == 10){
                                System.out.println("You've successfully escaped!");
                                return nothing;
                            }
                            
                            //fail to escape and ask for a new input
                            else{
                                System.out.println("Failed to escape!");
                                scan = new Scanner(System.in);
                                string = scan.nextLine();
                                break;
                            }
                    }
                 }
                
                //end program for a bad input
                else{
                    System.out.println("You've been executed by the giant! GAME OVER!");
                    System.exit(0);
                    return nothing;
                }
            }
            
            //essentially this is useless, as the code should never reach this point,
            //  but it avoids a compiler error
            return nothing;
            
        }//end method
        
        //begin the third getInput, for the reward
        public static String getInput(Scanner scan){
            
            //establish dummy string to return
            String nothing = "nothing";
            
            //make sure it is an int to avoid a run time error
            if(scan.hasNextInt()){
                int noChest = scan.nextInt();
                
                //begin switch to determine reward
                switch (noChest){
                    case 1:
                        System.out.println("You receive ULTIMA WEAPON! It's the best sword in the game!");
                        break;
                    case 2:
                        System.out.println("You recieve an A+ in CSE2, and you don't have to do HW8!");
                        break;
                    case 3:
                        System.out.println("You receive 100,000 gil (video game money)!!");
                        break;
                    default:
                        System.out.println("A wrong number! You get nothing!!!");
                    
                }
            }
            else{
                System.out.println("A wrong input, You get nothing!!!");
            }
            return nothing;
            
        } //end method
}//end program