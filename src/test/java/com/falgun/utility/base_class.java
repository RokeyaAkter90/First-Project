package com.falgun.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	public static Properties prop;
	public static WebDriver driver;
	public base_class() {
		prop = new Properties();
		try {
			FileInputStream fls= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\falgun\\configure\\configure.properties");
			prop.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	
	}
	public void initBrowser () {
		
		
		String browserset = prop.getProperty("Browser1");
		if (browserset.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().timeouts().pageLoadTimeout(testdata.pageLoadTimeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(testdata.implicitlyWait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			System.out.println("Chrome browser launch");
			
		}
		
		else if (browserset.equals("FF"));
		
	}
	public static void getURL(String URL) {
		driver.get(prop.getProperty("URL"));
		
	}
	


}
