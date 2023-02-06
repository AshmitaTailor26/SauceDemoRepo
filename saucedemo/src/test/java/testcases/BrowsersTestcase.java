package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

public class BrowsersTestcase {

	public static void main(String[] args) {
		/* Ctrl + Shift + O */
		/* for Firefox Driver */
		/*
		 * System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver/");
		 * FirefoxDriver driver=new FirefoxDriver();
		 * driver.get("http://www.saucedemo.com");
		 */

		/* for Google Driver */
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver105/chromedriver/"); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		

		/* for IE Driver */

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "/home/ubantu/.PlayOnLinux/wineprefix/InternetExplorer8/drive_c/Program Files/Internet Explorer/iexplore.exe/"
		 * ); InternetExplorerDriver driver = new InternetExplorerDriver();
		 * driver.get("http://www.saucedemo.com/");
		 */

		/* for Edge Driver */
	//	System.setProperty("webdriver.edge.driver", "/usr/local/bin/msedgedriver/");
	//	EdgeDriver driver = new EdgeDriver();
		//driver.get("http://www.saucedemo.com");
		
		/*
		 * System.setProperty("webdriver.safari.driver",
		 * "/usr/local/bin/safaridriver/"); SafariDriver driver= new SafariDriver();
		 * driver.get("http://www.google.com");
		 */
		//driver.close();
	
	}
	
}
