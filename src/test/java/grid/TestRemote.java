package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestRemote {

	@Test
	public void googleTest() throws MalformedURLException{


		FirefoxOptions opt = new FirefoxOptions();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://3.110.224.240:4444/"),opt);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Grid !!!");
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
