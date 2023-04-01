package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		//add Commons.io jar to file project
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE);	//This is for firefox Driver, ChromDriver or any other Driver
		//
		FileUtils.copyFile(screenShotFile, new File("B:\\Hardik-Selenium\\QA\\Testing\\screenShotFile.png"));
	}

}
