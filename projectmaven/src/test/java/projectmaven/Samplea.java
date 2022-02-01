package projectmaven;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samplea {
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Navigate to the demoqa website
		driver.get("https://www.facebook.com/");
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("krishnaprasath@gmail.com");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("hello@1234");
		Thread.sleep(3000);
		
		
		WebElement btnlogin = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		btnlogin.click();

		
	}

}
