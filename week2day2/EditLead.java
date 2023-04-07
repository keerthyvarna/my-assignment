package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*http://leaftaps.com/opentaps/control/main

* 1	Launch the browser
* 2	Enter the username
* 3	Enter the password
* 4	Click Login
* 5	Click crm/sfa link
* 6	Click Leads link
* 7	Click Find leads
* 8	Enter first name
* 9	Click Find leads button
* 10 Click on first resulting lead
* 11 Verify title of the page
* 12 Click Edit
* 13 Change the company name
* 14 Click Update
* 15 Confirm the changed name appears
* 16 Close the browser (Do not log out)*/
//(//div[contains(@class,'form')]/input)[23]
public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	//	Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("keerthana");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
    	driver.getTitle();
    	driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
    	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
    	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("qeagle");
    	driver.findElement(By.className("smallSubmit")).click();
       	WebElement name = driver.findElement(By.id("viewLead_companyName_sp"));
       	String cname = name.getText();
       	System.out.println("changed name: "+ cname);
       	
    
	}
}
