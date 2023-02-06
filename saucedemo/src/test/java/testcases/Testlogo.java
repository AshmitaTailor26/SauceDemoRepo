package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlogo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		WebElement img = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
		
		
	Rectangle rect = img.getRect();
		
	System.out.println("logo Height : "+rect.getHeight());
	System.out.println("logo Width : "+rect.getWidth());
	System.out.println("logo X Coord : "+rect.getX());
	System.out.println("logo Y Coord : "+rect.getY());
		
	}

}
