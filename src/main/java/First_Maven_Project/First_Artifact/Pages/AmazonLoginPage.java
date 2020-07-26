package First_Maven_Project.First_Artifact.Pages;

import org.openqa.selenium.By;

public class AmazonLoginPage extends AmazonHomePage {

	public String LoginBox = "//div/h1[ contains ( text() , 'Login' ) ]";
	public String EmailOrPhoneNumber = "//div/input[@name='email']";
	public String Continue = "//div//span/input[@id='continue']";
	public String Password = "//div/input[@type='password']";
	public String Login = "//div//span/input[ @id='signInSubmit' ]";

	public void SignIN() {
		driver.findElement(By.xpath(EmailOrPhoneNumber)).sendKeys("+917276743510");
		driver.findElement(By.xpath(Continue)).click();
		driver.findElement(By.xpath(Password)).sendKeys("A@123456");
		driver.findElement(By.xpath(Login)).click();

	}

}
