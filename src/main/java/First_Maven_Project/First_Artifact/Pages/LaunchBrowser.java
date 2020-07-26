package First_Maven_Project.First_Artifact.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchBrowser extends BaseClass {

	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver", "D://setups//SeleniumLibraries//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		action = new Actions(driver);
	}

}
