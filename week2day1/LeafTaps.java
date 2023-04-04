package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("demoSalesManager");
	   // username.clear();
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    String Title= driver.getTitle();
	    System.out.println(Title);
	    
	    
	}

}
