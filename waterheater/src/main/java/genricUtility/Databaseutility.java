package genricUtility;

import java.sql.Array;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;
/**
 * This class contains of methods to handle database operations
 * @author madhu
 *
 */
public class Databaseutility 
{
	// public List<String> empnames;
	
       Connection connection;
    /**
     * This method is used to fetch a complete column data from database   
     * @param query
     * @param columname
     * @return
     * @throws SQLException
     */
       
   public List<String> getdatafromdatabase(String query ,String columname)throws SQLException {
	Statement stm =connection. createStatement();
	ResultSet result = stm.executeQuery(query);
	ArrayList list=new ArrayList<>();
	while(result.next()) {
		list.add(result.getString(columname));
	}
	return list;
   }
   
   
   
   
   public void opendbconnection(String url,String username,String password) throws SQLException
   {
	   Driver drii = new Driver();
	   DriverManager.registerDriver(drii);
	   connection=DriverManager.getConnection(url, username, password);
   }
   
   
	
   public void modifingdata(String query) throws SQLException
   {
	Statement s1 = connection.createStatement();
	s1.executeUpdate(query);
	
   }
   
   /**
    * 
    * @param query
    * @param columname
    * @param Excepteddata
    * @return
    * @throws SQLException
    */
   
   public boolean verifingdataindatabase(String query ,String columname,String Excepteddata) throws SQLException
   {
	 List<String>  list =getdatafromdatabase(query,columname);
	 boolean flag=false;
	 for(String actualData:list)
	 {
		 if(actualData.equalsIgnoreCase(Excepteddata));
		 {
		     flag=true;
		     break;
		 }
		 
			 
		 }
	 return flag;
	 }
   
   
 

  public void closingdb() throws SQLException
  {
 	connection.close();
  }
}