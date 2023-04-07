package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 *  * 2. Enter UserName and Password Using Id Locator
 *  * 3. Click on Login Button using Class Locator
 *  * 4. Click on CRM/SFA Link
 *  * 5. Click on contacts Button
 *  * 6. Click on Create Contact
 *  * 7. Enter FirstName Field Using id Locator
 *  * 8. Enter LastName Field Using id Locator
 *  * 9. Enter FirstName(Local) Field Using id Locator
 *  * 10. Enter LastName(Local) Field Using id Locator
 *  * 11. Enter Department Field Using any Locator of Your Choice
 *  * 12. Enter Description Field Using any Locator of your choice
 *  * 13. Enter your email in the E-mail address Field using the locator of your
 * choice
 *  * 14. Select State/Province as NewYork Using Visible Text
 *  * 15. Click on Create Contact
 *  * 16. Click on edit button
 *  * 17. Clear the Description Field using .clear
 *  * 18. Fill ImportantNote Field with Any text
 *  * 19. Click on update button using Xpath locator
 *  * 20. Get the Title of Resulting Page.
 */
public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("keerthy");
		driver.findElement(By.id("lastNameField")).sendKeys("yadav");
		driver.findElement(By.name("firstNameLocal")).sendKeys("rathi");
		driver.findElement(By.name("lastNameLocal")).sendKeys("varna");
		driver.findElement(By.name("departmentName")).sendKeys("testing");
		driver.findElement(By.name("description")).sendKeys("learn selenium");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("keerthyvarna@gmail.com");
		WebElement dd1 = driver.findElement(By.xpath("//select[contains(@id,'State')]"));
		Select state = new Select(dd1);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("learn selenium");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		driver.close();

		
	}

}
