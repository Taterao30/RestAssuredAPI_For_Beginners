package Data_Driven_Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	static XSSFWorkbook workbook;

	public ExcelReader(String filePath) throws IOException

	{
		File file = new File(filePath);

		boolean flag = file.exists();

		System.out.println("File is present "+flag);
		
		System.out.println();
		FileInputStream fis = new FileInputStream(file);

		workbook = new XSSFWorkbook(fis);

		// Get total row count
	}

	public static int getTotalRow(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum() + 1;
	}

	// Get total cell count

	public static int getTotalCell(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

	public String getCellValue(int sheetIndex, int row, int cell) {
		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(cell).getStringCellValue();
	}

	// Reads all data from the sheet and stores it into a 2D Object array
	public Object[][] getSheetData(int sheetIndex) {

		// Get total rows in the sheet
		int Row = getTotalRow(sheetIndex);

		// Get total cells in the sheet
		int Cell = getTotalCell(sheetIndex);

		// Create a 2D array to store sheet data
		Object[][] data = new Object[Row][Cell];

		// Loop through all rows and cells
		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < Cell; j++) {

				// Store cell value into the array
				data[i][j] = getCellValue(sheetIndex, i, j);
			}
		}

		// Return populated data array
		return data;
	}

}
