package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.ProfileSummaryInterface;
import com.utility.ExcelUtility;

public class ProfileSummaryPage extends BaseClass implements ProfileSummaryInterface {
	
	@FindBy(xpath = edit_xpath)
	private WebElement edit;
	
	@FindBy(id = summary_id)
	private WebElement summary;
	
	@FindBy(xpath = save_xpath)
	private WebElement save;
	
	public ProfileSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void profilesummarypage() throws IOException {
		clickElementByJs(edit);
		sendKeys(summary, ExcelUtility.getCellValue("DATA", "profile", "Resume headline"));
		clickElementByJs(save);
	}

}
