package pagePackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	String pageTitle;
	WebElement searchField;
	WebElement searchButton;
	WebElement loginButton;
	

    public HomePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void readTitle() {
    	pageTitle=driver.getTitle();
    }
    
    public String getPageTitle() {
    	return pageTitle;
    }

    public void getSearch()  throws InterruptedException{
		Thread.sleep(5000);

        searchField = driver.findElement(By.cssSelector("#suggestion-search"));
    }

    public void getSearchButton()  {

        searchButton = driver.findElement(By.id("suggestion-search-button"));
    }

    public void insertSearch(String search) {
        searchField.clear();
        searchField.click();
        searchField.sendKeys("Oldboy");
    }
    
    public void getLoginButton() {
    	loginButton = driver.findElement(By.cssSelector("#imdbHeader > div.ipc-page-content-container.ipc-page-content-container--center.navbar__inner > div._3x17Igk9XRXcaKrcG3_MXQ.navbar__user.UserMenu-sc-1poz515-0.lkfvZn > a"));
    }
    
    public void clickLoginButton() {
    	loginButton.click();
    }

    public boolean areWeLoggedIn() {
    	List<WebElement> dynamicElement = driver.findElements(By.cssSelector("#imdbHeader > div.ipc-page-content-container.ipc-page-content-container--center.navbar__inner > div._3x17Igk9XRXcaKrcG3_MXQ.navbar__user.UserMenu-sc-1poz515-0.lkfvZn > a"));
    	if(dynamicElement.size() != 0) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }

    public void clickSearchButton() {
        searchButton.click();
        }
}
