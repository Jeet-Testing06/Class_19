// Data Driven read from excel


package data_Driven;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ClassB {

	@Test(dataProvider="data_1")
	public void tc(String Username, String Password)
	{
		
		System.out.println(Username);
		System.out.println(Password);
		
	}
	
	@DataProvider
	public Object[][] data_1() throws BiffException, IOException
	{
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\JeetHomeWork1.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		Object[][] ob = new Object[r][c];
		
		for (int i=0; i<r; i++)
		{
			for (int j=0; j<c; j++)
			{
				
				Cell c1 = ws.getCell(j, i);
				ob[i][j] = c1.getContents();
					
			}	
		}
			
	return ob;	
	}
	
}