package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		//List<WebElement> options = driver.findElements(By.xpath("//input[@name='group1']"));
		List<WebElement> options = driver.findElements(By.name("group1"));
		System.out.println(options.size());
		
		for(int i =0; i < options.size();i++)
		{
			System.out.println(options.get(i).getAttribute("value") + "---------------" + options.get(i).isSelected());
		}
		
		System.out.println("------------------------------");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		for(int i =0; i < options.size();i++)
		{
			System.out.println(options.get(i).getAttribute("value") + "---------------" + options.get(i).isSelected());
		}
		
	}

}
