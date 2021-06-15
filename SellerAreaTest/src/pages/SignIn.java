package pages;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import utility.ExcelOutputFile;
import utility.FindBy;
import utility.Res;
import utility.Util;

public class SignIn {
	
	public static String website = "www.google.com";
	
	public static void fillSignInForm(String username, String email, String password, String passwordR, int i, WebDriver driver) {
		Util.input(username, FindBy.xpath(Res.getSignUpUsernameXpath(), driver));
		Util.input(email, FindBy.xpath(Res.getSignUpEmailXpath(), driver));
		Util.input(password, FindBy.xpath(Res.getSignUpPasswordXpath(), driver));
		Util.input(passwordR, FindBy.xpath(Res.getSignUpConfirmPasswordXpath(), driver));
		Util.click(FindBy.xpath(Res.getSignUpTellUsMenuXpath(), driver));
		tellUsAboutU(i, driver);
		Util.click(FindBy.xpath(Res.getSignUpSubmitBtnXpath(), driver));
	}
	
	public static void tellUsAboutU(int i, WebDriver driver) {
		switch(i) {
		case 1:
			Util.click(FindBy.xpath(Res.getSignUpTellUs1Xpath(), driver));
			Util.input(website, FindBy.xpath(Res.getSignUpWebsiteXpath(), driver));
			break;
		case 2:
			Util.click(FindBy.xpath(Res.getSignUpTellUs2Xpath(), driver));
			break;
		case 3:
			Util.click(FindBy.xpath(Res.getSignUpTellUs3Xpath(), driver));
			break;
		case 4:
			Util.click(FindBy.xpath(Res.getSignUpTellUs4Xpath(), driver));
			break;
		}
	}
	
	public static SoftAssert fillSignInFormMultiple (int brojKorisnika, WebDriver driver, SoftAssert sa) {
		for (int i = 1; i<brojKorisnika+1; i++) {
			LogIn.signInClick(driver);
			fillSignInForm(ExcelOutputFile.getUserName(i), ExcelOutputFile.getEmail(i), ExcelOutputFile.getPassword(i), ExcelOutputFile.getPassword(i), ExcelOutputFile.getAbout(i), driver);
			//Util.hold(3000);
			sa.assertEquals(Util.getUrl(driver), Res.getHomeUrl());
			Util.click(FindBy.xpath(Res.getHomeAccountBtnXpath(), driver));
			Util.click(FindBy.xpath(Res.getHomeLogoutBtnXpath(), driver));
		}
		
		return sa;
		
	}
	
	

}
