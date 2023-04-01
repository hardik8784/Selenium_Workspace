package selenium;

import org.openqa.selenium.chrome.ChromeDriver;



public class NavigateTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\chromedriver.exe");
		
		//ClassName objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
	
		Thread.sleep(3000);
		//driver.navigate().forward();
		//driver.navigate().back();
		driver.navigate().refresh();
	}

}
