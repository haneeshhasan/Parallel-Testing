package Session45;

import java.beans.BeanProperty;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) {
		
		switch(br.toLowerCase()) {
		case "chrome" : driver = new ChromeDriver();break;
		case "edge" : driver = new EdgeDriver();break;
		case "firefox" : driver = new FirefoxDriver();break;
		default : System.out.println("Invalid Browser"); return;
		}
		
	//	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
				
		
	}
	
	@Test(priority = 1)
	void testLogo() {
		
		boolean status = driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}
	@Test(priority = 2)
	void testTitle() {
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
	}
	@Test(priority = 3)
	void testURL() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
	
	
	
}
