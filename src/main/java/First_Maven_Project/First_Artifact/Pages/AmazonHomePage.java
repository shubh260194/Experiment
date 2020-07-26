package First_Maven_Project.First_Artifact.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends BaseClass {

	Actions actions;

	public AmazonHomePage() {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public String HomePageUrl = "https://www.amazon.in/";
	WebElement AccountsAndLists = driver.findElement(By.xpath("//div/span[contains( text(), 'Hello, Sign in' )]"));
	WebElement SignIn = driver.findElement(By.xpath("//div/a[ contains(text(), 'Sign In' ) ]"));
	WebElement SignOut = driver.findElement(By.xpath("//div/a[ contains(text(), 'Sign Out' ) ]"));

	// public String SignIn = "//div//span[ contains( text(),'Hello, Sign in')]" ;
	public void openHomePage() {
		driver.get(HomePageUrl);
	}

	public void ClickOnSignIN() {
		// driver.findElement(By.xpath(SignIn)).click();

		actions.moveToElement(AccountsAndLists).perform();
		actions.moveToElement(SignIn).click();
	}

	public void ClickOnSignOut() {

		actions.moveToElement(AccountsAndLists).perform();
		actions.moveToElement(SignOut).click();

	}

}
