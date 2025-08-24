package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.interfaceElements.LoginPageInterfaceElements;
import com.utility.ExcelUtility;
import com.utility.FileReaderManager;

public class Loginpage extends BaseClass implements LoginPageInterfaceElements {
	
	@FindBy(xpath = username_xpath)
	private WebElement username;
	
	@FindBy(xpath = password_xpath)
	private WebElement password;
	
	@FindBy(xpath = entrylogin_xpath)
	private WebElement entrylogin;
	
	@FindBy(xpath = title_xpath)
	private WebElement title;

	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validLogin(ExtentTest extentTest) throws IOException {
		try {
			FileReaderManager data = new FileReaderManager();
			sendKeys(username, data.getDataProperty("username"));
			sendKeys(password, data.getDataProperty("password"));
			clickElementByJs(entrylogin);
			validation(title, ExcelUtility.getCellValue("DATA", "ID", "Title"));
			extentTest.log(Status.PASS, "Login Successful");
		}catch(Exception e) {
			extentTest.log(Status.FAIL, "Login Failed" + e.getMessage());
			return false;
		}
		return true;
		
		
		
	}

}
