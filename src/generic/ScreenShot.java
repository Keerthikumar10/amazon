package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ScreenShot implements Auto_const {
	public static WebDriver driver;
	public static void getPhoto()
	{
		Date d=new Date();
		String d1 = d.toString();
		String date = d1.replace(":", "-");
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst =new File(photo_path+date+".png");
	try {
		FileUtils.copyFile(src, dst);
	} catch (IOException e) {
		Reporter.log("failed", true);
	}
	}
}
