package Data_Driven_Testing;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Reg1 {

	// Test method that receives data from the DataProvider
	@Test(dataProvider = "Data")
	public void testRegistration(String fname, String lname, String phone, String email) {

		// Print the data received from the Excel sheet
		System.out.println(fname + " " + lname + " " + phone + " " + email);
	}

	// DataProvider method to supply test data from the Excel file
	@DataProvider(name = "Data")
	public Object[][] getData() throws IOException {

		// Create an object of ExcelReader1 and load the Excel file
		ExcelReader1 reader = new ExcelReader1(
				"C:\\Users\\DELL\\eclipse-workspace\\RestAssuredProject\\resources\\TestData.xlsx");

		// Read all data from the first sheet (Sheet Index = 0)
		Object[][] data = reader.getSheetData(0);

		// Return the data to the test method
		return data;
	}
}