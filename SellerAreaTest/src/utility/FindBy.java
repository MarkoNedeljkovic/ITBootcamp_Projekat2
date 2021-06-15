package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindBy {
	
	public static WebElement className (String className, WebDriver driver) {
		return driver.findElement(By.className(className));
	}
	
	public static WebElement cssSelector(String cssSelector, WebDriver driver) {
		return driver.findElement(By.cssSelector(cssSelector));
	}
	
	public static WebElement id(String id, WebDriver driver) {
		return driver.findElement(By.id(id));
	}
	
	public static WebElement linkText(String linkText, WebDriver driver) {
		return driver.findElement(By.linkText(linkText));
	}
	
	public static WebElement name(String name, WebDriver driver) {
		return driver.findElement(By.name(name));
	}
	
	public static WebElement partialLinkText(String partialLinkText, WebDriver driver) {
		return driver.findElement(By.partialLinkText(partialLinkText));
	}
	
	public static WebElement tagName(String tagName, WebDriver driver) {
		return driver.findElement(By.tagName(tagName));
	}
	
	public static WebElement xpath(String xpath, WebDriver driver) {
		return driver.findElement(By.xpath(xpath));
	}
	
	

}
