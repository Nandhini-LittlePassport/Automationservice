package Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementLIbrary {
	public static WebElement identifyElement_Name(String name, WebDriver driver) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

}
