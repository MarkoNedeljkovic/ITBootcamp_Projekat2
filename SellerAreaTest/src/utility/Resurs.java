package utility;

public class Resurs {
	// Log in page links and paths to elements
	private static final String LOG_IN_URL = "https://sandbox.2checkout.com/sandbox";
	private static final String LOG_IN_USERNAME_XPATH = "//input[@placeholder='Username']";
	private static final String LOG_IN_PASSWORD_XPATH = "//input[@id='password']";
	private static final String LOG_IN_BTN_XPATH = "//input[@class='btn blue']";
	private static final String LOG_IN_SIGN_UP_XPATH = "//a[contains(text(),'Sign up')]";
	private static final String LOG_IN_INCORRECT_XPATH = "//p[contains(text(),'Incorrect username or password.')]";
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static final String SIGN_UP_URL = "https://sandbox.2checkout.com/sandbox/signup";
	private static final String SIGN_UP_USERNAME_XPATH = "//input[@id='username']";
	private static final String SIGN_UP_EMAIL_XPATH = "//input[@id='email']";
	private static final String SIGN_UP_PASSWORD_XPATH = "//input[@id='password']";
	private static final String SIGN_UP_CONFIRM_PASSWORD_XPATH = "//input[@id='confirm']";
	private static final String SIGN_UP_TELL_US_MENU_XPATH = "//select[@id='aboutyou']";
	private static final String SIGN_UP_TELL_US_1_XPATH = "//option[contains(text(),'I have a website')]";
	private static final String SIGN_UP_TELL_US_2_XPATH = "//option[contains(text(),\"I don't have a website\")]";
	private static final String SIGN_UP_TELL_US_3_XPATH = "//option[contains(text(),'I already have a 2Checkout account')]";
	private static final String SIGN_UP_TELL_US_4_XPATH = "//option[contains(text(),'I just want to play in the sandbox')]";
	private static final String SIGN_UP_WEBSITE_XPATH = "//input[@id='website']";
	private static final String SIGN_UP_SUBMIT_BTN_XPATH = "//input[@id='submit-button']";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static final String HOME_URL = "https://sandbox.2checkout.com/sandbox/home/dashboard";
	private static final String HOME_ACCOUNT_BTN_XPATH = "//div[@id='account-avatar']";
	private static final String HOME_LOGOUT_BTN_XPATH = "//a[@id='logout']";
	private static final String HOME_PRODUCTS_TAB_XPATH = "//li[@id='tab-products']//a";
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static final String PRODUCTS_ADD_PRODUCTS_BTN_XPATH = "//div[@id='content']//div//div//div//a";
	private static final String PRODUCTS_ADD_PRODUCTS_BTN_XPATH2 = "//body/div[@id='wrapper']/div[@id='content']/div/div/div/a[1]";
	private static final String PRODUCTS_PRODUCT_COUNT_XPATH = "//div[4]//div[1]//span[3]";
	private static final String PRODUCTS_PRODUCT_EDIT_TAB_XPATH = "//a[contains(text(),'Edit')]";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static final String NEW_PRODUCTS_NAME_XPATH = "//input[@name='name']";
	private static final String NEW_PRODUCTS_ID_XPATH = "//input[@name='vendor_product_id']";
	private static final String NEW_PRODUCTS_S_DESC_XPATH = "//input[@name='description']";
	private static final String NEW_PRODUCTS_L_DESC_XPATH = "//textarea[@name='long_description']";
	private static final String NEW_PRODUCTS_PRICE_XPATH = "//input[@name='price']";
	private static final String NEW_PRODUCTS_TANGIBLE_RADIO_NO_XPATH = "//input[@id='intangible']";
	private static final String NEW_PRODUCTS_RECURRING_RADIO_NO_XPATH = "//div[7]//label[3]//input[1]";
	private static final String NEW_PRODUCTS_SAVE_BTN_XPATH = "//input[@name='submit']";
	private static final String NEW_PRODUCTS_VIEW_TAB_XPATH = "//div[@id='sub-nav']//li[1]//a[1]";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static final String EDIT_SAVE_BTN_XPATH = "//input[@class='context-btn save']";
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static String getLogInUrl() {
		return LOG_IN_URL;
	}

	public static String getLogInUsernameXpath() {
		return LOG_IN_USERNAME_XPATH;
	}

