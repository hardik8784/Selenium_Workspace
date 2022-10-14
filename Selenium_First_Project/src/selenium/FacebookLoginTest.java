package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.facebook.com/");
		
		
		//1.className - not working, it will not work if the space is in between 
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("gafasdasdadadadada");
		
		//2.cssSelector - learn syntax
		//driver.findElement(By.cssSelector(null)).sendKeys("fadasdadaad");
		
		//3.id - working, 
		//driver.findElement(By.id("email")).sendKeys("fasfdasdasdasdasdas");
		
		//4.linkText - only works for links
		//driver.findElement(By.linkText(null)).sendKeys("fgaasdas");
		
		//5.name - working
		driver.findElement(By.name("email")).sendKeys("fasasdasdassdadasdfbgfa");
		
		//6.partialLinkText - only works for the links
		//driver.findElement(By.partialLinkText(null)).sendKeys("fadas");
		
		//7.tagName - not working, not unique
		//driver.findElement(By.tagName("input")).sendKeys("fasdaggdfefgerfawds");
		
		//8.xpath - learn syntax
		//driver.findElement(By.xpath(null)).sendKeys("fadasda");
		//driver.findElement(By.xpath("//input [@data-testid=\'royal_email\']")).sendKeys("fgagsasdasda");
		
		//Password
		//driver.findElement(By.id("pass")).sendKeys("fasdadaefegbfsvdssda");
		driver.findElement(By.name("pass")).sendKeys("fadaedcvasdasdasda");
		
		
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		
	}

}
