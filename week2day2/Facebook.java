package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		/*
		 * // Step 1: Launch the chromebrowser // Step 2: Load the URL
		 * https://en-gb.facebook.com/ // Step 3: Maximise the window // Step 4: Add
		 * implicit wait // Step 5: Click on Create New Account button // Step 6: Enter
		 * the first name // Step 7: Enter the last name // Step 8: Enter the mobile
		 * number // Step 9: Enterthe password // Step 10: Handle all the three drop
		 * downs // Step 11: Select the radio button "Female" ( A normal click will do
		 * for this step)
		 */
        ChromeDriver driver = new ChromeDriver();
        driver.get(" https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[contains(@class,'42ft')]")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("keerthy");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("varna");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9944805979");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password");
        WebElement dd1 = driver.findElement(By.xpath("//select[@id='day']"));
        Select day = new Select(dd1);
        day.selectByVisibleText("6");
        WebElement dd2 = driver.findElement(By.xpath("//select[@id='month']"));
        Select month = new Select(dd2);
        month.selectByVisibleText("Nov");
        WebElement dd3 = driver.findElement(By.xpath("//select[@id='year']"));
        Select year = new Select(dd3);
        year.selectByVisibleText("1997");
        driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
        driver.close();
        
        
        

	}

}
