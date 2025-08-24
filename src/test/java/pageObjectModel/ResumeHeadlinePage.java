package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.resumeHeadlineInterfaceElements;
import com.utility.ExcelUtility;

public class ResumeHeadlinePage extends BaseClass implements resumeHeadlineInterfaceElements {
	
	@FindBy(xpath = edit_xpath)
	private WebElement edit;
	
	@FindBy(id = headline_id)
	private WebElement headline;
	
	@FindBy(xpath = save_xpath)
	private WebElement save;
	
	public ResumeHeadlinePage() {
		PageFactory.initElements(driver, this);
	}
	public void headlinePage() throws IOException {
		clickElementByJs(edit);
		sendKeys(headline, ExcelUtility.getCellValue("DATA", "head", "Resume headline"));
		clickElement(save);
	}

}
