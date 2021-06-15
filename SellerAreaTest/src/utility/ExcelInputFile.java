package utility;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelInputFile {
public static void main(String[] args) {
		
		// Save user info in excel file
		
		HSSFWorkbook wb = new HSSFWorkbook();
		
		HSSFSheet sheet = wb.createSheet("sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("User name");
		cell = row.createCell(1);
		cell.setCellValue("Email");
		cell = row.createCell(2);
		cell.setCellValue("Password");
		cell = row.createCell(3);
		cell.setCellValue("About");


		for (int i = 1;i<UserFactory.nameSize(); i++) {
			
			row = sheet.createRow(i);
			
			cell = row.createCell(0);
			cell.setCellValue(UserFactory.getUserName(i));
			cell = row.createCell(1);
			cell.setCellValue(UserFactory.emailGenerator(i));
			cell = row.createCell(2);
			cell.setCellValue(UserFactory.passwordGenerator(i));
			cell = row.createCell(3);
			cell.setCellValue(UserFactory.about());

		}
		
		FileOutputStream os;
		try {
			os = new FileOutputStream("Info.xls");
			wb.write(os);
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Gotovo");

	}

}
