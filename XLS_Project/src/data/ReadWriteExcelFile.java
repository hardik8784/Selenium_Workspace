package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader d = new Xls_Reader("B:\\Hardik-Selenium\\QA\\Testing\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail = d.getCellData("Data1", 1, 2);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1", "Browser", 2);
		System.out.println(browser);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 11, "Testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));
		System.out.println(d.getRowCount("Data1"));
		
		d.addColumn("Data1", "Hardik");
		System.out.println(d.getColumnCount("Data1"));
		
		/*String emailWithSpecialCharacter = d.getCellData("Data1", "UserName", 9);
		String wrongEmail = d.getCellData("Data1", "UserName", 8);
		String wrongPassword = d.getCellData("Data1", "Password", 9);
		String specialCharacterError = d.getCellData("Data1", "Email Error", 5);
		String emptyEmailError = d.getCellData("Data1", "Email Error", 4);
		String emptyPasswordError = d.getCellData("Data1", "Password Error",3);
		String globalError = d.getCellData("Data1", "Global Error",2);
		
		
		System.out.println(emailWithSpecialCharacter);
		System.out.println(wrongEmail);
		System.out.println(wrongPassword);
		System.out.println(specialCharacterError);
		System.out.println(emptyEmailError);
		System.out.println(emptyPasswordError);
		System.out.println(globalError);*/
		
	}

}
