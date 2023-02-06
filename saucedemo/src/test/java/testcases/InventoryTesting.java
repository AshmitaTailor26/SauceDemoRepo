package testcases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InventoryTesting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List<WebElement> items = driver.findElements(By.className("shopping_cart_badge"));
	        int total = items.size();
	        System.out.println("Total Inventory Items : " + total);
	        
	        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	        
	        
	        List<WebElement> item1 = driver.findElements(By.className("shopping_cart_badge"));
	        int total1 = item1.size();
	        System.out.println("After Click on AddtoCart Total Inventory Items : " + total1);
	    
	        //System.out.println(items.get(0).getText());
	        //for (int i = 0; i < items.size(); i++) {
				//System.out.println(items.get(i).getClass("shopping_cart_badge");
	        
	        
	        
	        }     

	}


