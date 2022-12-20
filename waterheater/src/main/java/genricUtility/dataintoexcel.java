package genricUtility;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataintoexcel {
  public static void main(String [] args) throws IOException
  {
	  XSSFWorkbook wrk = new XSSFWorkbook();
	  
	XSSFSheet sheet = wrk.createSheet();
	DataFormatter dataa = new DataFormatter();
	
	Object empdata[][]= {{"name","id","phoneno"},
			             {"mad",101,97416},
			             {"man",102,996450},
			             {"kri",103,99635}
			             };
	int row=empdata.length;
	int col = empdata[0].length;
	System.out.println(row);
	System.out.println(col);
	
	
	for(int i=0;i<row;i++)
	{
		XSSFRow cureentrow = sheet.createRow(i);
		for(int j=0;j<col;j++)
		{
			XSSFCell cell = cureentrow.createCell(j);
			
			Object value = empdata[i][j];
			if(value instanceof String)
				cell.setCellValue((String) value);
			if(value instanceof Integer)
				cell.setCellValue((Integer) value);
			}
		
		
		}
	String path= "./src/test/resources/trailexcel.xlsx";
	
	FileOutputStream file =new FileOutputStream(path);
	wrk.write(file);
	
	wrk.close();
	}
}
			  
  

