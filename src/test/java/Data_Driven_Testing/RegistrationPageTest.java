package Data_Driven_Testing;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest {

	

	@Test(dataProvider = "data")
	public void testRegistration(String fname, String lname, String phone, String email) {

		System.out.println(fname + " " + lname + " " + " " + phone + " " + email);
	}

	@DataProvider(name = "data")
	public Object[][] getSheetData() throws IOException {
		ExcelReader reader = new ExcelReader("C:\\Users\\DELL\\eclipse-workspace\\RestAssuredProject\\resources\\TestData.xlsx");

		Object[][] data = reader.getSheetData(0);
		
		System.out.println("File Data: "+data);

		return data;
	}

}
