package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("B:\\Hardik-Selenium\\QA\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String s = prop.getProperty("browser");
		System.out.println(s);
		
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("defect"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("testing","Automation");
		System.out.println(prop.getProperty("testing"));
		
		prop.setProperty("tool", "Selenium");
		System.out.println(prop.getProperty("tool"));
		
		FileOutputStream fo = new FileOutputStream("B:\\\\Hardik-Selenium\\\\QA\\\\Testing\\\\prop.properties");
		prop.store(fo, "Adding to Properties file");
		
	}

}
