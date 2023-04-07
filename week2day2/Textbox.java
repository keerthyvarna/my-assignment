package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*. Type your name
2. Append Country to this City
3. Verify if text box is disabled
4. Clear the typed text
5. Retrieve the typed text
6. Type email and Tab. Confirm control moved to next element
7. Type about yourself
8. Text Editor
9. Just Press Enter and confirm error message*
10. Click and Confirm Label Position Changes
11. Type your name and choose the third option
12. Click and Confirm Keyboard appears
13. Custom Toolbar
*/
public class Textbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("j_idt88:name")).sendKeys("keerthana");
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(",India");
		System.out.println(" textbox enabled: "+driver.findElement(By.name("j_idt88:j_idt93")).isEnabled());
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		WebElement name = driver.findElement(By.name("j_idt88:j_idt97"));
		String retrieve = name.getAttribute("value");
		System.out.println("Retrieved text: "+ retrieve);
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("keerthyvarna006@gmail.com");
		driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("Im keerthana");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("All is well");
		driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText());
		driver.findElement(By.name("j_idt106:float-input")).click();
		driver.findElement(By.name("j_idt106:float-input")).sendKeys("keerthy");
		driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("keerthy varna");
		//driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		driver.findElement(By.xpath("(//li[contains(@class,'item')])[10]")).click();
		driver.findElement(By.name("j_idt106:j_idt122")).click();
		System.out.println("keyboard appears");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("task completed");
		
	}

}
