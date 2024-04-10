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


public class PIMTest extends Setup {
	LoginPage loginPage;
	PIMPage pimPage;
	@BeforeTest
	public void doLogin() throws InterruptedException
	{
		loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(5000);
        loginPage.doLogin("Admin", "admin123");
        Thread.sleep(5000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "dashboard";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        List<WebElement> menus = driver.findElements(By.className("oxd-main-menu-item--name"));
        menus.get(1).click();
	}
	@Test(priority = 1, description = "Create First Employee")
    public void doAddFirstEmployee() throws InterruptedException
    {
		pimPage = new PIMPage(driver);
		//pimPage.addButtons.click();
		pimPage.addEmployeeLinkText.click();
		pimPage.addEmployee("Jack", "Jack","JackJack","Str0ngP@ssword","Str0ngP@ssword");
    }
	@Test(priority = 3, description = "Logs Out")
    public void doLogout() {
		pimPage = new PIMPage(driver);
		pimPage.profileImage.click();
		pimPage.logoutLink.click();
		
		
	}
	
}

