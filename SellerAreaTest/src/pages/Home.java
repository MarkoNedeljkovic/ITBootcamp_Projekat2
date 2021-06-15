package pages;

import utility.Util;
import utility.Res;

import org.openqa.selenium.WebDriver;

import utility.FindBy;


public class Home {
	
	public static void goToProductsTab(WebDriver driver) {
		Util.click(FindBy.xpath(Res.getHomeProductsTabXpath(),driver));
	}

}
