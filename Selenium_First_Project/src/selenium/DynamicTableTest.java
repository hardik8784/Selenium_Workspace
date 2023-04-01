package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Number of Rows
		List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(numberOfRows.size());
		//Number of cols
		List<WebElement> numberOfCols = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(numberOfCols.size());
		
		
		for(int i = 2; i <= numberOfRows.size();i++)
		{
			for(int j = 1 ; j <= numberOfCols.size();j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]/td[" + j + "]")).getText());
				System.out.print(" ------ ");
				//System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr[i]/td[j]")).getText());
			}
			System.out.println();
		}
	}

}
