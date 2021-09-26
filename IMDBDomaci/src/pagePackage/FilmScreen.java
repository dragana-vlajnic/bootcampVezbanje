package pagePackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilmScreen {

	WebDriver driver;
	String pageTitle;
	WebElement watchList;
	WebElement watchList2;
	String text;
	

    public FilmScreen(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void readTitle() {
    	pageTitle=driver.getTitle();
    }
    
    public String getPageTitle() {
    	return pageTitle;
    }

    public void getWatchList()  throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("ipc-btn__text")));
		driver.findElement(By.className("ipc-btn__text")).click();
    }
    
    public String isMovieInWatchlist() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("ipc-btn__text")));
		watchList2 = driver.findElement(By.className("ipc-btn__text"));
    	return watchList2.getText();
    }


}
