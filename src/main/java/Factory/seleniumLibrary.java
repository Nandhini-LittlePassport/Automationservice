package Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumLibrary {
	public static WebElement identifyElemenet_Name(String name) {
		return WebDriverfactory.returnDriver().findElement(By.name(name));
	}

	public static void enterText(String text, WebElement element) {
		element.sendKeys(text);
	}
	public static void click( WebElement element) {
		element.click();
	}
	public static void switchingtoalert() {
		WebDriverfactory.returnDriver().switchTo().alert();
	}
	public static void acceptAlert() {
		WebDriverfactory.returnDriver().switchTo().alert().accept();
	}
	public static void delay(WebElement element) {
		WebDriverWait wait=new WebDriverWait(WebDriverfactory.returnDriver(), 100);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
