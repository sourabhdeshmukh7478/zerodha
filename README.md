# zerodha
package config;

public class Configuration {
	
	
	 public static String driverPath = "C:\\\\Users\\\\balaji\\\\Desktop\\\\Java Automation\\\\1-Jan\\\\Automation\\\\chromedriver_win32 (2)\\\\chromedriver.exe";  

	 
	 public static String appUrl="https://www.facebook.com/";
	 
	 
	 public static String screnshotPath="C:\\\\Users\\\\balaji\\\\Desktop\\\\Java Automation\\\\1-Jan\\\\Automation\\\\screenshot\\\\image_";
}

package screenshot.test;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		Date d = new Date();			
		
		String xyz = d.toString();
		
		String str = xyz.replace(":", "_");
		
		
		String path = "C:\\Users\\balaji\\Desktop\\Java Automation\\1-Jan\\Automation\\screenshot\\image_"+str+".jpg";
		
		System.out.println(path);
		
		String xyz = d.toString();
		
		String str = xyz.replace(":", "_");
		
	}

}


