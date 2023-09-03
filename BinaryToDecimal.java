//Author: Caroline Stone
import java.util.Scanner;
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		System.out.println("Hello and Welcome to the Binary to Decimal Converter!\nI will take 2 binary numbers, turn them into decimal values, and add the decimal values together.\nI will show the decimal values and their sum.");
		System.out.println("Please input two binary numbers that have four digits each.");
		
		//creating a Scanner object called keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//declaring/initializing String variable for first binary number, assigned the value of what the user inputs
		String binary1 = keyboard.next();
		
		//declaring/initializing String variable for second binary number, assigned the value of what the user inputs
		String binary2 = keyboard.next();
		
		System.out.println("Thank You! Now, I will convert those numbers into decimal values.");
		
		//creating int variables for each index of the first binary number that are used to hold that index's decimal value
		int decimalValueIndex0Binary1;
		int decimalValueIndex1Binary1;
		int decimalValueIndex2Binary1;
		int decimalValueIndex3Binary1;
		
		//creating int variables for each index of the second binary number that are used to hold that index's decimal value 
		int decimalValueIndex0Binary2;
		int decimalValueIndex1Binary2;
		int decimalValueIndex2Binary2;
		int decimalValueIndex3Binary2;
		
		
		//first binary number
		
		//looking at index 3 of the string of the first binary number (the one's place of the binary number)
		//if the one's place of the binary number is 0, its decimal value at that place is 0
		if (binary1.substring(3).equals("0")) {
			decimalValueIndex0Binary1 = 0;
		}
		
		//if one's place of binary number is 1, its decimal value at that place is 1
		else { 
			decimalValueIndex0Binary1 = 1;
			
		}
		
		//looking at index 2 of the string of the first binary number (two's place of the binary number)
		//if the two's place of the binary number is 0, its decimal value at that place is 0
		if (binary1.substring(2,3).equals("0")) {
			decimalValueIndex1Binary1 = 0;
		}
		
		//if two's place of binary number is 1, its decimal value at that place is 2
		else  {
			decimalValueIndex1Binary1 = 2;
		}
		
		//looking at index 1 of the string of the first binary number (four's place of the binary number)
		//if the four's place of binary number is 0, its decimal value at that place is 0
        if (binary1.substring(1,2).equals("0")) {
        	decimalValueIndex2Binary1 = 0;
		}
        
        //if four's place of binary number is 1, its decimal value at that place is 4
        else {
        	decimalValueIndex2Binary1 = 4;
     
        }
        
        //looking at index 0 of the string of the first binary number (eigth's place of the binary number)
        //if eight's place of binary number is 0, its decimal value at that place is 0
        if (binary1.substring(0,1).equals("0")) {
        	decimalValueIndex3Binary1 = 0;
		}
		
        //if eight's place of binary number is 1, its decimal value at that place is 8
        else {
        	decimalValueIndex3Binary1 = 8;
        }
        
        
        
        //second binary number
        
          
        //index 3 of the string of the second binary number 
        //if the one's place of the binary number is 0, the decimal value at index 3 is 0
    	if (binary2.substring(3).equals("0")) {
    		decimalValueIndex0Binary2 = 0;
 		}
 		
    	//if one's place of binary number is 1, its decimal value at that place is 1
 		else { 
 			decimalValueIndex0Binary2 = 1;
 			
 		}
 		

 		
    	//index 2 of the string of the second binary number 
    	//if the two's place of the binary number is 0, decimal value at index 2 is 0
 		if (binary2.substring(2,3).equals("0")) {
 			decimalValueIndex1Binary2 = 0;
 		}
 		
 		//if two's place of binary number is 1, its decimal value at that place is 2
 		else  {
 			decimalValueIndex1Binary2 = 2;
 		}
 		
 		
 		//index 1 of the string of the second binary number 
 		//if the four's place of binary number is 0, decimal value at index 1 is 0
         if (binary2.substring(1,2).equals("0")) {
        	 decimalValueIndex2Binary2 = 0;
 		}
         
         //if four's place of binary number is 1, its decimal value at that place is 4
         else {
        	 decimalValueIndex2Binary2 = 4;
      
        }
         
         
          //index 0 of the string of the second binary number 
         //if eight's place of binary number is 0,  decimal value at index 0 is 0
         if (binary2.substring(0,1).equals("0")) {
        	 decimalValueIndex3Binary2 = 0;
 		}
 		
         //if eight's place of binary number is 1, its decimal value at that place is 8
         else {
        	 decimalValueIndex3Binary2 = 8;
        }
         
         
		
       //adding together the decimal values at each index of the first binary number to get the first decimal number
       int decimal1 = decimalValueIndex0Binary1 + decimalValueIndex1Binary1 + decimalValueIndex2Binary1 + decimalValueIndex3Binary1;
       
       //adding together the decimal values at each index of the second binary number to get the second decimal number
       int decimal2 = decimalValueIndex0Binary2 + decimalValueIndex1Binary2 + decimalValueIndex2Binary2 + decimalValueIndex3Binary2;
       
       //adding together the two decimal numbers to get their sum
       int sumOfDecimals = decimal1 + decimal2; 
        
       
       //outputting the decimal numbers and their sum to the user
        System.out.println( binary1 + " as a decimal value is " + decimal1);
        System.out.println( binary2 + " as a decimal value is " + decimal2);
        System.out.println("The sum of the decimal values is " + sumOfDecimals);
        System.out.println("Thank You!"); 
        
        
	}
}
