package pagePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSignIn {
	private WebDriver driver;
	private WebElement email;
	private WebElement password;
	private WebElement submitButton;
	private WebElement submitEmail;
	
	
	
	public GoogleSignIn(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isThereClickAnotherAccountButton() {
    	List<WebElement> dynamicElement = driver.findElements(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div > div > ul > li.JDAKTe.eARute.W7Aapd.zpCp3.SmR8"));
    	if(dynamicElement.size() != 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
	public void clickAnotherAcount() {
		driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div > div > ul > li.JDAKTe.eARute.W7Aapd.zpCp3.SmR8")).click();
	}
	
	public void getEmailTextField() {
		email = driver.findElement(By.cssSelector("#identifierId"));
	}
	
	public void insertEmail(String email) {
		this.email.clear();
		this.email.click();
		this.email.sendKeys(email);
	}
	
	public void submitEmail() {
		submitEmail = driver.findElement(By.cssSelector("#identifierNext > div > button"));
	}
	
	public void clickSubmitEmail() {
		submitEmail.click();
	}
	
	public void insertPassword(String password) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=password]")));
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys(password);
	}
	
	public void getSubmitButton() {
		submitButton = driver.findElement(By.id("passwordNext"));
	}
	
	public void clickSubmitButton() {
		submitButton.click();
	}	
}
