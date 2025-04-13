package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// @SuppressWarnings("unused")
		// WebElement Dontswitch =
		// driver.findElement(By.xpath("//button[relabel=\"Don't switch\"][1]"));
		// Dontswitch.click();

		WebElement Search = driver.findElement(By.xpath("//textarea[@title='Search']"));
		Search.sendKeys("NoBrokerHood");

		WebElement Selectnobroker = driver.findElement(By.xpath("//span[text()='Estate Agent · Bengaluru, Karnataka']"));
		Selectnobroker.click();

		WebElement Recaptcha = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
		Recaptcha.click();

		WebElement ClickURL = driver.findElement(By.xpath("//a[@data-ved='2ahUKEwi35NT67qKMAxUiR2wGHSIvBCQQFnoECBYQAQ']"));
		ClickURL.click();
	}

}
