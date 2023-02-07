package Testngcases1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import java.time.Duration;

public class TestDP {
	WebDriver driver;

	@DataProvider(name = "data-set")
	public static Object[][] DataSet() {
		// read the jason or excel data
		Object[][] obj = { { "valid", "standard_user", "secret_sauce" }, { "invalid", "locked_out_user", "secret_sauce" } };
		return obj;
	}

	@Test(dataProvider = "data-set")
    public void DataProvSampleTest(String type, String username, String password) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	
        System.out.println(type + " " + username + " " + password);
        driver = new ChromeDriver();

       //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30));
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if(type.equals("valid")){
        	System.out.println("Test Pass");
        wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("[class='title']")));
        }else {
            wait.until(ExpectedConditions.presenceOfElementLocated(
              By.cssSelector("[data-test='error']")));
        	System.out.println("Test Fail");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}