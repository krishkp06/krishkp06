package projectmaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;


	public static void webdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadurl(String url) {
		driver.get(url);

	}

	public void sendkeys(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void click(WebElement element) {
		element.click();

	}

	public String gettitle() {
		String title = driver.getTitle();
		return title;

	}

	public String geturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public String getext(WebElement element) {
		String text = element.getText();
		return text;

	}

	public WebElement finelementbyid(String value) {
		WebElement findElement = driver.findElement(By.id(value));
		return findElement;

	}

	public WebElement findbyname(String value) {
		WebElement findElement = driver.findElement(By.name(value));
		return findElement;

	}

	public WebElement findbyclassname(String value) {
		WebElement findElement = driver.findElement(By.className(value));
		return findElement;

	}

	public WebElement findbyxpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;

	}

	public String getenteredtext(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public String getenteredtext1(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;

	}

	public void selectbytext(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public void selectbyattribute(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}

	public void selectbyvalue(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);

	}

//	public String getalloption(WebElement element) {
//		Select s = new Select(element);
//List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		String text = null;
//		for (int i = 0; i < allSelectedOptions.size(); i++) {
//			WebElement data = allSelectedOptions.get(i);
//			text = data.getText();
//			System.out.println(text);
//		}
//		return text;
//
//	}

	public boolean ismultipleoption(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;

	}
	public void takescreenshot(String dest) throws IOException {
		
		TakesScreenshot js = (TakesScreenshot) driver;
		File screenshotAs = js.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File (dest));
	
	}

	public void unselectall(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	public void typejs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

	public void jsscrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void jsscrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void clickbtnjs(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("aruguments[0].click()", element);
	}

	public static void closeallwindow() {

		driver.quit();

	}
	public static void max() {
		driver.manage().window().maximize();
		

	}

	public void closecurrentwindow() {
		driver.close();
	}

	public void clickokalert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void clickcancelalert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public void entertextinalrt(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);

	}

	public void dragndrop(WebElement element, WebElement element2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element2).perform();
		;
	}

	public void mouseoveraction(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		;
	}

	public String getdata(String sheetname, int rowno, int cellno) throws IOException {
		String data=null;
		File file = new File("C:\\Users\\krishna\\eclipse-workspace\\projectmaven\\Excels\\testjavaframework.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int cellType = cell.getCellType();
		if (cellType == 1) {
			data = cell.getStringCellValue();

		}if (cellType==0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date cellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/YYYY");
				data = dateFormat.format(cellValue);
				
				
			}else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				data=String.valueOf(l);
			}
		}
		return data;
		

	}
	public void writedata(String sheetname, int rowno, int cellno, String data) throws IOException {
		File file = new File("C:\\Users\\krishna\\eclipse-workspace\\projectmaven\\Excels\\testjavaframework.xlsx");
		FileInputStream Stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell createCell = row.createCell(cellno);
		createCell.setCellValue(data);
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		
		

	}
	public String timeStamp() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}

}
