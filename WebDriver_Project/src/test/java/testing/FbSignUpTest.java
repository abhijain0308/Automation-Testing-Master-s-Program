package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement CreateAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateAccount.click();

		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("John");

		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Doe");

		// Find the select tag locator
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));

		// create the object for Select class and pass the locator in the constructor
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("3");

		// Find the select tag locator
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		// create the object for Select class and pass the locator in the constructor
				Select month1 = new Select(month);
				month1.selectByVisibleText("Aug");
				
				// Find the select tag locator
				WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
				
				// create the object for Select class and pass the locator in the constructor
				Select year1 = new Select(year);
				year1.selectByVisibleText("1989");
				
				//Gender Radio Button
				WebElement Male = driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"2\"]"));
				Male.click();
				
				
		
	}

}
