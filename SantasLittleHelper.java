/**
* This program will ask the users name, age, name of toys, and the price of toys.
* It will then calculate the total bill which include sales tax and then display it.
*By: Andrew Empson
*Date: 12/5/17
*/






   import java.util.*;
   import java.text.*;// for simple date formate and simple date format.

 public class SantasLittleHelper {
		
 	//Global Definitions
 	
 	static String iData, iFirstName, iLastName, iToyName1, iToyName2, iAge; 
 	static double iPrice1, cTotal, cSubtotal, cSalesTax, iPrice2;
 	
 	static Scanner scanner;
 	
 	public static void main(String[] args) {
 		init();
 		input();
 		calcs();
 		output();
 		
 		
 		
 		
 	}	

	public static void init() {
 		scanner = new Scanner(System.in);
 		scanner.useDelimiter("\r\n");	
 	}	


    public static void input() {
    	System.out.println("Please enter your first name.");
    	iFirstName = scanner.next();
    	System.out.println(iFirstName);
    	
    	System.out.println("Please enter your last name.");
    	iLastName = scanner.next();
    	System.out.println(iLastName);
 	
 		System.out.println("Please enter the toy name.");
 		iToyName1 = scanner.next();	
 		System.out.println(iToyName1);
 		
 		System.out.println("Please enter price of toy");
 		iData = scanner.next(); 
 		iPrice1 = Double.parseDouble(iData);
 		System.out.println(iPrice1); 
 	
 		System.out.println("Please enter the other toy name");
 		iToyName2 = scanner.next();
 		System.out.println(iToyName2); 
 		
 		System.out.println("Please enter price of the other toy");
 		iData = scanner.next();
 		iPrice2 = Double.parseDouble(iData); 
 		System.out.println(iPrice2);
 		
 		System.out.println("Please enter your age");
    	iAge = scanner.next();
    	System.out.println(iAge);
    	
    }
    
    public static void calcs() {
    	cSubtotal = iPrice1 + iPrice2;
    	cSalesTax = cSubtotal * .07 + 0.2;
    	cTotal = cSubtotal + cSalesTax;
    }
    
    public static void output() {
    		Date 	today;		
 		today = new Date();
 		
 		SimpleDateFormat	simpleDF2;
 		
 		simpleDF2 = new SimpleDateFormat(" MM dd, yyyy");
 	
 		
 		System.out.println("Today is " + simpleDF2.format(today));
    	
    	System.out.println(iFirstName + (" ") +  iLastName);
    	
   		System.out.println("Your Subtotal is: $" + cSubtotal);
     
     	System.out.println("Your sales tax is: $" + cSalesTax);
    
    	System.out.println("Your Total is: $" + cTotal);
    	
    	System.out.println("Merry Christmas.");
    	
    	
    }
    
    
 } 