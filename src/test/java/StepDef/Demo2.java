package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo2 {

	WebDriver driver =null;
	@Given("User is open the application")
	public void user_is_open_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver =new  ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize(); //maximize Browser
	}
	@When("User click on  to signin link")
	public void user_click_on_to_signin_link() {
		driver.findElement(By.linkText("Log in")).click();		   
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {	
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
	}

	@Then("User will click on Login Button")
	public void user_will_click_on_Login_Button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

	}

	@Then("Demo webshop homepage will display")
	public void demo_webshop_homepage_will_display() {
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   System.out.println(driver.getTitle());
	       driver.close();
	    
	}

}
