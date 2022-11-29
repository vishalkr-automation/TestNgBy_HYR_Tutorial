package package09;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Video_20_IntegrationOfExcelWithDataProvider {
	
	@DataProvider
	public String[][] readExcelData() throws IOException {
		File file=new File("./src/test/resources/ExcelTestData.xlsx");
		System.out.println(file.exists());
		FileInputStream fileInputStream=new FileInputStream(file);
		XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
		XSSFSheet xssfSheet=xssfWorkbook.getSheet("Sheet1");
		System.out.println(xssfSheet.getPhysicalNumberOfRows()); //Print all row Numbers
		System.out.println(xssfSheet.getLastRowNum());          //Exclude Header Row and Print the total number of rows
		
		int noOfRows=xssfSheet.getPhysicalNumberOfRows();
		int noOfColumns=xssfSheet.getRow(0).getLastCellNum();
		
		String[][] data=new String[noOfRows-1][noOfColumns];
		
		for (int i = 0; i < noOfRows-1; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				//System.out.println(xssfSheet.getRow(i).getCell(j).getStringCellValue());
				
				DataFormatter dataFormatter=new DataFormatter();    //DataFormatter Class Will read any Type of data
				//System.out.println(dataFormatter.formatCellValue(xssfSheet.getRow(i).getCell(j)));
				data[i][j]=dataFormatter.formatCellValue(xssfSheet.getRow(i+1).getCell(j));
			}
			//System.out.println();
		}
		
		xssfWorkbook.close();
		fileInputStream.close();
		return data;
	}
	
	@Test(dataProvider="readExcelData")
	public void f(String userName, String password) throws Exception {
		System.out.println(userName+">>"+password);
	}

}
