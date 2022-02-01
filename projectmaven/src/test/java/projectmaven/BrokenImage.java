package projectmaven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImage {

	WebDriver driver;

	@BeforeClass
	private void driverIntial() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com");
		driver.manage().window().maximize();

	}

	@SuppressWarnings("deprecation")
	@Test
	private void test() throws IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By.tagName("img"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement img = elements.get(i);
			String attribute = img.getAttribute("src");
			URL u = new URL(attribute);
			
			URLConnection openConnection = u.openConnection();
			
			HttpURLConnection urlconnection = (HttpURLConnection) openConnection;
			
			int responseCode = urlconnection.getResponseCode();
			if(responseCode!=200) {
				System.out.println(attribute);
			}

		}

		
	}

}
