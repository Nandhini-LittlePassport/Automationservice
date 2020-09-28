package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage_page {
	static WebElement signIn_btn;
	public static WebElement SignIn_Btn(WebDriver driver) {
		if(signIn_btn==null) {
			signIn_btn= driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
					
		}
		return signIn_btn;
	}
}
