package First.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chrome implements driverStrategy{
         public WebDriver setStrategy() {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
		//	options.setExperimentalOption("automationExtension", false);
			//options.addArguments("--no-sandbox");
			return new ChromeDriver();
		}
}
