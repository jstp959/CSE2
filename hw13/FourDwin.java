//John St. Pierre       4/28/15
//[CSE2] hw13

//4Dwin

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class FourDwin{
    
    //method that calcuates mean sum and counter
    public static void statArray(double [][][][] fourD){
        
        double sum = 0;
        int counter = 0;
        
        //use for loops to calculate numbers
        for(int i = 0; i<fourD.length; i++){
            
            for(int j = 0; j<fourD[i].length; j++){

                for(int k = 0; k<fourD[i][j].length; k++){

                    for(int l = 0; l < fourD[i][j][k].length; l++){
                        sum = sum + fourD[i][j][k][l];
                        counter++;
                    }
                }
            }
        }
        
        //print results
        double mean = sum/counter;
        System.out.println("Members:   " + counter);
        System.out.println("Sum:   " + sum);
        System.out.println("Mean:   " + mean);
        
    }
    
    //sort the 4d array with insertion sorting
    public static void sort4DArray(double [][][][]array){
        
    int n = array.length;
    for (int j = 1; j < n; j++) {
        double [][][] key = array[j];
        int i = j-1;
        while ( (i > -1) && ( array [i].length > key[i].length ) ) {
            array [i+1]= array [i];
            i--;
        }
        array[i+1] = key;
    }
    }
        
    //sort the 3D array with slection sorting
    public static void sort3DArray(double [][][][] array){
        for (int i = 0; i < array.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j].length < array[index].length)
                    index = j;
      
            double [][][] smallerNumber = array[index]; 
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    //print the array with new lines and brackets
    public static void printArray(double [][][][] fourD){
        
        System.out.println("{");
        for(int i = 0; i<fourD.length; i++){
            System.out.println("  {");
            for(int j = 0; j<fourD[i].length; j++){
                System.out.println("    {");
                for(int k = 0; k<fourD[i][j].length; k++){
                    System.out.print("      {");
                    for(int l = 0; l < fourD[i][j][k].length; l++){
                        System.out.print(fourD[i][j][k][l] + ", ");
                    }
                    System.out.println("}");
                }
                System.out.println("    }");
            }
            System.out.println("  }");
        }
        System.out.println("}");

        
    }
    
    //main method
    public static void main(String[] args){
        
        //intiialize variables
        Scanner myScanner = new Scanner(System.in);
        int y = 0;
        int x = 0;
        Random random = new Random();
        
        //loop for correct x value
        System.out.print("Please input a positive int X: ");
        while(true){
            if(myScanner.hasNextInt()){
                x = myScanner.nextInt();
                if(x > 0){
                    break;
                }
                //if an int <= 0 is inputted:
                else{
                    System.out.println("Sorry, not a valid input.");
                    System.out.print("Please input a positive int X: ");
                    myScanner = new Scanner(System.in);
                    continue;
                }
            }
            //if an int is not inputted:s
            else{
                System.out.println("Sorry, not a valid input.");
                System.out.print("Please input a positive int X: ");
                myScanner = new Scanner(System.in);
                continue;
            }
        }
    
        //loop for correct y value
        System.out.print("Enter an int Y where Y > X: ");    
        while(true){
            if(myScanner.hasNextInt()){
                y = myScanner.nextInt();
                if(y > x){
                    break;
                }
                //if an int <= 0 is inputted:
                else{
                    System.out.print("Invalid input. Enter int for Y>X: ");
                    myScanner = new Scanner(System.in);
                    continue;
                }
            }
            //if an int is not inputted:s
            else{
                System.out.print("Invalid input. Enter int for Y>X: ");
                myScanner = new Scanner(System.in);
                continue;
            }
        }
        
        //declaew 4D array
        double [][][][] fourD = new double [x+random.nextInt(y-x+1)][][][];
        
        //fill the ragged array
        for(int i = 0; i<fourD.length; i++){
            fourD[i] = new double[x+random.nextInt(y-x+1)][][];
            for(int j = 0; j<fourD[i].length; j++){
                fourD[i][j] = new double [x+random.nextInt(y-x+1)][];
                for(int k = 0; k<fourD[i][j].length; k++){
                    fourD[i][j][k] = new double [3];
                    for(int l = 0; l < fourD[i][j][k].length; l++){
                        fourD[i][j][k][l] = 30*random.nextDouble();
                    }
                }
            }
        }
        
        //print original array
        System.out.println("Original Array:");
        printArray(fourD);
        
        //blank lines for style points
        System.out.println();
        System.out.println();
        
        //sort both the 4d and 3d arrays
        sort4DArray(fourD);
        sort3DArray(fourD);
        
        //print the new sorted array
        System.out.println("Sorted Array:");
        printArray(fourD);
        
        //calculate statistics
        statArray(fourD);
    }
}