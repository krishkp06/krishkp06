package projectmaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmmazonWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
