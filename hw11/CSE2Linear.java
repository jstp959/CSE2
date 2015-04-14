//John St. Pierre       4/6/15
//[CSE2] lab08

// Remove Elements
// Program will:        create an array of grades from user input
//                      check grades to be sure they are in increasing order
//                      find user's key with both binary and linear search
//                      Scramble th array


//import Scanner
import java.util.Scanner;

//begin main method
public class CSE2Linear{
  public static void main(String [] arg){
        
        //ask for and set up array of grades
        System.out.println("Enter 15 ints for final grades in CSE2");
        int [] array;
        array = new int[15];
        
        int previous = 0;
        //fill array
        for(int i = 0; i<15; i++){
            Scanner myScanner = new Scanner(System.in);
            //call method to make sure everything is inputted correctly
            int inputNo = checkValidity(myScanner, previous);
            array[i] = inputNo;
            //prevent run time error
            if(i!=0){
                previous = array[i-1];
            }
        }
        
        //print the array
        System.out.print("The grades, sorted, are: ");
        for(int i = 0; i<15; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        
        //ask for the grade to search
        System.out.print("Enter a grade to search for: ");
        Scanner myScanner = new Scanner(System.in);
        int key = myScanner.nextInt();
        
        //call the binary search method
        binary(array, key);
        
        //call method to scramble array
        int [] aScramble;
        aScramble = new int[15];
        aScramble = scramble(array);
        
        
        //print scrambled array
        System.out.println("Scrmabled:");
        for(int i = 0; i<15; i++){
            System.out.print(aScramble[i] + " ");
        }
        System.out.println();
        
        //ask user for number to find
        System.out.print("Enter a grade to search for: ");
        myScanner = new Scanner(System.in);
        int key2 = myScanner.nextInt();
        
        //call method for linear search
        linear(array, key2);
        
  }
  
    public static int checkValidity(Scanner myScanner, int previous){
        //begin infinite loop that only breaks when valid int is given
        while(true){
            if(myScanner.hasNextInt()){
                int number = myScanner.nextInt();
                //check if old input was larger
                if(previous > number){
                    System.out.println("Sorry, that is smaller than the previous input");
                    continue;
                }
                //check range
                if(number > 0 && number < 100){
                    return number;
                }
                //if an int <= 0 is inputted:
                else{
                    System.out.println("Sorry, out of range.");
                    myScanner = new Scanner(System.in);
                    continue;
                }
            }
            //if an int is not inputted
            else{
                System.out.println("Sorry, not an integer.");
                myScanner = new Scanner(System.in);
                continue;
            }
        }
    }
    
   public static void binary(int A[], int key){
        
        //set variables for incramnets, max, and min
      int i = 0;
      int max = 14;
      int min = 0;
      
      //set loop before its been found
      while (max >= min){
          i++;
          int mid = (min + max)/2;
          //the key ahs been found
          if(A[mid] == key){
            System.out.println(key + " was found in the list with " + i + " iterations");
            return;
          }
            //reset bounds
          else if (A[mid] < key){
            min = mid + 1;
          }
          //reset bounds
          else{
            max = mid - 1;
          }
      }
        //key was not found
     System.out.println(key + " was not found in the list with " + i + " iterations");
     return;
    }
    
    //scramble the array
    public static int [] scramble(int intArray[]){
        for (int i=0; i<intArray.length; i++) {
        	int target = (int) (intArray.length * Math.random() );
        	int temp = intArray[target];
        	intArray[target] = intArray[i];
        	intArray[i] = temp;
        }
        return intArray;

    }
    
    public static void linear(int array[], int key){
        //begin loop going through array
        for(int i = 0; i<14; i++){
            //keep track of incraments
            counter = i + 1;
            //key has been found
            if(array[i] == key){
                System.out.println(key + " was in the list with " + (i + 1) + " iterations");
                return;
            }
        }
     //key was not found
     System.out.println(key + " was not found in the list with 15 iterations");
     return;
    }
}