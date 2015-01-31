//Arithmetic
//Program will: calculate and print number and cost of different items
//              calculate and print how much they each cost with tax
//              calculate and print the total cost before tax
//              calculate and print the total sales tax
//              calculate and print the total cost including tax


public class Arithmetic {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    
     //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    
    //PA tax rate
    double taxPercent=0.06;
    
    //declare variables to use for calculations
    double totalSockCost; //declare variable for the total cost of socks
    double totalGlassCost; //declare variable for the total cost of glasses
    double totalEnvelopeCost; //declare variable for the total cost of envelopes
    double totalPurchases; //declare total cost of purchases
    double totalPurchasesPreTax; //declare total cost of purchases before tax
    double totalSalesTax;   //declare total sales tax
    double salesTaxSock;     //declare sales tax for socks
    double salesTaxGlass;    //declare sales tax for glasses
    double salesTaxEnvelope; //declare sales tax for envelopes
    double eachTaxSock;     //declare cost of each sock with tax
    double eachTaxGlass;    //declare cost of each glass with tax
    double eachTaxEnvelope; //declare cost of each envelope with cost
    double taxPerSock;       //declare tax contribution of each sock
    double taxPerGlass;      //declare tax contribution of each glass
    double taxPerEnvelope;   //declare tax contribution of each envelope
    
    
    
    //calculate total cost of socks
    totalSockCost= nSocks*(sockCost$*(1+taxPercent));  
    totalSockCost= totalSockCost*100;               //convert to integer and then back in order to
    totalSockCost= (int) totalSockCost;                 //print with two decimals
    totalSockCost= (double) totalSockCost /100;
    
    //calculate sales tax for each sock
    eachTaxSock= totalSockCost /nSocks;
    eachTaxSock= eachTaxSock*100;                 //convert to integer and then back in order to
    eachTaxSock= (int) eachTaxSock;                             //show two decimals
    eachTaxSock= (double) eachTaxSock /100;
    
    //calculate sales tax for socks
    salesTaxSock= (taxPercent*sockCost$)*nSocks;
    salesTaxSock= salesTaxSock*100;
    salesTaxSock= (int) salesTaxSock;
    salesTaxSock= (double) salesTaxSock /100;
    
    //calculate sales tax contribution for each sock
    taxPerSock= salesTaxSock /nSocks;
    taxPerSock= taxPerSock*100;                 //convert to integer and then back in order to
    taxPerSock= (int) taxPerSock;                             //show two decimals
    taxPerSock= (double) taxPerSock /100;
    
    
    
    
    
    //calculate total cost of glasses
    totalGlassCost= nGlasses*(glassCost$*(1+taxPercent)); //calculate total cost of glasses
    totalGlassCost= totalGlassCost*100;                 //convert to integer and then back in order to
    totalGlassCost= (int) totalGlassCost;                   //show two decimals
    totalGlassCost= (double) totalGlassCost /100;
    
    //calculate cost for each glass with
    eachTaxGlass= totalGlassCost /nGlasses;
    eachTaxGlass= eachTaxGlass*100;                 //convert to integer and then back in order to
    eachTaxGlass= (int) eachTaxGlass;                             //show two decimals
    eachTaxGlass= (double) eachTaxGlass /100;
    
    //calculate sales tax for glasses
    salesTaxGlass= (taxPercent*glassCost$)*nGlasses;
    salesTaxGlass= salesTaxGlass*100;
    salesTaxGlass= (int) salesTaxGlass;
    salesTaxGlass= (double) salesTaxGlass /100;
    
    //calculate sales tax contribution for each glass
    taxPerGlass= salesTaxGlass /nGlasses;
    taxPerGlass= taxPerGlass*100;                 //convert to integer and then back in order to
    taxPerGlass= (int) taxPerGlass;                             //show two decimals
    taxPerGlass= (double) taxPerGlass /100;
    
    
    
    
    
