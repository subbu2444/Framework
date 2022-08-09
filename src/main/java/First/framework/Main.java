package First.framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Main {

public static void main(String[] args) throws IOException {
	FrameworkProperties df = new FrameworkProperties();
	driverSingleton drivers = driverSingleton.getInstance(df.getProperty("browser"));
	WebDriver driver = driverSingleton.getDriver();
	driver.get("http://moneygrowth-crm.creatoro.in/Login");
}

}

