package qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowtabTestpageom {

	public static WebDriver driver;

	// locator

	private By openTab = By.xpath("//a[@id='opentab']");
	private By text = By.xpath("//div[@class='cont']//span[contains(text(),'info@qaclickacademy.com')]");
	// constructor

	public WindowtabTestpageom(WebDriver driver) {
		WindowtabTestpageom.driver = driver;
	}

	// methods

	public void setup() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}

	// opentab

	public void verifyopentab() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(openTab).click();

		// get the parent window handle

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		// get all window handles the parent and child handle

		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		// Iterate among the windows

		Iterator<String> iterator = windowhandles.iterator();

		while (iterator.hasNext()) {

			String childwindow = iterator.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				Thread.sleep(3000);
				driver.switchTo().window(childwindow);
				Thread.sleep(3000);
				String text1 = driver.findElement(text).getText();
				System.out.println(text1);
				driver.close();
			}
		}
	}

}
