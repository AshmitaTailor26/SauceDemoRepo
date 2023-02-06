package Testngcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	
protected WebDriver driver;
@Test
public void validattitle() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	 			String validTitle = "Swag Labs";
	 			String blankTitle = "";
	 			
	 			driver.get("https://www.saucedemo.com/");
	 			
	 			driver.manage().window().maximize();
	 			Thread.sleep(5000L);
	 			
	 			blankTitle =driver.getTitle();
	 			
	 			if(blankTitle.contentEquals(validTitle)) {
	 				System.out.println("Test case pass");
	 				
	 		}else {
	 				System.out.println("Test case fail");
	 		}
	 			driver.close();
	 			
	 			
	 			
}

	

}
