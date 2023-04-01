package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		
		if(sortable.size() > 0)
		{
			System.out.println("Sortable found");
		}
		else
		{
			System.out.println("Sortable not found");
		}
		
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		if(draggable.size() > 0 )
		{
			System.out.println("draggable found");
		}
		else
		{
			System.out.println("draggable not found");
		}
		
		//driver.switchTo().frame(0); //find the index and switch to that frame
		//driver.switchTo().frame(""); //Name or ID, We don't have any of this option so we can not use in this case
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println();
		System.out.println("***************************************************After Switching to  the iFrame***************************************************");
		System.out.println();
		sortable = driver.findElements(By.linkText("Sortable"));
		
		/*driver.switchTo().frame(driver.findElement(By.id("b")));
		driver.switchTo().frame(driver.findElement(By.id("d")));
		driver.switchTo().parentFrame();	
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("b")));*/
		
		if(sortable.size() > 0)
		{
			System.out.println("Sortable found");
		}
		else
		{
			System.out.println("Sortable not found");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		if(draggable.size() > 0 )
		{
			System.out.println("draggable found");
		}
		else
		{
			System.out.println("draggable not found");
		}
		
		System.out.println();
		System.out.println("***************************************************After Switching to  the Main Website***************************************************");
		System.out.println();
		
		driver.switchTo().defaultContent();
		
		sortable = driver.findElements(By.linkText("Sortable"));
		if(sortable.size() > 0)
		{
			System.out.println("Sortable found");
		}
		else
		{
			System.out.println("Sortable not found");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		if(draggable.size() > 0 )
		{
			System.out.println("draggable found");
		}
		else
		{
			System.out.println("draggable not found");
		}
		
		/*String actualString = (driver.findElement(By.linkText("Sortable"))).getText();
		String expectedString = "Sortable";
		
		System.out.println(actualString);
		
		if(expectedString.equals(actualString))
		{
			System.out.println("Sortable found");
		}
		else
		{
			System.out.println("Sortable not found");
		}
		
		String actual_String = (driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"))).getText();
		String expected_String = "Drag me to my target";
		
		System.out.println(actual_String);
		
		if(expected_String.equals(actual_String))
		{
			System.out.println("Drag me to my target visible");
		}
		else
		{
			System.out.println("Drag me to my target not visible");
		}
		
		WebElement s = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		
		if(s.isDisplayed())
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not");
		}*/
	}

}
