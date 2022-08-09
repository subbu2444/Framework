package First.framework;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FrameworkProperties {
private String result = "";
private InputStream Is;

public String getProperty(String key) throws IOException{
////	File file = new File("/home/krypton/Desktop/SELENIUM/SELENIUM_FILES/framework/target/dynamic.properties");
//		
////	FileInputStream fileInput = null;
////	try {
////		fileInput = new FileInputStream(file);
////	} catch (FileNotFoundException e) {
////		e.printStackTrace();
////	}
////	Properties prop = new Properties();
////	try {
////		prop.load(fileInput);
////	} catch (IOException e) {
////		e.printStackTrace();
////	}
//	
//	//String Pfile = "/home/krypton/Desktop/SELENIUM/SELENIUM_FILES/framework/target/dynamic.properties";
//	
	Properties prop = new Properties();
		
	//String Pfile = "/home/krypton/Desktop/SELENIUM/SELENIUM_FILES/framework/target/dynamic.properties";
		
		 FileReader fr=new FileReader("/home/krypton/Desktop/SELENIUM/SELENIUM_FILES/framework/target/dynamic.properties");
		 BufferedReader br=new BufferedReader(fr);
		 StringBuffer sb=new StringBuffer();
		 String Pfile;
		 while((Pfile=br.readLine())!=null)
		 {
			 sb.append(Pfile);      //appends line to string buffer  
			 sb.append("\n");  
		 }
		 fr.close();
		 
		System.out.println(sb.toString());
		Pfile = sb.toString();
	    System.out.println(Pfile);
       // Is=getClass().getClassLoader().getResourceAsStream(Pfile);
		Is=new ByteArrayInputStream(Pfile.getBytes());
		System.out.println("IS is:"+ Is);
		if(Is!=null)
		{
			prop.load(Is);
		}
		else
		{
			throw new FileNotFoundException("The dynamic file has not been found");
		}
		String PropertyValue = prop.getProperty(key);
		this.result =PropertyValue;

		
	
	return result;
}}
  
//}












//-----------------------------------MAIN METHOD-------------------------//


//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
//public class FrameworkProperties {
//    private String result = "";
//    private InputStream inputStream;
//
//    public String getProperty(String key) {
//        try {
//            Properties properties = new Properties();
//            String propFileName = "/home/krypton/Desktop/SELENIUM/SELENIUM_FILES/framework/target/dynamic.properties";
//        System.out.println(propFileName);
//            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
//
//            if ( inputStream != null )
//                properties.load(inputStream);
//            else
//                throw new FileNotFoundException("The Property file has not been found");
//
//            String propertyValue = properties.getProperty(key);
//            this.result = propertyValue;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//}


















