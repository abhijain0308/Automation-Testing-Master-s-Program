package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@After
	public void TearDown() {
		driver.quit();
	}

}
