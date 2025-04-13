package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GoogleSearchAutomation {
	
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();

		try {
			// Navigate to Google's homepage
			driver.get("https://www.google.com");

			// Initialize WebDriverWait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Find the search box element
			WebElement searchBox = driver.findElement(By.name("q"));

			// Enter the search query
			searchBox.sendKeys("Selenium WebDriver");

			// Submit the search form
			searchBox.submit();

			// Wait for the search results to load
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));

			// Optionally, print the title of the first search result
			WebElement firstResult = driver.findElement(By.cssSelector("h3"));
			System.out.println("First result title: " + firstResult.getText());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
