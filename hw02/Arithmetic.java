/* Neal Amin
   CSE 2 HW 02
   02/09/2016
   
   This program will compute the cost of items purchased at a store both without PA sales tax and with PA sales tax. Specifically 
   the program will calculate the total cost of each kind of item, sales tax charged buying all of each kind of item, the total cost
   of purchases before sales tax, total sales tax on the items, and lastly total cost of the transaction with sales tax.
   */
   
public class Arithmetic {

    public static void main(String[] args) {
        
    //number of each item bought
    int numPants = 3, numShirts = 2, numBelts = 1;
    
    //the cost of each individual item and the tax rate
    double pantsPrice = 34.98, 
    shirtPrice = 24.99, 
    beltPrice = 33.99, 
    pasalesTax = 0.06;
    
    //total cost of the item
    double totalCostOfPants = numPants * pantsPrice;
    double totalCostOfShirts = numShirts * shirtPrice;
    double totalCostOfBelts = numBelts * beltPrice;
    //total cost of purchases before sales tax
    double totalCostNonSalesTax = totalCostOfPants + totalCostOfShirts + totalCostOfBelts;
    
    //sales tax charged on each item
    double salesTaxOnPants = totalCostOfPants * pasalesTax;
    double salesTaxOnShirts = totalCostOfShirts * pasalesTax;
    double salesTaxOnBelts = totalCostOfBelts * pasalesTax;
    //total sales tax accumlated
    double totalSalesTax = salesTaxOnPants + salesTaxOnShirts + salesTaxOnBelts;
    
    //total cost of purchases with sales tax
    double totalCostWithSalesTax = totalCostNonSalesTax + totalSalesTax;
    
    //print results to screen
    System.out.println("The total cost of each item type");
    System.out.println("Total cost of pants: $" + totalCostOfPants + " and the sales tax on pants: $" + (int)(100*salesTaxOnPants)/100.0);
    System.out.println("Total cost of shirts: $" + totalCostOfShirts + " and the sales tax on shirts: $" + (int)(100*salesTaxOnShirts)/100.0);
    System.out.println("Total cost of belts: $" + totalCostOfBelts + " and the sales tax on belts: $" + (int)(100*salesTaxOnBelts)/100.0);
    System.out.println("");
    System.out.println("");
    System.out.println("The total cost of the purchases without sales tax: $" + totalCostNonSalesTax);
    System.out.println("The total cost of the purchases with sales tax: $" + (int)(100*totalCostWithSalesTax)/100.0);
    System.out.println("The total sales tax: $" + (int)(100*totalSalesTax)/100.0);
    }
    
    
}