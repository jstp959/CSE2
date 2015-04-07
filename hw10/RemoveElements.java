//John St. Pierre       4/6/15
//[CSE2] lab08

// Remove Elements
// Program will:   

//import scanner class to take user inputs
import java.util.Scanner;

public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	
	//declare new arrays
int num[]=new int[10];
int newArray1[];
int newArray2[];

//declare variables representing things that will be deleted
int index,target;

	String answer="";
	
	//begin do while loop with bulk of code
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	//store first array with random inputs
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
    //get input from user for index to be deleted
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	//call method to delete index
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
 //get input to delete number provided
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(newArray1,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	
  	//ask user to run again 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
 //method that assembles array in printable fashion
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }

//method that generates a random array
public static int[] randomInput(){
    int num[]=new int[10];
    for(int i = 0; i<10; i++){
        int random = (int) (Math.random()*10);
        num[i] = random;
    }
    return num;
}

//begin method to delete inputted index
public static int [] delete(int[] list, int pos){
    //test if array is out of range
    if (pos < 0 || pos>9){
        System.out.println("Index is not valid");
        return list;
    }
    
    //create new array one less than the original array
    int num[]=new int[9];
    
    //create new array filling up to the index the user provided
    for(int j=0; j<pos; j++){
        num[j] = list[j];
    }
    
    //fill the index the user inputted with the next number, essentially skipping it
    for(int i = pos; i<9; i++){
        num[i] = list[i+1];
    }
    
    //return result
    System.out.println("Index " + pos + " has been removed");
    return num;
}


//begin list to remove number given by user
public static int []  remove(int[] list, int target){

    //use counter to see if a change took place
    int counter = 0;
    
    //fill new array
    for(int k= 0; k<list.length; k++){
        //determine size of new array
        if(list[k] == target){
            counter++;
        }
    }
    
    //make new array with correct size
    int num[] = new int[(list.length-counter)];
    
    //fill new array
    for(int i = 0, j = 0; i<list.length; i++){
        //skip filling if the value matched user input
        if(list[i] == target){
            continue;
        }
        num[j] = list[i];
        j++;
    }
    //print if change occured
    if(counter>0){
        System.out.println("Element " + target + " has been found");
        return num;
    }
    //print if no change occured, and return original list
    else{
        System.out.println("Element " + target + " was not found");
        return list;
    }
}
}//end program