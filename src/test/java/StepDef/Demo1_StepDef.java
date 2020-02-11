package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Demo1_StepDef {
	
	WebDriver driver=null;
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver =new  ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize(); //maximize Browser
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("user enters aravind.guggilla{int}@gmail.com as username")
	public void user_enters_aravind_guggilla_gmail_com_as_username(Integer int1) {
		driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
	}

	@When("user enters aravind as password")
	public void user_enters_aravind_as_password() {
		driver.findElement(By.name("Password")).sendKeys("aravind");
	}

	@Then("user will click on login button")
	public void user_will_click_on_login_button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

	}

	@Then("demo webshop home page appears")
	public void demo_webshop_home_page_appears() {
	    System.out.println("the title of page "+driver.getTitle());
	    Assert.assertEquals(200, 100);
	    Assert.assertTrue(driver.getTitle().startsWith("a"));
	   
	}
	
	

}
