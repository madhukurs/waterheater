package genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile 
{
	FileInputStream fis = null;

	public String Getdatafromexcel(String sheet,int rowNum,int cellNum)
	{
	 
	try {
		fis= new FileInputStream( IconstantPath.EXCEL_PATH);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Workbook wb=null;
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Sheet sheet1 = wb.getSheet(sheet);
		String data = new DataFormatter().formatCellValue(sheet1.getRow(rowNum).getCell(cellNum));
		return data;
	}
		
}
