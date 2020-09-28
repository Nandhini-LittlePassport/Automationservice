package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	public static String captureScreenshot(WebDriver driver,String imagename) throws IOException {
TakesScreenshot ts = (TakesScreenshot) driver;
		
		//get screenshot as to capture the screenshot as file
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(propertyReader.readData("screenshotfolder")+"\\"+imagename+".png");
		FileUtils.copyFile(src, destination);
		return propertyReader.readData("screenshotfolder")+imagename+".png";
		
	}
}
