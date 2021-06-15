package pages;

import utility.Res;
import utility.FindBy;
import utility.ProductExcelOutputFile;
import utility.Util;

import org.openqa.selenium.WebDriver;

public class Products {
	
	public static StringBuilder sb;

	public static void goToAddNewProduct(WebDriver driver) {
		Util.click(FindBy.xpath(Res.getProductsAddProductsBtnXpath(), driver));
	}
	
	public static void goToAddNewProduct2(WebDriver driver) {
		Util.click(FindBy.xpath(Res.getProductsAddProductsBtnXpath2(), driver));
	}
	
	public static void goToViewProduct(WebDriver driver) {
		Util.click(FindBy.xpath(Res.getNewProductsViewTabXpath(), driver));
	}

	public static void addNewProduct(int i, WebDriver driver) {
		Util.input(ProductExcelOutputFile.getName(i), FindBy.xpath(Res.getNewProductsNameXpath(), driver));
		Util.input(ProductExcelOutputFile.getID(i), FindBy.xpath(Res.getNewProductsIdXpath(), driver));
		Util.input(ProductExcelOutputFile.getSDesc(i), FindBy.xpath(Res.getNewProductsSDescXpath(), driver));
		Util.input(ProductExcelOutputFile.getLDesc(i), FindBy.xpath(Res.getNewProductsLDescXpath(), driver));
		Util.input(ProductExcelOutputFile.getPrice(i), FindBy.xpath(Res.getNewProductsPriceXpath(), driver));
		if (ProductExcelOutputFile.getTangible(i).equals("No")) {
			Util.click(FindBy.xpath(Res.getNewProductsTangibleRadioNoXpath(), driver));
		} else {

		}

		if (ProductExcelOutputFile.getRecurring(i).equals("No")) {
			Util.click(FindBy.xpath(Res.getNewProductsRecurringRadioNoXpath(), driver));
		} else {

		}
		Util.click(FindBy.xpath(Res.getNewProductsSaveBtnXpath(), driver));
	}
	
	public static void addMultipleNewProducts(int num, WebDriver driver) {
		for (int i = 1;i<num+1 ;i++) {
			addNewProduct(i, driver);
			goToViewProduct(driver);
			if(i==num) {
				
			}
			else {
				goToAddNewProduct2(driver);
			}
			
		}	
	}
	
	public static String productsCount (WebDriver driver) {
		sb = new StringBuilder();
		String text = Util.getText(FindBy.xpath(Res.getProductsProductCountXpath(), driver));
		sb.append(text).reverse().delete(1, (text.length()));
		return sb.toString();
	}
	
	public static void goToEdit(WebDriver driver) {
		Util.click(FindBy.xpath(Res.getProductsProductEditTabXpath(), driver));
	}

}
