package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.keySkillInterfaceElements;
import com.utility.ExcelUtility;

public class KeySkillsPage extends BaseClass implements keySkillInterfaceElements {
	
	
	@FindBy(xpath = edit_xpath)
	private WebElement edit;
	
	@FindBy(xpath = skills_xpath)
	private WebElement skills;
	
	@FindBy(id = save_id)
	private WebElement id;
	
	public KeySkillsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void skillsPage() throws IOException {
		clickElement(edit);
		sendKeys(skills, ExcelUtility.getCellValue("DATA", "key", "Key Skills"));
		clickElement(id);
	}

}
