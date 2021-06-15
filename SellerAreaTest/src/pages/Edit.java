package pages;

import org.openqa.selenium.WebDriver;

import utility.FindBy;
import utility.Res;
import utility.Util;

public class Edit {
	
	public static StringBuilder sb;
	
	
	
	public static String priceXpaht (int i) {
		sb = new StringBuilder();
		sb.append("//tr[").append(i).append("]//td[6]//input[1]");
		return sb.toString();
	}
	
	public static boolean priceChange (int num, int priceRise, WebDriver driver) {
		boolean isPriceChanged = true;
		String oldPrice = "";
		int sum = 0;
		String newPrice = "";
		String xpath = "";
		String attribute = "value";
		
		for (int i = 2 ;i<num+2;i++) {
			xpath = priceXpaht(i);
			oldPrice = Util.getAttribute(FindBy.xpath(xpath, driver), attribute);
			sum = Util.stringToInt(oldPrice)+priceRise;
			newPrice = sum + "";
			Util.input(newPrice, FindBy.xpath(xpath, driver));
			if(!Util.getAttribute(FindBy.xpath(xpath, driver), attribute).equals(newPrice)) {
				isPriceChanged=false;
			}
			
		}
		
		Util.click(FindBy.xpath(Res.getEditSaveBtnXpath(), driver));
		
		return isPriceChanged;
		
		
	}

}
