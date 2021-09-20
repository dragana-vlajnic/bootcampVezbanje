package practicetestautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTestAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/");
		//driver.navigate().to("https://practicetestautomation.com/");
		WebElement practice = driver.findElement(By.linkText("PRACTICE"));
		practice.click();
		WebElement loginPageLink = driver.findElement(By.linkText("Test Login Page"));
		loginPageLink.click();
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("student");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		WebElement logOut = driver.findElement(By.linkText("Log out"));
		Thread.sleep(2000);
		logOut.click();
		Thread.sleep(2000);
		driver.close();
	}

}
