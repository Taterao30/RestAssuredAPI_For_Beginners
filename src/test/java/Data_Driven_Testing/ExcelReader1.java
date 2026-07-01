package Data_Driven_Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {

	// Workbook object to access the Excel file
	static XSSFWorkbook workbook;

	// Constructor to load the Excel file
	public ExcelReader1(String excelPath) throws IOException {

		// Create File object using the Excel path
		File file = new File(excelPath);

		// Check whether the file exists
		System.out.println("Is FileExist: " + file.exists());

		// Create FileInputStream to read the Excel file
		FileInputStream fis = new FileInputStream(file);

		// Load the Excel workbook
		workbook = new XSSFWorkbook(fis);
	}

	// Returns the total number of rows in the specified sheet
	public static int getTotalRow(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum() + 1;
	}

	// Returns the total number of columns in the first row
	public static int getTotaRows(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

	// Returns the cell value as a String
	public static String getCellValue(int sheetIndex, int row, int cell) {
		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(cell).getStringCellValue();
	}

	// Reads all data from the sheet and stores it in a 2D Object array
	public Object[][] getSheetData(int sheetIndex) {

		// Get total rows and columns
		int rows = getTotalRow(sheetIndex);
		int cells = getTotaRows(sheetIndex);

		// Create a 2D Object array
		Object[][] data = new Object[rows][cells];

		// Read each cell value and store it in the array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				data[i][j] = getCellValue(sheetIndex, i, j);
			}
		}

		// Return the populated data
		return data;
	}
}