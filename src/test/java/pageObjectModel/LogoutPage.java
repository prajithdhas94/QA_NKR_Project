package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.LogoutInterface;

import pageObjectManager.PageObjectManager;

public class LogoutPage extends BaseClass implements LogoutInterface {
	
	@FindBy(xpath = edit_xpath)
	private WebElement edit;
	
	@FindBy(xpath = logout_xpath)
	private WebElement logout;
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void logoutpage() {
		
	}

}
