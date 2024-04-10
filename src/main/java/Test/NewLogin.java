package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.PIMPage;
import Setup.Setup;


public class NewLogin extends Setup {
	LoginPage loginPage;
	PIMPage pimPage;
	@Test(description="Login with newly created Username and Password")
	public void doLogin() throws InterruptedException
	{
		loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(5000);
        loginPage.doLogin("JackJack", "Str0ngP@ssword");
        Thread.sleep(5000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "dashboard";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
  
	}
	
}

