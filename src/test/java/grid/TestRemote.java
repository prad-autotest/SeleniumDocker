package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestRemote {

	@Test
	public void googleTest() throws MalformedURLException{


		//FirefoxOptions opt = new FirefoxOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");

		
		WebDriver driver = new RemoteWebDriver(new URL("http://13.201.88.57:4444"),capabilities);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Grid !!!");
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