    //calculate total cost of envelopes
    totalEnvelopeCost= nEnvelopes*(envelopeCost$*(1+taxPercent));  
    totalEnvelopeCost= totalEnvelopeCost*100;                   //convert to integer and then back in order to
    totalEnvelopeCost= (int) totalEnvelopeCost;                     //print with two decimals
    totalEnvelopeCost= (double) totalEnvelopeCost /100;
    
    //calculate tax for each envelope
    eachTaxEnvelope= totalEnvelopeCost /nEnvelopes;
    eachTaxEnvelope= eachTaxEnvelope*100;                 //convert to integer and then back in order to
    eachTaxEnvelope= (int) eachTaxEnvelope;                             //show two decimals
    eachTaxEnvelope= (double) eachTaxEnvelope /100;
   
    //calculate the sales tax for envelopes
    salesTaxEnvelope= (taxPercent*envelopeCost$)*nEnvelopes;
    salesTaxEnvelope= salesTaxEnvelope*100;
    salesTaxEnvelope= (int) salesTaxEnvelope;
    salesTaxEnvelope= (double) salesTaxEnvelope /100;
    
    //calculate sales tax contribution for each envelope
    taxPerEnvelope= salesTaxEnvelope /nEnvelopes;
    taxPerEnvelope= taxPerEnvelope*100;                 //convert to integer and then back in order to
    taxPerEnvelope= (int) taxPerEnvelope;                             //show two decimals
    taxPerEnvelope= (double) taxPerEnvelope /100;
    
    
    
    
    
    //calculate purchase total before tax
    totalPurchasesPreTax= (nSocks*sockCost$) + (nGlasses*glassCost$) + (nEnvelopes*envelopeCost$);
    totalPurchasesPreTax= totalPurchasesPreTax*100;                     //convert to integer and then back in order to
    totalPurchasesPreTax= (int) totalPurchasesPreTax;                       //print with two decimals
    totalPurchasesPreTax= (double) totalPurchasesPreTax /100;
    
    //calculate total sales tax
    totalSalesTax=salesTaxEnvelope+salesTaxGlass+salesTaxSock;
    totalSalesTax= totalSalesTax*100;                   //convert to integer and then back in order to
    totalSalesTax= (int) totalSalesTax;                     //print with two decimals
    totalSalesTax= (double) totalSalesTax /100;
    
    //calculate purchases after tax
    totalPurchases=totalPurchasesPreTax+totalSalesTax;
    totalPurchases= totalPurchases*100;                             //convert to integer and then back in order to
    totalPurchases= (int) totalPurchases;                               //print with two decimals
    totalPurchases= (double) totalPurchases /100;
    

    //Print out the calculated data by section
    System.out.println("***************************************************");
    System.out.println("At Walmart, you are purchasing the following items:");
    System.out.println(" "+nSocks+" pairs of socks for $"+sockCost$+" each");
    System.out.println(" "+nGlasses+" glasses for $"+glassCost$+" each");
    System.out.println(" "+nEnvelopes+" box of envelopes for $"+envelopeCost$+" each");
    System.out.println("");
    System.out.println("");
    System.out.println("The total cost for each item and its respective tax are:");
    System.out.println("$"+totalSockCost+"0 for the socks ($"+eachTaxSock+" each) including $"+salesTaxSock+" in tax ($"+taxPerSock+" each)");
    System.out.println("$"+totalGlassCost+" for the glasses ($"+eachTaxGlass+" each) including $"+salesTaxGlass+" in tax ($"+taxPerGlass+" each)");
    System.out.println("$"+totalEnvelopeCost+" for boxes of envelopes ($"+eachTaxEnvelope+" each) including $"+salesTaxEnvelope+" in tax ($"+taxPerEnvelope+" each)");
    System.out.println("");
    System.out.println("");
    System.out.println("The total cost before tax is $"+totalPurchasesPreTax+"");
    System.out.println("The total sales tax is $"+totalSalesTax+"");
    System.out.println("The total cost including tax is $"+totalPurchases+"0");
    System.out.println("***************************************************");
    
   	}  //end of main method   
} //end of