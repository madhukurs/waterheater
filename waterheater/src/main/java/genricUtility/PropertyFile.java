package genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
		public  String getDataFromPropertyFile(String PropertyFilePath,String Key)
		{
			FileInputStream fis = null;
			try {
				fis=new FileInputStream(PropertyFilePath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Properties pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String v = pro.getProperty(Key).trim();
			return v;
			
		}

	}


