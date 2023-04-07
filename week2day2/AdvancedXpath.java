package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdvancedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
	    driver.get("http://leaftaps.com/opentaps/control/main");
	   driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
  driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    driver.findElement(By.xpath("(//a[contains(@href,'crm')])[2]")).click();
    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

}
