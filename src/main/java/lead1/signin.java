package lead1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


import io.github.bonigarcia.wdm.WebDriverManager;

public class signin {

	public static void main(String[] args) throws InterruptedException {
		//Handelled untrusted certificate through firefox
		WebDriverManager.firefoxdriver().setup();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
         WebDriver driver = new FirefoxDriver();
       driver.get("https://facebook.com/");
       driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
       driver.findElement(By.name("pass")).sendKeys("12345");
       Thread.sleep(3000);
       driver.findElement(By.name("login")).click();
       
      WebElement profile1 =driver.findElement(By.xpath("//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]"));
     profile1.click();
        WebElement logout=driver.findElement(By.xpath("//div[@role='listitem'][5]"));
        logout.click();
System.out.println("logout is done");
	}

	

	
	
}
