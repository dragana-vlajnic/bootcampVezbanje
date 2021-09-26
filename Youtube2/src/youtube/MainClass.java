package youtube;

import java.util.List;

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
		driver.navigate().to("https://youtube.com/");
		driver.manage().window().maximize();
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
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 15);
			wait2.until(ExpectedConditions.elementToBeClickable(By.className("ytp-ad-skip-button-container"))).click();
		} finally {
			List<WebElement> list = driver.findElements(By.cssSelector("#dismissible > ytd-thumbnail > #thumbnail"));
			System.out.println(list.size());
			driver.navigate().to(list.get(2 + 32).getAttribute("href"));
		}
	}
}