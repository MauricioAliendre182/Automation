package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
				+ File.separator + "src" + File.separator + "test" + File.separator + "java" +
				File.separator + "resources" + File.separator + "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8080/webapp/");
//		driver.get("https://rahylshettyacademy.azurewebsites.net/webapp/");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	}
}
