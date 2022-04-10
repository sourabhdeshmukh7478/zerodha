package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestData {
	
	 @FindBy(xpath="//input[@name='username']")private WebElement fullName;
	 
	 @FindBy(xpath="//input[@name='email']")private WebElement email;
	 
	 @FindBy(xpath="//input[@name='password']")private WebElement Pass;
	 
	 @FindBy(xpath="//input[@id='form3Example4cd']")private WebElement Repass;
	 
	 @FindBy(xpath="(//input[@class='form-check-input'])[1]")private WebElement checkbox;
	 
	 @FindBy(xpath="(//button[@type='submit'])[1]")private WebElement loginbutton;
	 
	 public TestData(WebDriver driver){
			
			PageFactory.initElements(driver, this);

}
	 
	 public void enterUserName(String name) {
			fullName.sendKeys(name);
			
		}
	 
	 public void enterEmailID(String mail) {
			email.sendKeys(mail);
	 }
	 
	 public void enterPassword(String pass1) {
			Pass.sendKeys(pass1);
	 }
	 public void enterCheckbox(String checkbox1) {
		 checkbox.sendKeys(checkbox1);
	 }	
	 
	 public void enterNewPassword(String pass) {
			Repass.sendKeys(pass);
	 }	
	 public void ClickOnSignUp() {
		 loginbutton.click();
		}

}