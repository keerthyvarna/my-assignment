package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox')])[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox')])[5]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox')])[7]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox')])[15]")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		System.out.println("checkbox enabled: " +driver.findElement(By.xpath("(//div[@class='col-12']/div)[4]")).isEnabled());
		driver.findElement(By.xpath("//ul[contains(@class,'multiple')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[12]")).click();
		
	}

}
