package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=zXfFefeTZMg&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJ6WGZGZWZlVFpNZyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjY1MzYyODM5LCJpYXQiOjE2NjUzNjE2MzksImp0aSI6Ijk3ZDVhMTQxLTlkOTktNGQ3OS1hNGY4LTFmYTY2YzAyMzA2NyIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.VmxpRyKdCLB1knCsg4Ei5dTSo7Keo0NeOnQSHu3Qtux-Hu-Tj8_Dus0oWb6NWe7W7a1wSCBozsasXaqEmy0s44vZMt1svrpJzhT5WI37RtpgsqJL6NrrvBSsNPK3P7mai3VaGCiOT6rOj3DoJOFr45bN1JJVP6fSl-DF6Wk1yFXWZppxsTbSQkwAZHuXxnz5ZaWbH3NmNea7y0DH5GaIzf1vf0KWFy18YMZfJj9iVoYNF3slSmvTngGF3hfYa0ccrRF_D3pz7MIeGfi5foZaFX5NUdljnL4I3DXW178MDL-lttVQjrFrjgGo9ELjKNN8urmC_FUH733cKjN9_5E1aA&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("gasfasdadefrgttbfsaad$");
		driver.findElement(By.id("password-input")).sendKeys("dasdeafvfeaghngbgads");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);
		
		String expectedString = "Please enter a username or card number without special characters.";
		String actualString = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		
		System.out.println("Actual String :" + actualString);
		
		if(expectedString.equals(actualString))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}

}
