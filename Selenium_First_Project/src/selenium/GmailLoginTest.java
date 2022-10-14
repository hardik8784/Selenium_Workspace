package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
				
				//ClassName objName = new ClassName();
				FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
				
				driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-636924869%3A1665587486359833&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqOC-t-oFO5OwDB686oK2T4AHAoMp2UqjcL6TgdiRgV5hXssKpMqnWKjyQPDypCWEoHhG_xlA");
				
				
				//Enter wrong email
				driver.findElement(By.id("identifierId")).sendKeys("dasfadgvdsveadSdasdasdadas");
				//click on next button
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				
				Thread.sleep(3000);
				
				String expectedString = "Couldn’t find your Google Account";
				//Read actual String
				//String actualString = driver.findElement(By.xpath("//div[text()='Couldn’t find your Google Account']")).getText();
				String actualString = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
				//Print actualString
				System.out.println("actual Error : " + actualString);
				
				if(expectedString.equals(actualString))
				{
					System.out.println("Test pass");
				}
				else
				{
					System.out.println("Test fail");
				}
				
				//verify
	}

}
