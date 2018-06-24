package ElementActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ElementObjects.phpTravelNavigateObjects;
import TextContest.DriverManager;
import supports.commonUtilities;

public class phpTravelNavigateActions extends phpTravelNavigateObjects{
	
	public WebDriver driver;
	public commonUtilities commObj;
	
	public phpTravelNavigateActions(DriverManager driverObj) {
		driver = driverObj.getDriver();
		commObj = new commonUtilities(driverObj);
		PageFactory.initElements(driver, this);
	}

	public void navigateToSite(String page) throws Throwable {
		String loginUrl = "";
		if(page.equalsIgnoreCase("homepage"))
			loginUrl = homePageLink.getText();
		else if(page.equalsIgnoreCase("adminpage"))
			loginUrl = adminPageLink.getText();
		else
			loginUrl = supplierPageLink.getText();
		commObj.openURL(loginUrl);
	}
	
	public void navigateToSignUpPage() throws Throwable {
		commObj.waitForElement(myAccountBtn);
		commObj.actionClickElement(myAccountBtn);
		commObj.clickElement(signUpBtn);
		commObj.getThreeSecWait();
	}
	
	public void navigateToLoginPage() throws Throwable {
		commObj.waitForElement(myAccountBtn);
		commObj.clickElement(myAccountBtn);
		commObj.clickElement(loginBtn);
		commObj.getThreeSecWait();
	}
}
