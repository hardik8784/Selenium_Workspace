package data;

import utilities.Xls_Reader;

public class DataFile {
	Xls_Reader d = new Xls_Reader("B:\\Hardik-Selenium\\QA\\Testing\\NikulTest.xlsx");
	
	//LoginTest
	public String emailWithSpecialCharacter = d.getCellData("Data1", "UserName", 9);
	public String wrongEmail = d.getCellData("Data1", "UserName", 8);
	public String wrongPassword = d.getCellData("Data1", "Password", 9);
	public String specialCharacterError = d.getCellData("Data1", "Email Error", 5);
	public String emptyEmailError = d.getCellData("Data1", "Email Error", 4);
	public String emptyPasswordError = d.getCellData("Data1", "Password Error",3);
	public String globalError = d.getCellData("Data1", "Global Error",2);
	
}
