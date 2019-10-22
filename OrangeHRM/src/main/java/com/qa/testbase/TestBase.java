package com.qa.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
	
	public static WebDriver driver ;
    public static Properties pro;
    public static EventFiringWebDriver e_driver;

	public TestBase()
	{
		try {
		//	String FilePath = "E:\\New Workspace\\OrangeHRM\\src\\main\\java\\com\\qa\\config\\config.properties";
			String FilePath = "E:\\Git Repo\\DemoRepo\\OrangeHRM\\src\\main\\java\\com\\qa\\config\\config.properties";
			File scr = new File(FilePath);
			FileInputStream fs = new FileInputStream(scr);
			pro = new Properties();
			pro.load(fs);
		 } catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		 } catch (IOException e) {
			System.out.println(e.getMessage());
		 }
	   } 
	
	public static void initialization()
	{
		String browserName = pro.getProperty("browser");
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\New Workspace\\OrangeHRM\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver ();
		}
		else if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
		}
	

}
