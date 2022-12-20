package genricUtility;

import org.testng.ITestResult;

public class RertryImplementation {
	
	int count =0;
	int maxRetries=4;
	
	public boolean retry(ITestResult result)
	{
		if(count<maxRetries)
		{
			count++;
			return true;
			
		}
		return false;
	}

}
