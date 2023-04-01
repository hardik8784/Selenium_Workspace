package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;	//it is null at this point
	
	/*WebElement email = driver.findElement(By.id("usernameInput-input"));
	WebElement pass = driver.findElement(By.id("password-input"));
	WebElement signIn = driver.findElement(By.id("signIn"));
	WebElement emailError = driver.findElement(By.id("UsernameTextField__errors-usernameInput"));
	WebElement passwordError = driver.findElement(By.id("PasswordTextField__errors-password"));
	WebElement globalError = driver.findElement(By.id("globalError"));*/
	
	@FindBy(id = "usernameInput-input")
	public WebElement email;
	
	@FindBy(id = "password-input")
	public WebElement pass;
	
	@FindBy(id = "signIn")
	public WebElement signIn;
	
	@FindBy(id = "UsernameTextField__errors-usernameInput")
	public WebElement emailError;
	
	@FindBy(id = "PasswordTextField__errors-password")
	public WebElement passwordError;
	
	@FindBy(id = "globalError")
	public WebElement globalError;
	
	public void openBrowser() throws IOException
	{
		/*System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox*/
		//String browser = "Chrome"; //Chrome, Safari //If we read the browser 
		FileInputStream f = new FileInputStream("B:\\Hardik-Selenium\\QA\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.safari.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\safaridriver.exe");
			 driver = new SafariDriver();
		}
		PageFactory.initElements(driver,this);
	}
	
	public void openLoginPage()
	{
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=zXfFefeTZMg&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJ6WGZGZWZlVFpNZyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjY1MzYyODM5LCJpYXQiOjE2NjUzNjE2MzksImp0aSI6Ijk3ZDVhMTQxLTlkOTktNGQ3OS1hNGY4LTFmYTY2YzAyMzA2NyIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.VmxpRyKdCLB1knCsg4Ei5dTSo7Keo0NeOnQSHu3Qtux-Hu-Tj8_Dus0oWb6NWe7W7a1wSCBozsasXaqEmy0s44vZMt1svrpJzhT5WI37RtpgsqJL6NrrvBSsNPK3P7mai3VaGCiOT6rOj3DoJOFr45bN1JJVP6fSl-DF6Wk1yFXWZppxsTbSQkwAZHuXxnz5ZaWbH3NmNea7y0DH5GaIzf1vf0KWFy18YMZfJj9iVoYNF3slSmvTngGF3hfYa0ccrRF_D3pz7MIeGfi5foZaFX5NUdljnL4I3DXW178MDL-lttVQjrFrjgGo9ELjKNN8urmC_FUH733cKjN9_5E1aA&preferred_environment=");
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void login(String id, String password) throws InterruptedException
	{
		email.sendKeys(id);
		pass.sendKeys(password);
		signIn.click();
		
		Thread.sleep(3000);
	}
	
	public String readEmailError()
	{
		String actualString = emailError.getText();
		
		System.out.println("Actual String :" + actualString);
		return actualString;
	}
	
	public String readPasswordError()
	{
		String actualString = passwordError.getText();
		
		System.out.println("Actual String :" + actualString);
		return actualString;
	}
	
	public String readGlobalError()
	{
	String actualString = globalError.getText();
		
	System.out.println("Actual String :" + actualString);
	return actualString;
	}
}
