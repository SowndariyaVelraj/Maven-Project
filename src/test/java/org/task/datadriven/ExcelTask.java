package org.task.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTask extends BaseClass {
	public static void main(String[] args) throws IOException, InvalidFormatException {
		launchBrowser();
		maximize();
		openBrowser("http://www.adactin.com/HotelApp/");
		File f=new File("C:\\Users\\pc\\eclipse-workspace\\DataDrivenTask\\excel\\DatadrivenQues12.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("sheet1");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Username");
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
	
		
	}

}
