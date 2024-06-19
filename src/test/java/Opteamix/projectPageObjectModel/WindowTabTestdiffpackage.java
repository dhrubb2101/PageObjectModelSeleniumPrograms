package Opteamix.projectPageObjectModel;

import org.openqa.selenium.WebDriver;

import qa.pages.WindowtabTestpageom;

public class WindowTabTestdiffpackage extends WindowtabTestpageom {
	
	public WindowTabTestdiffpackage(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws InterruptedException {
		
		WindowtabTestpageom lp = new WindowtabTestpageom(driver);
		
		lp.setup();

		lp.verifyopentab();

	}
}


