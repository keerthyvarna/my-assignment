package week1day2;
/*
 * Goal: To find whether a number is a Prime number or not
 *  * input: 13
 * output: 13 is a Prime Number
 *  * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
  */

	// Declare an int Input and assign a value 13
		// Declare a boolean variable flag as false
		// Iterate from 2 to half of the input
		// Divide the input with each for loop variable and check the remainder
		// Set the flag as true when there is no remainder
		// break the iterator
	// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		// Print 'Not a Prime' when the condition doesn't match 
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int input=11;
       boolean flag=false;
       int rem;
       for(int i=2;i<=input/2;i++) {
    	   rem=input%i;
    	   if(rem==0) {
    		   flag=true;
    		   break;
    	   }
       }
       if(flag==true) {
    	   System.out.println("the given number "+ input+ " is not prime");
       }
       else {
    	   System.out.println("the given number "+input + " is  prime");
       
	
    	   }
       }
	}


	