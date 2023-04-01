package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;
import utilities.Xls_Reader;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
 
	//ClassName objName = new ClassName();
			//WebDriver driver;
			LoginPage loginpage = new LoginPage();
			DataFile datafile = new DataFile();
			
			
			/*Xls_Reader d = new Xls_Reader("B:\\Hardik-Selenium\\QA\\Testing\\NikulTest.xlsx");
			String emailWithSpecialCharacter = d.getCellData("Data1", "UserName", 9);
			String wrongEmail = d.getCellData("Data1", "UserName", 8);
			String wrongPassword = d.getCellData("Data1", "Password", 9);
			String specialCharacterError = d.getCellData("Data1", "Email Error", 5);
			String emptyEmailError = d.getCellData("Data1", "Email Error", 4);
			String emptyPasswordError = d.getCellData("Data1", "Password Error",3);
			String globalError = d.getCellData("Data1", "Global Error",2);*/
			
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  //Open Firefox
	  //Open Scotiabank Login Test
	  	//System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		 //driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		loginpage.openBrowser();
		//driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=zXfFefeTZMg&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJ6WGZGZWZlVFpNZyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjY1MzYyODM5LCJpYXQiOjE2NjUzNjE2MzksImp0aSI6Ijk3ZDVhMTQxLTlkOTktNGQ3OS1hNGY4LTFmYTY2YzAyMzA2NyIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.VmxpRyKdCLB1knCsg4Ei5dTSo7Keo0NeOnQSHu3Qtux-Hu-Tj8_Dus0oWb6NWe7W7a1wSCBozsasXaqEmy0s44vZMt1svrpJzhT5WI37RtpgsqJL6NrrvBSsNPK3P7mai3VaGCiOT6rOj3DoJOFr45bN1JJVP6fSl-DF6Wk1yFXWZppxsTbSQkwAZHuXxnz5ZaWbH3NmNea7y0DH5GaIzf1vf0KWFy18YMZfJj9iVoYNF3slSmvTngGF3hfYa0ccrRF_D3pz7MIeGfi5foZaFX5NUdljnL4I3DXW178MDL-lttVQjrFrjgGo9ELjKNN8urmC_FUH733cKjN9_5E1aA&preferred_environment=");
		loginpage.openLoginPage();
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
	  loginpage.closeBrowser();
  }

  @Test (priority = 1)
  public void loginWithSpecialCharEmailTest() throws InterruptedException {
	  	/*driver.findElement(By.id("usernameInput-input")).sendKeys("gasfasdadefrgttbfsaad$");
		driver.findElement(By.id("password-input")).sendKeys("dasdeafvfeaghngbgads");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);*/
	  loginpage.login(datafile.emailWithSpecialCharacter,datafile.wrongPassword);
		
		//String expectedString = datafile.specialCharacterError; //"Please enter a username or card number without special characters.";
		/*String actualString = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		
		System.out.println("Actual String :" + actualString);*/
		
		//String actualString = loginpage.readEmailError();
		Assert.assertEquals(loginpage.readEmailError(), datafile.specialCharacterError);
		/*if(expectedString.equals(actualString))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}*/
  }
  
  @Test (priority = 2)
  public void loginWithEmptyEmailTest() throws InterruptedException {
	  	/*driver.findElement(By.id("password-input")).sendKeys("dasdeafvfeaghngbgads");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);*/
	  loginpage.login("",datafile.wrongPassword);
		
		//String expectedString = datafile.emptyEmailError; //"Please enter your username or card number.";
		/*String actualString = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		
		System.out.println("Actual String :" + actualString);*/
		//String actualString = loginpage.readEmailError();
		
		
		Assert.assertEquals(loginpage.readEmailError(), datafile.emptyEmailError);
  }
  
  @Test (priority = 3)
  public void loginWithEmptyPasswordTest() throws InterruptedException {
		/*driver.findElement(By.id("usernameInput-input")).sendKeys("gasfasdadefrgttbfsaad$");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);*/
	  loginpage.login(datafile.emailWithSpecialCharacter,"");
		
		//String expectedString = datafile.emptyPasswordError; //"Please enter your password.";
		/*String actualString = driver.findElement(By.id("PasswordTextField__errors-password")).getText();
		
		System.out.println("Actual String :" + actualString);*/
		
		//String actualString  = loginpage.readPasswordError();
		Assert.assertEquals(loginpage.readPasswordError(), datafile.emptyPasswordError);
  }
  
  @Test (priority = 4)
  public void loginWithWrongEmailAndPasswordTest() throws InterruptedException {
	  	/*driver.findElement(By.id("usernameInput-input")).sendKeys("gasfasdadefrgttbfsa");
		driver.findElement(By.id("password-input")).sendKeys("dasdeafvfeaghngbgads");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);*/
	  loginpage.login(datafile.wrongEmail,datafile.wrongPassword);
		
		//String expectedString = datafile.globalError; //"Please enter your username or card number.";
		/*String actualString = driver.findElement(By.id("globalError")).getText();
		
		System.out.println("Actual String :" + actualString);*/
		//String actualString = loginpage.readGlobalError();
		
		
		Assert.assertEquals(loginpage.readGlobalError(), datafile.globalError);
  }
  
  
}
