package projectmaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\krishna\\eclipse-workspace\\projectmaven\\Excels\\testjavaframework.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet");

		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();
				
				if(type==0) {
				
				
				if(DateUtil.isCellDateFormatted(cell)) {
					
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yy");
					String format = dateformat.format(dateCellValue);
					System.out.println(format);
			}
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
//				double numericValue = cell.getNumericCellValue();
//
//				long l = (long) numericValue;
//				String valueOf = String.valueOf(l);
//				System.out.println(valueOf);
////				int cellType = cell.getCellType();
////				if (cellType == 1) {
////					String stringCellValue = cell.getStringCellValue();
////					System.out.println(stringCellValue);
////
////				} else {
////					double numericValue = cell.getNumericCellValue();
////
////					long l = (long) numericValue;
////					String valueOf = String.valueOf(l);
////					System.out.println(valueOf);
//
//				}

			}

		}

	}
}
