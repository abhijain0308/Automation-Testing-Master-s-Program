package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
		Login.click();
		
		WebElement Mobile = driver.findElement(By.xpath("//form/div/input[@type='text']"));
		Mobile.sendKeys("8860437137");
		
		WebElement ReqOTP = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		ReqOTP.click();
		
	}

}
