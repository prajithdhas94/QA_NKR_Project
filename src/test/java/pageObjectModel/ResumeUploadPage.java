package pageObjectModel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceElements.resumeUpdateInterfaceElements;

public class ResumeUploadPage extends BaseClass implements resumeUpdateInterfaceElements {
	
	@FindBy(xpath = update_xpath)
	private WebElement update;
	
	public ResumeUploadPage() {
		PageFactory.initElements(driver, this);
	}
	public void resumeUpdate() throws AWTException {
		clickElement(update);
		Robot robot = new Robot();
		robot.delay(2000);
		StringSelection ss = new StringSelection("D:\\My Datas\\Resume.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	

}
