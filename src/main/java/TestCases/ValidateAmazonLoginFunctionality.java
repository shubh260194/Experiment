package TestCases;

import First_Maven_Project.First_Artifact.Pages.AmazonHomePage;
import First_Maven_Project.First_Artifact.Pages.AmazonLoginPage;
import First_Maven_Project.First_Artifact.Pages.BaseClass;
import First_Maven_Project.First_Artifact.Pages.CloseWindows;
import First_Maven_Project.First_Artifact.Pages.LaunchBrowser;

public class ValidateAmazonLoginFunctionality extends BaseClass {

	public static void main(String[] args) {

		LaunchBrowser LaunchBrowser = new LaunchBrowser();
		AmazonHomePage AmazonHomePage = new AmazonHomePage();
		CloseWindows CloseWindows = new CloseWindows();
		AmazonLoginPage AmazonLoginPage = new AmazonLoginPage();

		LaunchBrowser.LaunchChrome();
		AmazonHomePage.openHomePage();
		AmazonHomePage.ClickOnSignIN();
		AmazonLoginPage.SignIN();
		AmazonHomePage.ClickOnSignOut();
		CloseWindows.QuitBrowser();

	}

}
