package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PizzahutAutomation {

	WebDriver driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.pizzahut.co.in/");

	}

	@When("I enter the location as {string}")
	public void i_enter_the_location_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Location = driver.findElement(By.xpath("//input[@placeholder='Enter your location for delivery']"));
		Location.sendKeys("Pune");
	}

	@When("I select the very first suggestion from the list")
	public void i_select_the_very_first_suggestion_from_the_list() {
		// Write code here that turns the phrase above into concrete actions
		WebElement firstSuggestion = driver.findElement(By.xpath("//div[text()='Pune Railway Station']"));
		firstSuggestion.click();
	}

	@Then("I should land on the Deals page with page url {string}")
	public void i_should_land_on_the_Deals_page_with_page_url(String string) {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(driver.getCurrentUrl().contains("https://www.pizzahut.co.in/order/deals/"));
	}
	
	private void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@Then("I select the tab as {string}")
	public void i_select_the_tab_as(String tabName) {
		// Write code here that turns the phrase above into concrete actions
		String TabName1 = "//a[@data-synth='link--pizzas--side']/span[text()='"+ tabName +"']";
		WebElement Pizzatab = driver.findElement(By.xpath(TabName1));
		Pizzatab.click();
		
	}

	@Then("I add {string} to the basket")
	public void i_add_to_the_basket(String PizzaName) {
		// Write code here that turns the phrase above into concrete actions
		String PizzaName1 = "//div[text()= '" + PizzaName + "']//following::button[1]";
		WebElement AddKadhaiPaneer = driver.findElement(By.xpath(PizzaName1));
		AddKadhaiPaneer.click();
	}

	@Then("I note down the price displayed on the screen")
	public void i_note_down_the_price_displayed_on_the_screen() {
		// Write code here that turns the phrase above into concrete actions
		WebElement ViewCartPriceDisplay = driver.findElement(By.xpath("//span[@class='ml-auto']"));
		String PizzaPrice = ViewCartPriceDisplay.getText().replace("₹", "").trim();
		System.out.println("Pizza Price is " + PizzaPrice);

	}

	@Then("I should see the pizza {string} is added to the cart")
	public void i_should_see_the_pizza_is_added_to_the_cart(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement CartItem = driver.findElement(By.xpath("//div[@data-synth='basket-item-type--pizza']"));
		Assert.assertTrue(CartItem.isDisplayed());
	}

	@Then("price is also displayed correctly")
	public void price_is_also_displayed_correctly() {
		// Write code here that turns the phrase above into concrete actions
		WebElement displayedPrice = driver.findElement(
				By.xpath("//div[@class='basket-item-product-price leading-tight bold text-15 text-black']"));
		Assert.assertTrue(displayedPrice.isDisplayed());
	}

	@Then("I click on the Checkout button")
	public void i_click_on_the_Checkout_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement Checkoutbtn = driver.findElement(By.xpath("//span[text()='Checkout']"));
		Checkoutbtn.click();
	}

	@Then("I should be landed on the secured checkout page with url {string}")
	public void i_should_be_landed_on_the_secured_checkout_page_with_url(String string) {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(driver.getCurrentUrl().contains("https://www.pizzahut.co.in/order/checkout/"));
	}

	@Then("I enter the First Name {string}")
	public void i_enter_the_First_Name(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement InputFirstName = driver.findElement(By.id("checkout__name"));
		InputFirstName.sendKeys("Rajesh");
	}

	@Then("I enter the Mobile  {string}")
	public void i_enter_the_Mobile(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement InputMobile = driver.findElement(By.id("checkout__phone"));
		InputMobile.sendKeys("9999999999");
	}

	@Then("I enter the email {string}")
	public void i_enter_the_email(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement InputEmail = driver.findElement(By.id("checkout__email"));
		InputEmail.sendKeys("Rajesh@yopmail.com");
	}

}
