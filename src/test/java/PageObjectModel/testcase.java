package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        PageClass Pobject= new PageClass(driver);
        Pobject.click_lnc();
        Pobject.type_uname();
        Pobject.type_pwd();
        Pobject.click_lbtn();
		
	}

}
