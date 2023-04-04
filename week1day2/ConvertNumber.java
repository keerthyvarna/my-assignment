package week1day2;

/*Problem statement: Convert a negative number to positive number
---------------------------------------------------------------
Pseudocode:
-----------
1. Initialize an integer with a negative number
   like, int number = -40;
2. Check if the number is a negative number 
   Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive numer

4. Print as below
        "The number -40 is converted to 40"*/
public class ConvertNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = -40;
if(num <=0) {
	num = num*-1;
}
System.out.println(num);
}
	}


