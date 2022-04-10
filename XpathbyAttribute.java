package Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathbyAttribute {
	
		
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://www.facebook.com/");
		  
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Tester");
			Thread.sleep(2000);
			driver.findElement(By.xpath("// input [ @id='pass']")).sendKeys("123456");
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[@name='login']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[text()='Messenger']")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//button[@name='login']")).click();
			 


}
}
