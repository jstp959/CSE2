//John St. Pierre       2/13/15
//[CSE2] hw 04

// Smile Generator
// Program will:    print a series of 5 smiley faces using for , while, and do while loops
//                  print a random number of smileys
//                  print a random number of smileys, with 30 in each row
//                  print rows of smileys with the next row having one more than the previous



public class SmileGenerator{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    
////////////////////////////////////////////////////////////////////////////////////////////////////////

            //print five smileys using for loop
   		    for (int i = 0; i<5; i++){
   		        System.out.print(":) ");
   			    
   		    }
   		    
////////////////////////////////////////////////////////////////////////////////////////////////////////

   			System.out.println(" ");    
   			System.out.println(" ");
   			System.out.println(" ");
   			
   			//print 5 smileys using while loop
   			int counter=0;
   			while (counter<=4){
   			     System.out.print(":) ");
   			     counter++;
   			}
   			
////////////////////////////////////////////////////////////////////////////////////////////////////////
   			
   		    System.out.println(" ");
   		    System.out.println(" ");
   			System.out.println(" ");

			//establish a counter
   			counter=0;
   			
   			//print 5 smileys using a do while loop
   			do{
   			    System.out.print(":) ");
   			    counter++;
   			} while(counter<5);
   			
////////////////////////////////////////////////////////////////////////////////////////////////////////
   			
   			System.out.println(" ");
   			System.out.println(" ");
   			System.out.println(" ");
            
            //create a random number for number of smileys
   		    int random= (int) (Math.random()*100);
   			
   			//print random number of smileys
   			while(random>=0) {
   			System.out.print(":) ");
   			random--;
   			}
   			
////////////////////////////////////////////////////////////////////////////////////////////////////////
   		
   		    System.out.println(" ");
   		    System.out.println(" ");
   		    System.out.println(" ");
   		
   			//establish random number of smileys
   			int random2 = (int) (Math.random()*100 + 40);
   			
   			//declare a line counter
   		    int lineCounter = 30;
   		    
   		    //print the smileys using while loop with 30 per line
   		    while(random2>=0)
   			    if(lineCounter!=0){
   			        System.out.print(":) ");
   			        random2--;
   			        lineCounter--;
   			    }
   		        else{
   		            System.out.println(" ");
   		            lineCounter = 30;
   		        }
   			   
////////////////////////////////////////////////////////////////////////////////////////////////////////
   			   
   			   System.out.println(" ");
   			   System.out.println(" ");
   		       System.out.println(" ");
   		       
   		       
   		       //assign number of rows as a random number
   		       int upTo = (int) (Math.random()*10 + 4);
   		       
   		       //declare counters
   		       int counter1 = 1;
   		       int counter2 = 1;
   		   
   	           //print the smileys in lines, with one more in each line than the line before
   	           while(counter1<upTo)
   	                if(counter2>0){
   	                    System.out.print(":) ");
   	                    counter2--;
   	                }
   	                else{
   	                    System.out.println(" ");
   	                    counter1++;
   	                    counter2 = counter1;
   	                }

   		       
////////////////////////////////////////////////////////////////////////////////////////////////////////   		       
   			    
   			}//end main mehtod
   			
}//end