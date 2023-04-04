package week1day2;
/*
 * Goal: To find Fibonacci Series for a given range
 *  * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
 *  * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
 * enter
 *  * What are my learnings from this code? 1) 2) 3)
 *  */
//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		// Print first number
		
		// Iterate from 1 to the range
		
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number
		
		// print sum
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int range = 8;
         int fNum = 0;
         int sNum = 1;
         System.out.println(fNum);
         for(int i=1;i<=range;i++) {
        	 int sum = fNum + sNum;
        	 fNum = sNum;
        	 sNum = sum;
        	 System.out.println(fNum);
        	 
         }
	}

}
