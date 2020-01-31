package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.XlsReader;

public class TestUtil {
	static XlsReader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new XlsReader(
					"/home/admin1/Desktop/Automation/Automation/src/main/java/com/test/data/ebayTestData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int row = 2; row <= reader.getRowCount("RegdTestData"); row++) {
			String firstname=reader.getCellData("RegdTestData", "firstName", row);
			System.out.println(firstname);
			String lastname=reader.getCellData("RegdTestData", "lastName", row);
			String emailId=reader.getCellData("RegdTestData", "email",row);
			String passWord=reader.getCellData("RegdTestData", "password", row);
			//Object ob[]=new Object[];
			Object ob[]= {firstname,lastname,emailId,passWord};
			myData.add(ob);

		}
		return myData;

	}

}