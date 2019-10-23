package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.testbase.TestBase;

public class Util extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 30;
	
	public static void CaptureScreencast(WebDriver driver , String ScreencastName )
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File Source  = ts.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(Source, new File ("./Screencast/"+ScreencastName+".png"));
			
		      } catch (IOException e)
		            {
			          System.out.println(e.getMessage());
                     }
		      }
      } 
