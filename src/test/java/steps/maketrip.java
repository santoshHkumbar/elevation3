package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class maketrip {
	 WebDriver driver;

	   
	


	
	@Given("user is landed on MakeMyTrip home page")
	public void user_is_landed_on_make_my_trip_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	    driver.get("https://www.makemytrip.com");
	    driver.manage().window().maximize();

	}

	@When("user clicks on hotels")
	public void user_clicks_on_hotels() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//span[@class=\"chNavIcon appendBottom2 chSprite chHotels inactive\"]")).click();
	}

	@When("user enters location {string}, dates {string} to {string}, room {string}, adults {string} and applies, price per night max {int}")
	public void user_enters_location_dates_to_room_adults_and_applies_price_per_night_max(String string, String string2, String string3, String string4, String string5, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement cityInput = driver.findElement(By.xpath("//input[@class=\\\"react-autosuggest__input react-autosuggest__input--open\\\"]"));
        cityInput.sendKeys(string);
        
        
        
        driver.findElement(By.id("checkin")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"lbl_input appendBottom5\"])[5]")).click();
		
	}

	@When("clicks on search")
	public void clicks_on_search() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.cssSelector("[id=\"hsw_search_button\"]")).click();
	}

	

	@Then("validate payment page")
	public void validate_payment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("validate hotel name")
	public void validate_hotel_name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("validate booking dates")
	public void validate_booking_dates() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
