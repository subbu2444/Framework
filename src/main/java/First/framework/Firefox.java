package First.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements driverStrategy {
	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
