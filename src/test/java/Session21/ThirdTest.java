package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		   //Tag and Id
	        driver.findElement(By.cssSelector("input#small-searchitems"));
	        // only Id
	        driver.findElement(By.cssSelector("#small-searchitems"));
		
		     driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("iphone" +Keys.ENTER);
		
		     
		     //Tag and Class
		        driver.findElement(By.cssSelector("input.small-searchitems"));
		        // only Class
		        driver.findElement(By.cssSelector(".small-searchitems"));
		     
		     
		        
		        //Tag and Attribute
		        driver.findElement(By.cssSelector("input[href='www.com']"));
		        // Attribute
		        driver.findElement(By.cssSelector("[href='www.com']"));
		        
		        
		        //Tag Class and Attribute
		        driver.findElement(By.cssSelector("input.small-searchitems[href='www.com']"));
		        // Class and Attribute
		        driver.findElement(By.cssSelector(".small-searchitems[href='www.com']"));
	//	driver.findElement(By.cssSelector("button[title='Search for Products, Brands and More']")).click();
		
		
	}
}
