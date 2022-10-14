package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
				
				//ClassName objName = new ClassName();
				FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
				
				driver.get("https://www.ebay.com/");
				
				//String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
				//System.out.println(s);
				
				String placeHolder_text = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
				System.out.println("Getting the text of the placeHolder : " + placeHolder_text);
				
				driver.findElement(By.id("gh-ac")).sendKeys("iPhone");
				String input_text = driver.findElement(By.id("gh-ac")).getAttribute("value");		//To check the value typed in to the bar always use getAttribute("value")
				System.out.println("Getting the input of the placeHolder : "+ input_text);
	}

}
