package pagePackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	private WebDriver driver;
	WebElement signInWithGoogle;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getSignInWithGoogle() {
		signInWithGoogle = driver.findElement(By.cssSelector("#signin-options > div > div:nth-child(2) > a:nth-child(4)"));
	}
	
	public void clickOnSignInWithGoogle() {
		signInWithGoogle.click();
	}
}
