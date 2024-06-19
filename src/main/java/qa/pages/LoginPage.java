package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
	
		public static WebDriver driver;
		
		//locators
		
		private By username = By.xpath("//input[@placeholder='Username']");
		private By password = By.xpath("//input[@placeholder='Password']");
		private By login = By.xpath("//button[normalize-space()='Login']");
		private By forgotpassword = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
		private By Logo = By.xpath("//img[@alt='company-branding']");
		
		//constructor
		
		public LoginPage(WebDriver driver) {
			LoginPage.driver = driver;
		}
		
		//methods
		
		public void setup() {
			
			System.setProperty("webdriver.edge.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\msedgedriver.exe");
			 driver = new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();

			
		}
		
		//logo
		
		public void verifylogo() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(Logo).isDisplayed();
		}
		
		//forgot password 
		
		public void verifyForgotpassword() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(forgotpassword).isDisplayed();
		}
			
		
		public void login() throws InterruptedException {
			
			//login function
					Thread.sleep(3000);
					driver.findElement(username).sendKeys("Admin");
					driver.findElement(password).sendKeys("admin123");
					Thread.sleep(3000);
					driver.findElement(login).click();
					
					
								
		
		}
		
	


	

}
