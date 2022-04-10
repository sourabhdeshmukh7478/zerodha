package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Config.Confirgation;

public class Parametrization1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream path = new FileInputStream(Confirgation.sheet);
		
		Sheet readData = WorkbookFactory.create(path).getSheet("Sheet2");
		
		String fname= readData.getRow(1).getCell(3).getStringCellValue();

	    System.setProperty("webdriver.chrome.driver",Confirgation.driverpath);
	   
	    
	    WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(fname);
	    
	    
	
	}

}
