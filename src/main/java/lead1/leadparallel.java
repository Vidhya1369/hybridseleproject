package lead1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leadparallel {
	public WebDriver driver;

	@Test
	@Parameters("Bro")
	public void demo(String Browser) 
	{
	ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

	  WebDriver driver =new ChromeDriver(co);
	 
      {
		
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
	  }
	  {
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("user");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	String title = driver.getTitle();
	Reporter.log(title, true);
	String url = driver.getCurrentUrl();
	Reporter.log(url, true);
	}

	
	}
}

