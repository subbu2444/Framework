package First.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class driverSingleton {
private static driverSingleton instance =null;
private static WebDriver driver;
 
private driverSingleton(String driver) {
instantiate (driver);	
}



public WebDriver instantiate(String strategy) {
	driverStrategy driverstrat = driverStrategyImplementor.chooseStrategy(strategy);
	driver = driverstrat.setStrategy();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	return driver;
}

public static driverSingleton getInstance(String driver) {
	if(instance == null)
	{
		instance = new driverSingleton(driver);
	}
	return instance;
}
public static void closedObjectInstance() {
	instance = null;
	driver.quit();
}

public static  WebDriver getDriver() {
	return driver;
	
}

}
