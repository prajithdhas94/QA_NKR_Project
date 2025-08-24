package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.EducationInterface;
import com.utility.ExcelUtility;

public class EducationPage extends BaseClass implements EducationInterface {
	
	@FindBy(xpath = add_xpath)
	private WebElement add;
	
	@FindBy(xpath = education_xpath)
	private WebElement education;
	
	@FindBy(xpath = graduation_xpath)
	private WebElement graduation;
	
	@FindBy(xpath = university_xpath)
	private WebElement university;
	
	@FindBy(xpath = course_xpath)
	private WebElement course;
	
	@FindBy(xpath = degree_xpath)
	private WebElement degree;
	
	@FindBy(xpath = specialisation_xpath)
	private WebElement specialisation;
	
	@FindBy(xpath = subject_xpath)
	private WebElement subject;
	
	@FindBy(xpath = startyear_xpath)
	private WebElement startyear;
	
	@FindBy(xpath = year_xpath)
	private WebElement year;
	
	@FindBy(xpath = endyear_xpath)
	private WebElement endyear;
	
	@FindBy(xpath = years_xpath)
	private WebElement years;
	
	@FindBy(xpath = gradingsystem_xpath)
	private WebElement gradingsystem;
	
	@FindBy(xpath = system_xpath)
	private WebElement system;
	
	@FindBy(id = save_id)
	private WebElement save;
	
	public EducationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void educationpage() throws IOException {
		clickElementByJs(add);
		clickElementByJs(education);
		clickElementByJs(graduation);
		sendKeys(university, ExcelUtility.getCellValue("DATA", "education", "company"));
		clickElementByJs(course);
		clickElementByJs(degree);
		clickElementByJs(specialisation);
		clickElementByJs(subject);
		clickElementByJs(startyear);
		clickElementByJs(year);
		clickElementByJs(endyear);
		clickElementByJs(years);
		clickElementByJs(gradingsystem);
		clickElementByJs(system);
		clickElementByJs(save);
	}

}
