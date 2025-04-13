package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		@SuppressWarnings("unused")
		WebElement UserName = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		UserName.sendKeys("abhijain2640@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		Password.sendKeys("Ayansh@123");
		
		@SuppressWarnings("unused")
		WebElement Login1 = driver.findElement(By.xpath("//button[@type='submit']"));
		Login1.click();
		
		WebElement ErrorMsg = driver.findElement(By.xpath("//*[starts-with(text(),'Sorry, ')]"));
		String ErrorMsg1 = ErrorMsg.getText();
		System.out.println("The Error Msg is " + ErrorMsg1);
		
		
		
		
		
	}

}
