package projectmaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\krishna\\eclipse-workspace\\projectmaven\\Excels\\testjavaframework1.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet createSheet = workbook.createSheet("sheet1");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dropdownskill = driver.findElement(By.id("Skills"));
		Select se = new Select(dropdownskill);
		List<WebElement> list = se.getOptions();
		for (int i = 0; i < list.size(); i++) {
			WebElement datalist = list.get(i);
			String text = datalist.getText();
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);	
		}
		
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);

		driver.quit();

	}

}
