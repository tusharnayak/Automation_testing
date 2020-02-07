package com.excelreport.qa;

import org.automationtesting.excelreport.Xl;

public class GenerateReport {

	public static void main(String[] args) throws Exception {
//	     Xl.generateReport("excel-report.xlsx");
		Xl.generateReport("/home/admin1/Desktop/abc/", "excel-report.xlsx");

	}

}
