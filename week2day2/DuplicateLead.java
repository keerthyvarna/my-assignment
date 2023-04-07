
package week2day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*http://leaftaps.com/opentaps/control/main

1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Email
9	Enter Email
10	Click find leads button
11	Capture name of First Resulting lead
12	Click First Resulting lead
13	Click Duplicate Lead
14	Verify the title as 'Duplicate Lead'
15	Click Create Lead
16	Confirm the duplicated lead name is same as captured name
17	Close the browser (Do not log out)*/



public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress'] ")).sendKeys("keerthyvarna006@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(3000);
	    WebElement id = driver.findElement(By.xpath("(//div[contains(@class,'cell')]/a)[3]"));
		String name1=id.getText();
		System.out.println("captured lead name: "+ name1);
		id.click();
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click(); 
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement name = driver.findElement(By.id("viewLead_firstName_sp"));
		String name2= name.getText();
		System.out.println("duplicated lead name: "+ name2);
		driver.close();
		 
		
		

	}

}
