package lead1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class skillarylogin {

	public static void main(String[] args) throws Exception {
		//Handelled untrusted certificate through firefox
		WebDriverManager.firefoxdriver().setup();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
       WebDriver driver = new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demoapp.skillrary.com/index.php");
         System.out.println(driver.getTitle());
         driver.findElement(By.linkText("LOGIN")).click();
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
         driver.findElement(By.cssSelector("input[id='password']")).sendKeys("admin");
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("button[id='last']")).click();
         driver.quit();

	}

}
