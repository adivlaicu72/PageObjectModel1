package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="bookNameDataProvider")
	public Object[][] bookNameDataProvider() {
		
		Object[][] data = new Object[5][2];
		
		data[0][0] = "The forest";
		data[0][1] = "book2.jpg";
		
		return data;
	}
}
