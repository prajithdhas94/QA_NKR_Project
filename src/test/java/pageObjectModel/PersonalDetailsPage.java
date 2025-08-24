package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.PersonalDetailsPageInterface;

public class PersonalDetailsPage extends BaseClass implements PersonalDetailsPageInterface {
	
	@FindBy(xpath = edit_xpath)
	private WebElement edit;
	
	@FindBy(id = dobdate_id)
	private WebElement date;
	
	@FindBy(id = dobmonth_id)
	private WebElement month;
	
	@FindBy(id = dobyear_id)
	private WebElement year;
	
	@FindBy(id = hometown_id)
	private WebElement hometown;
	
	@FindBy(id = pincode_id)
	private WebElement pincode;
	
	@FindBy(id = save_id)
	private WebElement save;
	
	public PersonalDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void personaldetailspage() {
		
	}

}
