package week1day1;

public class Bike {
public void applyBrake()
{
	System.out.println("brakes not applied");
}
public void soundHorn()
{
	System.out.println("no horn");
}
public static void main(String[] args) {
	Bike hunter=new Bike();
	Car kreta=new Car();
      hunter.applyBrake();
      hunter.soundHorn();
      kreta.applyBrake();
      kreta.soundHorn();
      
}
}
