package com.datadriven.test;

import com.excel.utility.XlsReader;

public class ExcelOperations {
	public static void main(String[] args) {
		XlsReader reader = new XlsReader(
				"/home/admin1/Desktop/Automation/Automation/src/main/java/com/test/data/ebayTestData.xlsx");
//		reader.addSheet("executeData");
		if (!reader.isSheetExist("previousData")) {
			reader.addSheet("previousData");
		}
		int countColoumn=reader.getColumnCount("RegdTestData");
		System.out.println("total column number="+countColoumn);
	}
}
