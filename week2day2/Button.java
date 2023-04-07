package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*https://www.leafground.com/button.xhtml
1. Click and Confirm title
2. Confirm if the button is disabled
3. Find the position of the Submit button*/
public class Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		if(driver.getTitle().contains("Dashboard")) {
			System.out.println("I confirm the title");
			}else
			{
				System.out.println("Title is not confirmed");
			}
		driver.navigate().back();
	System.out.println("button enabled: "+driver.findElement(By.name("j_idt88:j_idt92")).isEnabled());
	System.out.println("location: "+driver.findElement(By.name("j_idt88:j_idt94")).getLocation());
	driver.close();
				

	}

}
