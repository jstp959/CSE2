//John St. Pierre       2/13/15
//[CSE2] hw 04

// Cookies
// Program will:   determine number on the interval 1-10 by asking a series of questions


//import scanner class to take user inputs
import java.util.Scanner;


public class WhichNumber{
    			// main method required for every Java program
   			public static void main(String[] args) {

        //declare Sanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );

        //declare variables for yes and no, accounting for capital and lowercase letters
        String y = new String ("y");
        String Y = new String ("Y");
        String n = new String ("n");
        String N = new String ("N");
        
        //begin series of questions to determine number by nesting several if statements
        //start by asking if the number is even, to eliminate half of the numbers
        System.out.print("Is your number even? ");
            String even=myScanner.nextLine();
        
                //eliminate numbers by asking divisibility by 3
                if(even.equals(y)||even.equals(Y)){
                    System.out.print("Is it divisible by 3? ");
                    String d3=myScanner.nextLine();
                    
                    //affirm number as 6
                    if(d3.equals(y)||d3.equals(Y)){
                        System.out.print("Is your number 6? ");
                        String n6=myScanner.nextLine();
                        
                            //print result in which program is correct
                            if(n6.equals(y)||n6.equals(Y)){
                                System.out.println("Yay!");
                            
                            return;
                            }
                            
                            //print result where user made incorrect inputs, or program malfunctioned
                            else if(n6.equals(n)||n6.equals(N)){
                                System.out.println("Darn it!");
                            
                            return;
                            }
                            
                            //account for a situation in which the user did not enter y Y n or N
                            else{
                                System.out.println("Sorry, that is an invalid input");
                            }
                        
                    }
                    
                    //eliminate more numbers by asking divisibility by 4        
                    else if (d3.equals(n)||d3.equals(N)){
                        System.out.print("Is your number divisible by 4? ");
                        String d4=myScanner.nextLine();
                        
                        //determine if number is 8 or 4
                        if (d4.equals(y)||d4.equals(Y)){
                            System.out.print("Is the number divisible by 4 greater than 1? ");
                            String gt1=myScanner.nextLine();
                            
                                //affirm number is 8
                                if (gt1.equals(y)||gt1.equals(Y)){
                                    System.out.print("Is the number 8? ");
                                    String n8=myScanner.nextLine();
                                    
                                
                                        if(n8.equals(y)||n8.equals(Y)){
                                            System.out.println("Yay!");
                                        
                                        return;
                                        }
                                        
                                        else if(n8.equals(n)||n8.equals(N)){
                                            System.out.println("Darn it!");
                                        
                                        return;
                                        }
                                        
                                        //account for a situation in which the user did not enter y Y n or N
                                        else{
                                        System.out.println("Sorry, that is an invalid input");
                                        }
                                }
                                        
                                //affirm number is 4        
                                else if(gt1.equals(n)||gt1.equals(N)){
                                    System.out.print("Is the number 4? ");
                                    String n4=myScanner.nextLine();
                                    
                                        if(n4.equals(y)||n4.equals(Y)){
                                            System.out.println("Yay!");
                                        
                                        return;
                                        }
                                        
                                        else if(n4.equals(n)||n4.equals(N)){
                                            System.out.println("Darn it!");
                                        
                                        return;
                                        }
                                        
                                        //account for a situation in which the user did not enter y Y n or N
                                        else{
                                        System.out.println("Sorry, that is an invalid input");
                                        }
                                 }
                                 
                                 //account for a situation in which the user did not enter y Y n or N
                                else{
                                System.out.println("Sorry, that is an invalid input");
                                }
                            
                        }
                        
                        //determine if number is 5 or 2        
                        else if (d4.equals(n)||d4.equals(N)){
                            System.out.print("Is the number divisible by 5? ");
                            String d5=myScanner.nextLine();
                                
                                //affirm number is 10
                                if (d5.equals(y)||d5.equals(Y)){
                                    System.out.print("Is the number 10? ");
                                    String n10=myScanner.nextLine();
                                    
                                
                                        if(n10.equals(y)||n10.equals(Y)){
                                            System.out.println("Yay!");
                                        
                                        return;
                                        }
                                        
                                        else if(n10.equals(n)||n10.equals(N)){
                                            System.out.println("Darn it!");
                                        
                                        return;
                                        }
                                        
                                        //account for a situation in which the user did not enter y Y n or N
                                        else{
                                        System.out.println("Sorry, that is an invalid input");
                                        }
                                }
                        
                                
                                //affirm number is 2        
                                else if(d5.equals(n)||d5.equals(N)){
                                    System.out.print("Is the number 2? ");
                                    String n2=myScanner.nextLine();
                                    
                                        if(n2.equals(y)||n2.equals(Y)){
                                            System.out.println("Yay!");
                                        
                                        return;
                                        }
                                        
                                        else if(n2.equals(n)||n2.equals(N)){
                                            System.out.println("Darn it!");
                                        
                                        return;
                                        }
                                        
                                        //account for a situation in which the user did not enter y Y n or N
                                        else{
                                        System.out.println("Sorry, that is an invalid input");
                                        }
                                }
                                
                                //account for a situation in which the user did not enter y Y n or N
                                else{
                                System.out.println("Sorry, that is an invalid input");
                                }
                            
                        }
                        
                        //account for a situation in which the user did not enter y Y n or N
                        else{
                        System.out.println("Sorry, that is an invalid input");
                        
                        }
                                    
                    }
                    
                    //account for a situation in which the user did not enter y Y n or N
                    else{
                    System.out.println("Sorry, that is an invalid input");
                    }
                    
                }
                    //begin series of questions for odd numbers
                    else if (even.equals(n)||even.equals(N)){
                        System.out.print("Is it divisible by 3? ");
                        String d32=myScanner.nextLine();
                    
                            //determine id number is 9 or 3
                            if (d32.equals(Y)||d32.equals(y)){
                                System.out.print("When divided by 3 is the result greater than 1? ");
                                String gt12=myScanner.nextLine();
                                
                                    //affirm number as 9
                                    if (gt12.equals(y)||gt12.equals(Y)){
                                    System.out.print("Is the number 9? ");
                                    String n9=myScanner.nextLine();
                                    
                                
                                        if(n9.equals(y)||n9.equals(Y)){
                                            System.out.println("Yay!");
                                        
                                        return;
                                        }
                                        
                                        else if(n9.equals(n)||n9.equals(N)){
                                            System.out.println("Darn it!");
                                        
                                        return;
                                        }
                                        
                                        //account for a situation in which the user did not enter y Y n or N
                                        else{
                                        System.out.println("Sorry, that is an invalid input");
                                        }
                                    }
                            
                                    //affirm number is 3    
                                    else if (gt12.equals(n)||gt12.equals(N)){
                                        System.out.print("Is the number 3? ");
                                        String n3=myScanner.nextLine();
                                        
                                            if(n3.equals(y)||n3.equals(Y)){
                                                System.out.println("Yay!");
                                            
                                            return;
                                            }
                                            
                                            else if(n3.equals(n)||n3.equals(N)){
                                                System.out.println("Darn it!");
                                            
                                            return;
                                            }
                                            
                                            //account for a situation in which the user did not enter y Y n or N
                                            else{
                                            System.out.println("Sorry, that is an invalid input");
                                            }
                                            
                                    }
                                    
                                    //account for a situation in which the user did not enter y Y n or N
                                    else{
                                    System.out.println("Sorry, that is an invalid input");
                                    }
                            }
                            
                            
                            //determine if number is 7
                            else if (d32.equals(n)||d32.equals(N)){
                                System.out.print("Is it greater than 6? ");
                                String gt6=myScanner.nextLine();
                                
                                //affirm number is 7
                                 if(gt6.equals(y)||gt6.equals(Y)){
                                    System.out.print("Is the number 7? ");
                                    String n7=myScanner.nextLine();
                                    
                                        if(n7.equals(y)||n7.equals(Y)){
                                            System.out.println("Yay!");
                                            
                                            return;
                                            }
                                            
                                        else if(n7.equals(n)||n7.equals(N)){
                                            System.out.println("Darn it!");
                                            
                                            return;
                                            }
                                        
                                        //account for a situation in which the user did not enter y Y n or N    
                                        else{
                                        System.out.println("Sorry, that is an invalid input");
                                        }
                                }
                                
                                
                                //determine if number is 1 or 5
                                else if (gt6.equals(n)||gt6.equals(N)){
                                    System.out.print("Is it less than 3? ");
                                    String lt3=myScanner.nextLine();
                                 
                                    //affrim number is 1                                 
                                     if(lt3.equals(y)||lt3.equals(Y)){
                                        System.out.print("Is the number 1? ");
                                        String n1=myScanner.nextLine();
                                        
                                            if(n1.equals(y)||n1.equals(Y)){
                                                System.out.println("Yay!");
                                                
                                                return;
                                                }
                                                
                                            else if(n1.equals(n)||n1.equals(N)){
                                                System.out.println("Darn it!");
                                                
                                                return;
                                                }
                                            
                                            //account for a situation in which the user did not enter y Y n or N    
                                            else{
                                            System.out.println("Sorry, that is an invalid input");
                                            }
                                }
                                    //affirm number is 5
                                    else if(lt3.equals(n)||lt3.equals(N)){
                                            System.out.print("Is the number 5? ");
                                            String n5=myScanner.nextLine();
                                            
                                                if(n5.equals(y)||n5.equals(Y)){
                                                    System.out.println("Yay!");
                                                    
                                                    return;
                                                    }
                                                    
                                                else if(n5.equals(n)||n5.equals(N)){
                                                    System.out.println("Darn it!");
                                                    
                                                    return;
                                                    }
                                                
                                                //account for a situation in which the user did not enter y Y n or N    
                                                else{
                                                System.out.println("Sorry, that is an invalid input");
                                                }
                                    }
                                    //account for a situation in which the user did not enter y Y n or N
                                    else{
                                    System.out.println("Sorry, that is an invalid input");
                                    }
                                        
                            
                                }
                                //account for a situation in which the user did not enter y Y n or N
                                else{
                                System.out.println("Sorry, that is an invalid input");
                                }
                           
                                
                            }
                            //account for a situation in which the user did not enter y Y n or N
                            else{
                            System.out.println("Sorry, that is an invalid input");
                            }
                        
                    }
                    //account for a situation in which the user did not enter y Y n or N
                    else{
                    System.out.println("Sorry, that is an invalid input");
                    }
        
   			}  //end of main method   
  	} //end of class
  	
  	