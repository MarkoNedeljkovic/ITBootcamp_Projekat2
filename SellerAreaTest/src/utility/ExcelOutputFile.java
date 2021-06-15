package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelOutputFile {
	
	private static HSSFWorkbook wb;
	private static FileInputStream fi;
				// Get user info from excel fale

	public static String getUserName(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Info.xls");
			wb = new HSSFWorkbook(fi);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return text;
	}

	public static String getEmail(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Info.xls");
			wb = new HSSFWorkbook(fi);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(1);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return text;
	}

	public static String getPassword(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Info.xls");
			wb = new HSSFWorkbook(fi);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(2);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return text;
	}
	
	public static int getAbout(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Info.xls");
			wb = new HSSFWorkbook(fi);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(3);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Util.stringToInt(text);
	}



}
