//John St. Pierre       2/19/15
//[CSE2] hw 04

// Space Exploration
// Program will:    output timeline of space exploration
//                  select a random year from a decade of advances


public class SpaceExploration {
    			// main method required for every Java program
   			public static void main(String[] args) {
        
        
        //determine a random number between 2000 and 2010
        float random = (int) ((Math.random()*11) + 2000);
        
        System.out.printf("Here is a timeline of space exploration from %4.0f to 2000:\n", random);
        
        //begin switch statement. The statement finds the random year, and then prints the years after
        switch ( (int) random){
        
        //print the accomplishment for 2010
        case 2010:
            System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back");
            
        //print the accomplishment for 2009   
        case 2009:
            System.out.println("2009: NA");
            
        //print the accomplishment for 2008   
        case 2008:
            System.out.println("2008: Kepler launched to study deep space");
            
        //print the accomplishment for 2007    
        case 2007:
            System.out.println("2007: NA");
            
        //print the accomplishment for 2006    
        case 2006:
            System.out.println("2006: Spacecraft returns with collections from a comet");
            
        //print the accomplishment for 2005    
        case 2005:
            System.out.println("2005: Spacecraft collides with comet");
            
        //print the accomplishment for 2004    
        case 2004:
            System.out.println("2004: NA");
            
        //print the accomplishment for 2003    
        case 2003:
            System.out.println("2003: Largest infared telescope released");
            
        //print the accomplishment for 2002    
        case 2002:
            System.out.println("2002: NA");
            
        //print the accomplishment for 2001    
        case 2001:
            System.out.println("2001: First spacecraft lands on asteroid");
            
        //print the accomplishment for 2000    
        case 2000:
            System.out.println("2000: First spacecraft orbits an asteroid");
            return;
            
        } //end the switch statement
        
    }//end main method
}//end program