	public static String getLogInPasswordXpath() {
		return LOG_IN_PASSWORD_XPATH;
	}

	public static String getLogInBtnXpath() {
		return LOG_IN_BTN_XPATH;
	}

	public static String getLogInSignUpXpath() {
		return LOG_IN_SIGN_UP_XPATH;
	}

	public static String getLogInIncorrectXpath() {
		return LOG_IN_INCORRECT_XPATH;
	}

////////////////////////////////////////////////////////////////////
	public static String getSignUpUrl() {
		return SIGN_UP_URL;
	}

	public static String getSignUpUsernameXpath() {
		return SIGN_UP_USERNAME_XPATH;
	}

	public static String getSignUpEmailXpath() {
		return SIGN_UP_EMAIL_XPATH;
	}

	public static String getSignUpPasswordXpath() {
		return SIGN_UP_PASSWORD_XPATH;
	}

	public static String getSignUpConfirmPasswordXpath() {
		return SIGN_UP_CONFIRM_PASSWORD_XPATH;
	}

	public static String getSignUpTellUsMenuXpath() {
		return SIGN_UP_TELL_US_MENU_XPATH;
	}

	public static String getSignUpSubmitBtnXpath() {
		return SIGN_UP_SUBMIT_BTN_XPATH;
	}
	
	public static String getSignUpTellUs1Xpath() {
		return SIGN_UP_TELL_US_1_XPATH;
	}

	public static String getSignUpTellUs2Xpath() {
		return SIGN_UP_TELL_US_2_XPATH;
	}

	public static String getSignUpTellUs3Xpath() {
		return SIGN_UP_TELL_US_3_XPATH;
	}

	public static String getSignUpTellUs4Xpath() {
		return SIGN_UP_TELL_US_4_XPATH;
	}

	public static String getSignUpWebsiteXpath() {
		return SIGN_UP_WEBSITE_XPATH;
	}

////////////////////////////////////////////////////////////////////

	public static String getHomeUrl() {
		return HOME_URL;
	}

	public static String getHomeAccountBtnXpath() {
		return HOME_ACCOUNT_BTN_XPATH;
	}

	public static String getHomeLogoutBtnXpath() {
		return HOME_LOGOUT_BTN_XPATH;
	}

	public static String getHomeProductsTabXpath() {
		return HOME_PRODUCTS_TAB_XPATH;
	}
////////////////////////////////////////////////////////////////////
	public static String getProductsAddProductsBtnXpath() {
		return PRODUCTS_ADD_PRODUCTS_BTN_XPATH;
	}
	
	public static String getProductsAddProductsBtnXpath2() {
		return PRODUCTS_ADD_PRODUCTS_BTN_XPATH2;
	}
	
	public static String getProductsProductCountXpath() {
		return PRODUCTS_PRODUCT_COUNT_XPATH;
	}
	
	public static String getProductsProductEditTabXpath() {
		return PRODUCTS_PRODUCT_EDIT_TAB_XPATH;
	}
////////////////////////////////////////////////////////////////////
	public static String getNewProductsNameXpath() {
		return NEW_PRODUCTS_NAME_XPATH;
	}

	public static String getNewProductsIdXpath() {
		return NEW_PRODUCTS_ID_XPATH;
	}

	public static String getNewProductsSDescXpath() {
		return NEW_PRODUCTS_S_DESC_XPATH;
	}

	public static String getNewProductsLDescXpath() {
		return NEW_PRODUCTS_L_DESC_XPATH;
	}

	public static String getNewProductsPriceXpath() {
		return NEW_PRODUCTS_PRICE_XPATH;
	}

	public static String getNewProductsTangibleRadioNoXpath() {
		return NEW_PRODUCTS_TANGIBLE_RADIO_NO_XPATH;
	}

	public static String getNewProductsRecurringRadioNoXpath() {
		return NEW_PRODUCTS_RECURRING_RADIO_NO_XPATH;
	}

	public static String getNewProductsSaveBtnXpath() {
		return NEW_PRODUCTS_SAVE_BTN_XPATH;
	}

	public static String getNewProductsViewTabXpath() {
		return NEW_PRODUCTS_VIEW_TAB_XPATH;
	}

	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static String getEditSaveBtnXpath() {
		return EDIT_SAVE_BTN_XPATH;
	}

	
	

	
	
	
	
	

}
