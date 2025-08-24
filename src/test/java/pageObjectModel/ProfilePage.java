package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.profileUpdationInterfaceElements;
import com.utility.ExcelUtility;

public class ProfilePage extends BaseClass implements profileUpdationInterfaceElements {
	
	@FindBy(xpath = profile_xpath)
	private WebElement profile;
	
	@FindBy(xpath = update_xpath)
	private WebElement update;
	
	@FindBy(xpath = edit_xpath)
	private WebElement edit;
	
	@FindBy(xpath = salary_xpath)
	private WebElement salary;
	
	@FindBy(xpath = breakdown_xpath)
	private WebElement breakdown;
	
	@FindBy(xpath = fixed_xpath)
	private WebElement fixed;
	
	@FindBy(xpath = location_xpath)
	private WebElement location;
	
	@FindBy(id = save_id)
	private WebElement save;
	
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void profilepage() throws IOException {
		
		clickElementByJs(profile);
		clickElementByJs(update);
		clickElementByJs(edit);
		sendKeys(salary, ExcelUtility.getCellValue("DATA", "profile", "Salary"));
		clickElementByJs(breakdown);
		clickElementByJs(fixed);
		sendKeys(location, ExcelUtility.getCellValue("DATA", "profile", "Location"));
		clickElementByJs(save);
		
	}

}
