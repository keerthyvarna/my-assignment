package week1day1;
/*Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console */

public class Mobile {
	public void sendSms()
	{
		String mobileModel="Redmi 8";
		float mobileWeight=200.0f;
		System.out.println("mobile model: "+mobileModel);
		System.out.println("weight: "+mobileWeight+" grams");
	}
	public void makeCall()
	{
		boolean fullyCharged=true;
		int mobileCost=9000;
		System.out.println("it is fully charged: "+fullyCharged);
		System.out.println("cost=Rs."+mobileCost);
	}

	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile redmi= new Mobile();
		redmi.sendSms();
		redmi.makeCall();

	}

}
