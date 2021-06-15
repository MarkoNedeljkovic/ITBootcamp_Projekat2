package pages;

import org.openqa.selenium.WebDriver;

import utility.FindBy;
import utility.Res;
import utility.Util;

public class LogIn {
	
	public static void logIn (String username, String password, WebDriver driver) {
		Util.input(username, FindBy.xpath(Res.getLogInUsernameXpath(), driver));
		Util.input(password, FindBy.xpath(Res.getLogInPasswordXpath(), driver));
		Util.click(FindBy.xpath(Res.getLogInBtnXpath(), driver));
	}
	
	public static String incorectLogInCheck(WebDriver driver) {
		return Util.getText(FindBy.xpath(Res.getLogInIncorrectXpath(), driver));
		
	}
	
	public static void signInClick (WebDriver driver) {
		Util.click(FindBy.xpath(Res.getLogInSignUpXpath(), driver));
	}
	

}
