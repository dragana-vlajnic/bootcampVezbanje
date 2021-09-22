package paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadPath extends Path {

	private String username;
	private String password;
	
	public SadPath(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public void path() {
		System.setProperty("webdriver.chrome.driver",  "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		WebElement user = driver.findElement(By.id("username"));
		user.clear();
		user.click();
		user.sendKeys("mikimiki");
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.click();
		pass.sendKeys("PassPass!");
		
		WebElement submitButton = driver.findElement(By.cssSelector("#login > button > i"));
		submitButton.click();
		
		WebElement test = driver.findElement(By.id("flash"));
		String testText = test.getText();
		
		
		if(testText.contains("username is invalid")){
			System.out.println("FAIL - invalid username");
		}
		else if(testText.contains("password is invalid"))
		{
			System.out.println("FAIL - invalid password");
		}	
	}
}
