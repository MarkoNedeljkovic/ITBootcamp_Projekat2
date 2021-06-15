package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogIn;
import pages.SignIn;
import utility.Res;
import utility.Util;

public class LogInAndRegisterTest extends TestUtility {
	
	
	@Test (priority = 1)
	public void logInNonRegisteredUsertest () {
		String username= "marko.test@gmail.com";
		String password = "urfia@35#VpWbWT";
		String incorect = "Incorrect username or password.";
		
		LogIn.logIn(username, password, driver);
		Assert.assertEquals(LogIn.incorectLogInCheck(driver), incorect);
		
	}

		//Zakomentarisane testove nije moguce izvrsiti zbog promena na sajtu
	
	
//	@Test (priority = 2)  // Testiranje kreiranja jednog korisnickog naloga
	public void signUpOneUserTest () {
		String username= "Marko1234";
		String email= "marko.test.test3@gmail.com";
		String password = "urfia@35#VpWbWT";
		int i = 3;
		
		LogIn.signInClick(driver);
		SignIn.fillSignInForm(username, email, password,password,i, driver);
		Util.hold(1000);
		Assert.assertEquals(Util.getUrl(driver), Res.getHomeUrl());
		
	}

//	@Test (priority = 3) // Testiranje kreiranja 30 korisnickih naloga
	public void signUpMissingField () {
		String username= "Marko1234";
		String email= "marko.test.test2@gmail.com";
		String password = "urfia@35#VpWbWT";
		int i = 30;
		
		LogIn.signInClick(driver);
		SignIn.fillSignInForm("", email, password,password,i, driver);
		sa.assertEquals(Util.getUrl(driver), Res.getSignUpUrl());
		
		Util.refresh(driver);
		SignIn.fillSignInForm(username, "", password,password,i, driver);
		sa.assertEquals(Util.getUrl(driver), Res.getSignUpUrl());
		
		Util.refresh(driver);
		SignIn.fillSignInForm(username, email, "",password,i, driver);
		sa.assertEquals(Util.getUrl(driver), Res.getSignUpUrl());
		
		Util.refresh(driver);
		SignIn.fillSignInForm(username, email, password,"",i, driver);
		sa.assertEquals(Util.getUrl(driver), Res.getSignUpUrl());
		
		Util.refresh(driver);
		SignIn.fillSignInForm(username, email, password,password,0, driver);
		sa.assertEquals(Util.getUrl(driver), Res.getSignUpUrl());
		
		sa.assertAll();
	}
	
//	@Test (priority = 4) // Test logovanja 30 korisnika
	public void signUpMultipleUserTest () {
		int brojKorisnika = 30;
		
		SignIn.fillSignInFormMultiple(brojKorisnika, driver, sa).assertAll();
	}

	
	
}
