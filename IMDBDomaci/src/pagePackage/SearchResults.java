package pagePackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResults {

	WebDriver driver;
	WebElement movieWeReLookingFor;

    public SearchResults(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebDriver getDriver() {
		return driver;
	}

    public void getMovieWeReLookingFor()  throws InterruptedException{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#main > div > div:nth-child(3) > table > tbody > tr:nth-child(2) > td.result_text > a")));
		driver.findElement(By.cssSelector("#main > div > div:nth-child(3) > table > tbody > tr:nth-child(2) > td.result_text > a")).click();
    }
    

}
