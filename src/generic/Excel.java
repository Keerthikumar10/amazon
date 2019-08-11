package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Auto_const  {
	
public static String getData(String sheet,int row,int cell)
{
	String val="";
	
	try
	{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
	val = c.toString();
	}
	catch(Exception e)
	{
		Reporter.log("invalid path", true);
	}
	return val;
	
}

}
