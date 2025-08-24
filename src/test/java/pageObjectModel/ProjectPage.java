package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.ProjectInterface;
import com.utility.ExcelUtility;

public class ProjectPage extends BaseClass implements ProjectInterface {
	
	@FindBy(xpath = addproject_xpath)
	private WebElement addproject;
	
	@FindBy(id = title_id)
	private WebElement title;
	
	@FindBy(id = education_id)
	private WebElement education;
	
	@FindBy(xpath = degree_xpath)
	private WebElement degree;
	
	@FindBy(id = client_id)
	private WebElement client;
	
	@FindBy(id = year_id)
	private WebElement year;
	
	@FindBy(xpath = years_xpath)
	private WebElement years;
	
	@FindBy(id = month_id)
	private WebElement month;
	
	@FindBy(xpath = months_xpath)
	private WebElement months;
	
	@FindBy(id = project_id)
	private WebElement project;
	
	@FindBy(id = save_id)
	private WebElement save;
	
	public ProjectPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void projectpage() throws IOException {
		clickElementByJs(addproject);
		sendKeys(title, ExcelUtility.getCellValue("DATA", "project", "Title"));
		clickElementByJs(education);
		clickElementByJs(degree);
		sendKeys(client, ExcelUtility.getCellValue("DATA", "project", "Resume headline"));
		clickElementByJs(year);
		clickElementByJs(years);
		clickElementByJs(month);
		clickElementByJs(months);
		sendKeys(project, ExcelUtility.getCellValue("DATA", "project", "Key Skills"));
		clickElementByJs(save);
	}

}
