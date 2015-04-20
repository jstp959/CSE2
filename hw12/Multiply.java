//John St. Pierre       4/19/15
//[CSE2] hw12

// Multiply
// Program will:  multiply arrays

import java.util.Scanner;

public class Multiply{
    
    //method that creates a multidimentional array with numbers between -10 and 10
    public static int[][] randomMatrix(int width, int height){
        
        //initialize array with given width and height
        int[][] marray = new int[height][width];    
            
            //fill array with values
            for (int i=0; i < marray.length; i++) {
                for (int j=0; j < marray[i].length; j++){
                    int random = ((int) (Math.random()*20)) - 10;
                    marray[i][j] = random;
              }
            }
              
        return marray;
    }
    
    //method that prints an array
    public static void printMatrix(int[][] marray){
        
        //return if array is empty
        if(marray == null){
            System.out.print("The array was empty");
            return;
        }
            //use nested loops to print the array
            for (int i=0; i < marray.length; i++) {
                for (int j=0; j < marray[i].length; j++){
                    System.out.print(marray[i][j] + " ");
              }
              System.out.println();
            }
    }
    
    //method to check if integer is positive and ask for re-input
    public static int checkPositive(Scanner myScanner){
        //begin infinite loop that only breaks when positive int is given
        while(true){
            if(myScanner.hasNextInt()){
                int number = myScanner.nextInt();
                if(number > 0){
                    return number;
                }
                //if an int <= 0 is inputted:
                else{
                    System.out.println("Sorry, not a valid input.");
                    System.out.println("Please input a positive int");
                    myScanner = new Scanner(System.in);
                    continue;
                }
            }
            //if an int is not inputted:s
            else{
                System.out.println("Sorry, not a valid input.");
                System.out.println("Please input a positive int");
                myScanner = new Scanner(System.in);
                continue;
            }
        }
    }
    
    //method that multiplies two matricies
    public static int[][] matrixMultiply(int[][] marray1, int[][] marray2){
        
        //initialize new array with height of first array and width of second array,
        //to make sure it is big enough
        int[][] marray3 = new int[marray1.length][marray2[0].length];
        
        //fill the array with 0's initially
        for(int i = 0; i < marray3.length; i++){
            for(int j = 0; j<marray3[0].length; j++){
                marray3[i][j] = 0;
            }
        }
        
        //if the lengths do not match up, return the empty array
        if(marray1[0].length != marray2.length){
            System.out.println("Sorry, dimentions do not match");
            return marray3;
        }
        
        //fill the array with the correct linear combination in nested loops
        for (int i = 0; i < marray1.length; i++) {
            for (int j = 0; j < marray2[0].length; j++) {
                for (int k = 0; k < marray1[0].length; k++) { 
                    marray3[i][j] += marray1[i][k] * marray2[k][j];
                }
            }
        }
        //return the new array
        return marray3;
    }
    
    //main method in program
    public static void main(String[] args){
    
    //ask for user input for
    System.out.println("Please input the width and height for the arrays");
    
    //initialize matricies to avoid scope errors
    int[][] matrix1 = randomMatrix(2, 2);
    int[][] matrix2 = randomMatrix(2, 2);
    
    //infinite loop that only breaks when dimentions line up
    while(true){
        
        System.out.print("Width (1): ");
        Scanner myScanner = new Scanner(System.in);
        int width1 = checkPositive(myScanner);
        
        System.out.print("Height (1): ");
        myScanner = new Scanner(System.in);
        int height1 = checkPositive(myScanner);
        
        //fill and print the first matrix
        matrix1 = randomMatrix(width1, height1);
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println();

        System.out.print("Width (2): ");
        myScanner = new Scanner(System.in);
        int width2 = checkPositive(myScanner);
        
        System.out.print("Height (2): ");
        myScanner = new Scanner(System.in);
        int height2 = checkPositive(myScanner);
        
        //fill and print the second matrix
        matrix2 = randomMatrix(width2, height2);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        //only leave loop when width of the first matches height of the second
        if(width1 == height2){
            break;
        }
        
        System.out.println("Sorry, the dimentions are not compatible. Try again");
    }
    
        
        System.out.println();
        System.out.println("The product:");
        
        //create and print the new matricies
        int[][] matrix3 = matrixMultiply(matrix1, matrix2);
        printMatrix(matrix3);
    }
}//end class