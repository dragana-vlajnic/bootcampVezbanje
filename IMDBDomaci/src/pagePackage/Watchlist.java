package pagePackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Watchlist {

	WebDriver driver;
	WebElement watchlist;
	WebElement movie;

    public Watchlist(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebDriver getDriver() {
		return driver;
	}

    public void getWatchlist()  throws InterruptedException{
    	Thread.sleep(5000);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#imdbHeader > div.ipc-page-content-container.ipc-page-content-container--center.navbar__inner > div.NavWatchlistButton-sc-1b65w5j-0.dAMWXo.imdb-header__watchlist-button > a > div")));
		driver.findElement(By.cssSelector("#imdbHeader > div.ipc-page-content-container.ipc-page-content-container--center.navbar__inner > div.NavWatchlistButton-sc-1b65w5j-0.dAMWXo.imdb-header__watchlist-button > a > div")).click();
    }
    
    public boolean isMovieInWatchlist() throws InterruptedException {
    	Thread.sleep(5000);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-1 > div > div > div.lister-item-image > a > img")));
    	movie = driver.findElement(By.cssSelector("#page-1 > div > div > div.lister-item-image > a > img"));
    	if(movie == null)
    		return false;
    	else return true;
    }
}
