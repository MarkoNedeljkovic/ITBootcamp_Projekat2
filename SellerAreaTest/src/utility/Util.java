package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

	public static void hold( int sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void back(WebDriver driver) {
		driver.navigate().back();
	}
	
	public static void input (String input, WebElement elem) {
		elem.clear();
		elem.sendKeys(input);
	}
	
	public static void click (WebElement elem) {
		elem.click();
	}
	
	public static String getText (WebElement elem) {
		return elem.getText();
	}
	
	public static String getUrl (WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public static void refresh (WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public static String getAttribute (WebElement elem, String attribute) {
		return elem.getAttribute(attribute);
	}
	
	public static int stringToInt (String text) {
		double br = Double.parseDouble(text);
		return (int)br;
	}

}
