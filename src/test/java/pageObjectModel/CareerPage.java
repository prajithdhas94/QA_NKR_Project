package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.CareerProfileInterface;

public class CareerPage extends BaseClass implements CareerProfileInterface {
	
	@FindBy(xpath = edit_xpath)
	private WebElement edit;
	
	@FindBy(id = industry_id)
	private WebElement industry;
	
	@FindBy(id = department_id)
	private WebElement department;
	
	@FindBy(id = role_id)
	private WebElement role;
	
	@FindBy(id = jobrole_id)
	private WebElement jobrole;
	
	@FindBy(id = location_id)
	private WebElement location;
	
	@FindBy(xpath = salary_xpath)
	private WebElement salary;
	
	@FindBy(id = save_id)
	private WebElement save;
	
	public CareerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void careerpage() {
		
	}

}
