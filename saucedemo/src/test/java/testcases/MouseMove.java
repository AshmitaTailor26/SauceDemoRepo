package testcases;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMove {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(3000L);
	
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
	
		menu.click();
		
		Thread.sleep(3000L);
		
		driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]")).click();
		
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]"));
		
		Actions a = new Actions(driver);
	
		a.moveToElement(mainMenu).perform();
		
		WebElement first =driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[1]/div[1]/div/a"));
		a.moveToElement(first).click().perform();
		
		WebElement second =driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[2]/div[1]/div"));
		a.moveToElement(second).click().perform();
		
		WebElement third =driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[3]/div/div/a/span"));
		a.moveToElement(third).perform();
		
		WebElement fourth =driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[4]/div[1]/div"));
		a.moveToElement(fourth).click().perform();
		
		WebElement fifth =driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[5]/div[1]/div/a"));
		a.moveToElement(fifth).click().perform();
		
		WebElement sixth =driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[6]/div[1]/div/a"));
		a.moveToElement(sixth).click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[6]/div[2]/div/div/div/ul/li/div/ul/li[1]/div/ul/li[1]/div/ul/li/a/span")).click(); 
		
	}

}
