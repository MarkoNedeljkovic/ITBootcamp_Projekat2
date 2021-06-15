package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ProductExcelOutputFile {
	private static HSSFWorkbook wb;
	private static FileInputStream fi;
	// Get user info from excel fale

	public static String getName(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Products.xls");
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

	public static String getID(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Products.xls");
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

	public static String getSDesc(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Products.xls");
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

	public static String getLDesc(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Products.xls");
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

		return text;
	}

	public static String getPrice(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Products.xls");
			wb = new HSSFWorkbook(fi);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(4);

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

	public static String getTangible(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Products.xls");
			wb = new HSSFWorkbook(fi);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(5);

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

	public static String getRecurring(int i) {
		String text = "";
		try {
			fi = new FileInputStream("Products.xls");
			wb = new HSSFWorkbook(fi);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(6);

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

}
