package Opteamix.projectPageObjectModel;

import org.openqa.selenium.WebDriver;

import Opteamix.projectPageObjectModel.*;
import qa.pages.LoginPage;

public class LoginTest extends LoginPage {

	public LoginTest(WebDriver driver) {
		super(driver);
		
	}
		
		public static void main(String[] args) throws InterruptedException {
			
			LoginPage lp = new LoginPage(driver);
			
			lp.setup();

			lp.verifyForgotpassword();
			
			lp.verifylogo();
			
			lp.login();
			
			
		}
		
	}


