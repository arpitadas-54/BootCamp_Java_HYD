package ActionCommands;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FiveWebsitesCaseStudy {
	WebDriver driver;

       @Test
       public void Test() throws InterruptedException {

	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");

	driver.navigate().to("https://www.opencart.com/");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");

	driver.navigate().to("https://www.bing.com/");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");

	driver.navigate().to("https://www.freecrm.com/");
	Thread.sleep(3000);
    ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");

	driver.navigate().to("https://www.chase.com/");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");

	driver.quit();
       }
}


