package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import utility.Res;


public class TestUtility {
	public WebDriver driver;
	public SoftAssert sa;
	public Actions actions;
	
	

	@BeforeMethod
	public void startUpGlobal() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		sa = new SoftAssert();
		actions = new Actions(driver);

		driver.get(Res.getLogInUrl());
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void close() {
		driver.close();
	}
	
}
