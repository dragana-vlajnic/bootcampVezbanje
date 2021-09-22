package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com/");
		Thread.sleep(1000);

		WebElement search = driver.findElement(By.cssSelector("input#search"));
		search.clear();
		search.sendKeys("Rick Astley - Never Gonna Give You Up");
		WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		searchButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 10000);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")))
				.click();

		WebDriverWait wait2 = new WebDriverWait(driver, 15000);
		wait2.until(ExpectedConditions.elementToBeClickable(By.className("ytp-ad-skip-button-container"))).click();
	}
}