package Session21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.apple.com/in/watch/?afid=p240%7Cgo~cmp-11424422076~adg-110632497734~ad-731815995262_kwd-52218226~dev-c~ext-~prd-~mca-~nt-search&cid=aos-in-kwgo-watch--");
		
		String title = driver.getTitle();
		
		if(title.equals("Apple Watch - Apple (IN)")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		
	//	 driver.quit();
	//	driver.close();
		
	}

}
