package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	static WebElement Emailid_txtfield;
	static WebElement Pwd_txtfield;
	static WebElement Sub_txtfield;
	static WebElement error_msg;
public static WebElement getEmailid_Txtfield(WebDriver driver) {
	if(Emailid_txtfield==null) {
		Emailid_txtfield= driver.findElement(By.id("email"));
				
	}
	return Emailid_txtfield;
}
public static WebElement getPassword_Txtfield(WebDriver driver) {
	if(Pwd_txtfield==null) {
		Pwd_txtfield= driver.findElement(By.id("passwd"));
				
	}
	return Pwd_txtfield;
}
public static WebElement getSubmit_Btn(WebDriver driver) {
	if(Sub_txtfield==null) {
		Sub_txtfield= driver.findElement(By.id("SubmitLogin"));
				
	}
	return Sub_txtfield;
}
public static WebElement getError_Msg(WebDriver driver) {
	if(error_msg==null) {
		error_msg= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
				
	}
	return error_msg;
}
}
