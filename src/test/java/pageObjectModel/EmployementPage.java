package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.employmentInterface;
import com.utility.ExcelUtility;

public class EmployementPage extends BaseClass implements employmentInterface {
	
	@FindBy(id = add_id)
	private WebElement add;
	
	@FindBy(xpath = experienceyears_xpath)
	private WebElement experienceyears;
	
	@FindBy(xpath = years_xpath)
	private WebElement years;
	
	@FindBy(xpath = experiencemonths_xpath)
	private WebElement experiencemonths;
	
	@FindBy(xpath = months_xpath)
	private WebElement months;
	
	@FindBy(id = companyname_id)
	private WebElement companyname;
	
	@FindBy(id = jobtitle_id)
	private WebElement jobtitle;
	
	@FindBy(id = joiningdate_id)
	private WebElement joiningdate;
	
	@FindBy(xpath = year_xpath)
	private WebElement date;
	
	@FindBy(id = joiningmonth_id)
	private WebElement joiningmonth;
	
	@FindBy(xpath = month_xpath)
	private WebElement month;
	
	@FindBy(id = salary_id)
	private WebElement salary;
	
	@FindBy(id = skills_id)
	private WebElement skills;
	
	@FindBy(id = jobprofile_id)
	private WebElement jobprofile;
	
	@FindBy(xpath = noticeperiod_xpath)
	private WebElement noticeperiod;
	
	@FindBy(xpath = period_xpath)
	private WebElement period;
	
	@FindBy(id = save_id)
	private WebElement save;
	
	public EmployementPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void employmentpage() throws IOException {
		clickElementByJs(add);
		clickElementByJs(experienceyears);
		clickElementByJs(years);
		clickElementByJs(experiencemonths);
		clickElementByJs(months);
		sendKeys(companyname, ExcelUtility.getCellValue("DATA", "employ", "company"));
		sendKeys(jobtitle, ExcelUtility.getCellValue("DATA", "employ", "Title"));
		clickElementByJs(joiningdate);
		clickElementByJs(date);
		clickElementByJs(joiningmonth);
		clickElementByJs(month);
		sendKeys(salary, ExcelUtility.getCellValue("DATA", "employ", "Salary"));
		sendKeys(skills, ExcelUtility.getCellValue("DATA", "employ", "Key Skills"));
		sendKeys(jobprofile, ExcelUtility.getCellValue("DATA", "employ", "Resume headline"));
		clickElementByJs(noticeperiod);
		clickElementByJs(period);
		clickElement(save);
	}
	

}
