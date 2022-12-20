package genricUtility;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getrandomnumbermethod(int limit)
	
	{
		Random ran = new Random();
		int rannum = ran.nextInt(limit);
		return rannum;
	}
	
	public String currentime()
	{
	        Date dat = new Date();
	     	SimpleDateFormat simpldate =new SimpleDateFormat("dd_mm_yyyy_hrs_min_sec");
		    String newdate = simpldate.format(dat);
		    return newdate;
	}  

}
