package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverfactory {
	static WebDriver driver;

	public void returnChromedriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void launchwebsite(String url) {
		driver.get(url);
	}
	
	public static WebDriver returnDriver() {
		return driver;
	}
}
