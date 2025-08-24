package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.ITSkillInterface;
import com.utility.ExcelUtility;

public class ITSkillPage extends BaseClass implements ITSkillInterface {
	
	@FindBy(xpath = add_xpath)
	private WebElement add;
	
	@FindBy(id = skillname_id)
	private WebElement skillname;
	
	@FindBy(id = version_id)
	private WebElement version;
	
	@FindBy(id = lastused_id)
	private WebElement lastused;
	
	@FindBy(xpath = used_xpath)
	private WebElement used;
	
	@FindBy(id = experienceyears_id)
	private WebElement experienceyears;
	
	@FindBy(xpath = year_xpath)
	private WebElement year;
	
	@FindBy(id = experiencemonths_id)
	private WebElement experiencemonths;
	
	@FindBy(xpath = months_xpath)
	private WebElement month;
	
	@FindBy(id = save_id)
	private WebElement save;
	
	public ITSkillPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ITpage() throws IOException {
		sendKeys(skillname, ExcelUtility.getCellValue("DATA", "IT", "Key Skills"));
		sendKeys(version, ExcelUtility.getCellValue("DATA", "IT", "Title"));
		clickElementByJs(lastused);
		clickElementByJs(used);
		clickElementByJs(experienceyears);
		clickElementByJs(year);
		clickElementByJs(experiencemonths);
		clickElementByJs(month);
		clickElementByJs(save);
	}

}
