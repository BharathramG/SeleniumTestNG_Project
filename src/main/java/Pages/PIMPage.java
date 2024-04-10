package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PIMPage {
	

    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    public WebElement addEmployeeLinkText;
    
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;
    
    
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;
    
    @FindBy(className = "oxd-switch-wrapper")
    public WebElement createLogin;
    
    
    
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    public WebElement userName;
    
    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement userpass;
    
    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement cnfPass;
    
    @FindBy(xpath = " //button[@type='submit']")
    public WebElement save; 
    
    @FindBy(className = "oxd-userdropdown-img")
    public WebElement profileImage;
    
    @FindBy(partialLinkText = "Logout")
    public WebElement logoutLink;
   
    public PIMPage(WebDriver driver){
    	
        PageFactory.initElements(driver, this);
    }
    
    public void addEmployee(String firstname, String lastname,String username, String pass, String cnfpass) throws InterruptedException
    {
    	firstName.sendKeys(firstname);
    	lastName.sendKeys(lastname);
    	createLogin.click();
    	userName.sendKeys(username);
    	Thread.sleep(5);
    	userpass.sendKeys(pass);
    	Thread.sleep(5);
    	cnfPass.sendKeys(cnfpass);
    	save.click();
    }



}
