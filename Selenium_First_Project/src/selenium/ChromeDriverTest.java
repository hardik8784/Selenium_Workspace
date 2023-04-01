package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\chromedriver.exe");
		
		//ClassName objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("fasasdasdassdadasdfbgfa");
		
		//Password
		//driver.findElement(By.id("pass")).sendKeys("fasdadaefegbfsvdssda");
		driver.findElement(By.name("pass")).sendKeys("fadaedcvasdasdasda");
		
		
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
	}

}
