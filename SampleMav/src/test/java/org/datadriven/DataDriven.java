package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static Workbook wb;
	public static Sheet cs;
	public static Row cr;

	public static void main(String[] args) throws Exception {
		String a[] = { "Name", "kumar", "pragash", "nishanth", "sathish" };
		String b[] = { "Age", "26", "26", "22", "25"};

		File f = new File(
				"C:\\Users\\shpra\\eclipse-workspace\\SampleMav\\src\\test\\resources\\Test_Data\\greens.xlsx");

		wb = new XSSFWorkbook();

		cs = wb.createSheet();
		

		for (int i = 0; i < a.length; i++) {
			cr = cs.createRow(i);
			for (int j = 0; j < 2; j++) {
				Cell cc = cr.createCell(j);
				if (j == 0) {
					cc.setCellValue(a[i]);
				} else {
					cc.setCellValue(b[i]);
				}
			}
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("success");

	}
}
