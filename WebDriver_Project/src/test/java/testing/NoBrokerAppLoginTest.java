package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoBrokerAppLoginTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.nobroker.in/prophub/society-club/ambassador-club/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
WebElement JoinAmbassadorClub = driver.findElement(By.xpath("//button[text()='Join Ambassador’s Club ']"));	
		JoinAmbassadorClub.click();	
		
		WebElement InputName = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		InputName.sendKeys("Abhishek Jain");
		
		WebElement InputPhoneNo = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
		InputPhoneNo.sendKeys("7060623686");
		
		WebElement InputEmailID = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		InputEmailID.sendKeys("abhijain2640@gmail.com");
		
		WebElement SelectCity = driver.findElement(By.xpath("//select[@name='city']"));
		Select SelectCity1 = new Select (SelectCity);
		SelectCity1.selectByVisibleText("Delhi");
		
		WebElement InputSocietyName = driver.findElement(By.xpath("//input[@placeholder='Society Name']"));
		InputSocietyName.sendKeys("Gaur City 7th Avenue");
		
		WebElement InputOccupation = driver.findElement(By.xpath("//select[@id='occupationId']"));
		Select OccupationID = new Select(InputOccupation);
		OccupationID.selectByVisibleText("Salaried (Job)");
		
		WebElement SubmitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		SubmitButton.click();
		
		
		
		
	}

}
