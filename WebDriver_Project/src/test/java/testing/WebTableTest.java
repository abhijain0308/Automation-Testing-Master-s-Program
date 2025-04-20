package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// To find more than element use find elements method
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total number of rows are " + Rows.size());

		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Total number of Columns are " + Columns.size());

		// Print the column names in console

		for (WebElement col : Columns) {
			System.out.println(col.getText());
			
			// Print the country of a given company
			WebElement Country = driver.findElement(By.xpath("//td[text()='Island Trading']/following-sibling::td[2]"));
			System.out.println(Country.getText());

		}

	}

}
