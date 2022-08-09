package First.framework;

public class driverStrategyImplementor {
	public static driverStrategy chooseStrategy(String strategy) {
		switch(strategy)
		{
		case "chrome":
			return new chrome();
		case "Firefox":
			return new Firefox();
			
	    default:
	    	return null;
		}
	}

}
