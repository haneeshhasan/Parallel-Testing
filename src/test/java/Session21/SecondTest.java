package Session21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTest {

	public static void main(String[] args) {

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		   List<WebElement> list1  =   driver.findElements(By.tagName("a"));
		   System.out.println("Total No of links"+list1.size());
		   
		   System.out.println("----------------------------------");
		   
		   for (WebElement link : list1) {
			    String url = link.getAttribute("href"); // get the actual link (URL)
			    String text = link.getText();           // optional: get the visible link text

			    System.out.println("Text: " + text + " | Link: " + url);
			}
		  
		   System.out.println("----------------------------------");
		   
	//	   driver.findElement(By.name("search")).sendKeys("Mac");        Sending Text 
		   
		   
	//	   Boolean logodisplay =  driver.findElement(By.id("logo")).isDisplayed();  Checking whether element is available
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		   wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s7"))).click();

		   
		   wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("img"),6));
//		   try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		   List<WebElement>   list2  =   driver.findElements(By.tagName("img"));
		   System.out.println("Total No of images "+list2.size());
		   
	//   driver.findElement(By.linkText("Samsung galaxy s7")).click();
		   
		   
		   driver.quit();
		   
		   
	}

}
