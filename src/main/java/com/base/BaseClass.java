package com.base;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BaseClass {
	public static ExtentReports extentReports;
	public static File file;
	public static WebDriver driver;
	protected static WebDriver browserLaunch(String browser) {
		try {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING BROWSER LAUNCH");
		}

		driver.manage().window().maximize();
		return driver;
	}
	protected static void launchUrl(String url) {
		try {
			driver.get(url);
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING URL LAUNCH");
		}
	}
	protected static void clickElement(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING SEARCHING ELEMENT");
		}
	}
	protected static void navigateTo(String name) {
		try {
			driver.navigate().to(name);
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING NAVIGATING NEXT ELEMENT");
		}
	}
	protected static void navigate(String type) {
		try {
			if(type.equalsIgnoreCase("forward")) {
				driver.navigate().forward();	
			}else if(type.equalsIgnoreCase("Back")) {
				driver.navigate().back();
			}else if(type.equalsIgnoreCase("Refresh")) {
				driver.navigate().refresh();
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING BROWSER NAVIGATING");
		}
	}
	
	protected static void close() {
		try {
			driver.close();
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING CLOSING WINDOW");
		}
	}
	protected static void quit() {
		try {
			driver.quit();
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING CLOSING ALL WINDOW");
		}
	}
	
	protected static void pageTitle() {
		try {
			driver.getTitle();
			System.out.println(driver.getTitle());
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING GETTING PAGE TITLE");
		}
	}
	protected static void currentPage() {
		try {
			driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING GETTING CURRENT PAGE TITLE");
		}
	}
	protected static void gettingUrl(String url) {
		try {
			driver.get(url);
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING GETTING URL");
		}
	}
	protected static void gettingText(WebElement element) {
		try {
			String text = element.getText();
			System.out.println(text);
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING GETTING TEXT");
		}
	}
	protected static void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING SENDING VALUES");
		}
	}
	protected static void dropDownSelectOptions(WebElement element,String type,String value) {
		try {
			Select select = new Select(element);
			if(type.equalsIgnoreCase("text")) {
				select.selectByVisibleText(value);
			}else if(type.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(value));
			}else if(type.equalsIgnoreCase("value")) {
				select.selectByValue(value);
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING SELECTING OPTIONS");
		}
	}
	protected static void dropDownDeselectOptions(WebElement element,String type,String value) {
		try {
			Select select = new Select(element);
			if(type.equalsIgnoreCase("text")) {
				select.deselectByVisibleText(value);
			}else if(type.equalsIgnoreCase("index")) {
				select.deselectByIndex(Integer.parseInt(value));
			}else if(type.equalsIgnoreCase("value")) {
				select.deselectByValue(value);
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING DESELECTING OPTIONS");
		}
	}
	protected static void windowHandles(int num) {
		try {
			List<String> accessWindows = new ArrayList(driver.getWindowHandles());
			driver.switchTo().window(accessWindows.get(num));
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING HANDLING WINDOWS");
		}
	}
	protected static void checkingElement(WebElement element,String type) {
		try {
			if(type.equalsIgnoreCase("isEnable")) {
				boolean enabled = element.isEnabled();
				System.out.println(enabled);
			}else if(type.equalsIgnoreCase("isDisplayed")) {
				boolean displayed = element.isDisplayed();
				System.out.println(displayed);
			}else if(type.equalsIgnoreCase("isSelected")) {
				boolean selected = element.isSelected();
				System.out.println(selected);
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING CHECKING ELEMENT");
		}
	}
	protected static void screenShot() {
		try {
			Date currentDate = new Date();
			String dataFile = currentDate.toString().replace(" ", "_").replace(":", "_");
			File screenShot  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenShot, new File(".\\screenshot\\"+dataFile+".png"));
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING TAKING SCREENSHOT");
		}
	}
	protected static void scrollInto(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING SCROLL INTO ELEMENT");
		}
		
	}
	protected static void clickElementByJs(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING CLICK ELEMENT");
		}
	}
	protected static void alert(String type) {
		try {
			Alert alert = driver.switchTo().alert();
			if(type.equalsIgnoreCase("Ok")) {
				alert.accept();
			}else if(type.equalsIgnoreCase("Cancel")) {
				alert.dismiss();
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING ALERT HANDLING");
		}
	}
	protected static void promptAlert(String type, String value) {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(value);
			if(type.equalsIgnoreCase("Ok")) {
				alert.accept();
			}else if(type.equalsIgnoreCase("Cancel")) {
				alert.dismiss();
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING PROMPT ALERT HANDLING");
		}
	}
	protected static void passInputJs(WebElement element, String value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click;", element);
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING VALUE PASS BY JS");
		}
	}
	protected static void isMultiple(WebElement element, String type) {
		try {
			Select select = new Select(element);
			if(type.equalsIgnoreCase("isMultiple")) {
				System.out.println(select.isMultiple());
			}else if(type.equalsIgnoreCase("getFirstSelectedOption")) {
				System.out.println(select.getFirstSelectedOption());
			}else if(type.equalsIgnoreCase("getAllSelectedOption")) {
				System.out.println(select.getAllSelectedOptions());
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING MULTIPLE DROP DOWN");
		}	
	}
	protected static void radioButton(WebElement element) {
		try {
			if(element.isEnabled()==false) {
				element.click();
			}
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING SELECTING RADIO BUTTON");
		}
	}
	protected static void validation(WebElement actual, String expected) {
		try {
			Assert.assertEquals(actual.getText(), expected);
			System.out.println(actual.getText());
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING VALIDATION");
		}
	}
	public static void extentReportStart(String location) {
		try {
			extentReports = new ExtentReports();
			file = new File(location);
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
			extentReports.attachReporter(sparkReporter);
			extentReports.setSystemInfo("os", System.getProperty("os.name"));
			extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING EXTENT REPORT START");
		}
		
	}
	public static void extentReportEnd(String location) throws IOException {
		try {
			extentReports.flush();
			file = new File(location);
			Desktop.getDesktop().browse((file).toURI());
		}catch(Exception e) {
			Assert.fail("ERROR : OCCURED DURING EXTENT REPORT END");
		}
		
	}
    public String takeScreenshot() throws IOException {
	       TakesScreenshot screenshot = (TakesScreenshot)driver;
	       String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	       File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
	       File destfile = new File("screenshot\\.png" + "_" + timeStamp + ".png");
	       FileHandler.copy(scrfile, destfile);
	       return destfile.getAbsolutePath();
   }

		
	}



