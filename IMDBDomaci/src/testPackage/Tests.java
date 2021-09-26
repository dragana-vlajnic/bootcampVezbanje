package testPackage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagePackage.LogInPage;
import pagePackage.Watchlist;
import setupPackage.IMDBDomaciBase;

public class Tests extends IMDBDomaciBase {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://imdb.com");
	}

	@Test(priority = 10)
	public void logIn() throws InterruptedException {
		if (homePage.areWeLoggedIn()) {
			homePage.readTitle();
		} else {
			homePage.getLoginButton();
			homePage.clickLoginButton();
			loginPage.getSignInWithGoogle();
			loginPage.clickOnSignInWithGoogle();
			if (googleSignIn.isThereClickAnotherAccountButton() == true) {
				googleSignIn.clickAnotherAcount();
			}
			googleSignIn.getEmailTextField();
			googleSignIn.insertEmail("draganavlajnic123@gmail.com");
			googleSignIn.submitEmail();
			googleSignIn.clickSubmitEmail();
			Thread.sleep(2000);
			googleSignIn.insertPassword("blabla@123!");
			// googleSignIn.insertPassword("blabla@123!");
			Thread.sleep(2000);
			googleSignIn.getSubmitButton();
			googleSignIn.clickSubmitButton();
			Thread.sleep(2000);
			homePage.readTitle();
		}
	}

	@Test(priority = 20)
	public void search() throws InterruptedException {
		homePage.getSearch();
		homePage.insertSearch("OldBoy");
		homePage.getSearchButton();
		homePage.clickSearchButton();
		Thread.sleep(2000);
	}
	
	@Test (priority = 30)
	public void enterMovie() throws InterruptedException {
		homePage.getSearch();
		homePage.insertSearch("OldBoy");
		homePage.getSearchButton();
		homePage.clickSearchButton();
		Thread.sleep(2000);
		searchResults.getMovieWeReLookingFor();
	}
	
	@Test (priority = 40)
	public void addToWatchlist() throws InterruptedException {
		homePage.getSearch();
		homePage.insertSearch("OldBoy");
		homePage.getSearchButton();
		homePage.clickSearchButton();
		Thread.sleep(2000);
		searchResults.getMovieWeReLookingFor();
		Thread.sleep(5000);
		filmScreen.getWatchList();
	}
	
	@Test (priority = 50)
	public void goToWatchlist() throws InterruptedException {
		watchlist.getWatchlist();
		Assert.assertEquals(watchlist.isMovieInWatchlist(), true);
	}
}
	
	

	/*
	 * @AfterMethod public void deleteCookies() {
	 * driver.manage().deleteAllCookies(); }
	 */
