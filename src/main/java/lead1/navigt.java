package lead1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigt {

	public static void main(String[] args) throws InterruptedException {
		//Handelled untrusted certificate through firefox
				WebDriverManager.firefoxdriver().setup();
		        FirefoxProfile profile = new FirefoxProfile();
		        profile.setAcceptUntrustedCertificates(true);
		         WebDriver driver = new FirefoxDriver();
		         driver.manage().window().maximize();
		         driver.get("https://facebook.com/");
		         Thread.sleep(3000);
		        // driver.navigate().to("https://www.amazon.in/");
		         //Thread.sleep(3000);
		        // driver.navigate().back();
		       //  Thread.sleep(3000);
		       //  driver.navigate().forward();
		       //  Thread.sleep(3000);
		        // driver.navigate().refresh();
		         System.out.println(driver.getTitle());
		         System.out.println(driver.getCurrentUrl());
		         driver.close();
	}

}
