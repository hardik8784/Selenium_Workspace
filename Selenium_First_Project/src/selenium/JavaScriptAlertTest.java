package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/javascript4.htm");
		
		//Confirm Box
		driver.findElement(By.name("B2")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();	//Click on selected button
		//alert.dismiss();	//Click on the unselected button
		
		//Prompt Box
		driver.findElement(By.name("B3")).click();
		alert.sendKeys("Hello");
		
		Thread.sleep(3000);
		alert.accept();
	}

}
