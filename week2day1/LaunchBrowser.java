package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	   ChromeDriver driver = new ChromeDriver();
	   EdgeDriver edge = new EdgeDriver();
   
    driver.get("https://www.facebook.com/login");
    edge.get("http://leaftaps.com/opentaps/control/main");
	}

}
