package setupPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pagePackage.GoogleSignIn;
import pagePackage.HomePage;
import pagePackage.LogInPage;
import pagePackage.SearchResults;
import pagePackage.Watchlist;
import pagePackage.FilmScreen;

public class IMDBDomaciBase {
	protected WebDriver driver;
	protected GoogleSignIn googleSignIn;
	protected HomePage homePage;
 	protected LogInPage loginPage;
 	protected SearchResults searchResults;
 	protected FilmScreen filmScreen;
 	protected Watchlist watchlist;
	
 	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
        driver = new ChromeDriver();        
        googleSignIn = new GoogleSignIn(driver);
        homePage = new HomePage(driver);
        loginPage = new LogInPage(driver);
        searchResults = new SearchResults(driver);
        filmScreen = new FilmScreen(driver);
        watchlist = new Watchlist(driver);
    }
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
