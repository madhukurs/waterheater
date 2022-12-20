package genricUtility;

import org.Hrm.Addbranches;
import org.Hrm.Addemployeefiled;
import org.Hrm.DeleteCorporate;
import org.Hrm.Homepage;
import org.Hrm.Loginpage;
//import org.Hrm.Homepage;
//import org.Hrm.Loginpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
// make changes in base class in second workspace
public class Baseclass {


	public WebDriver dri;
	String url;
	String Hrmail;
	String password;
	protected	String empid;
	protected	String firstname ;
	protected	String lastname;
	protected	String middlename;
	protected	String datefrom;
	protected	String recentdate;
	protected	String position;
	protected	String contact;
	protected String sss;
	protected	String tin;
	protected	String hdmf_pagibig;
	protected	String gsis;
	protected	String files;
	protected	String filesss;
	protected String branchnm;
	protected Loginpage lo;
	protected  Homepage hm;
	protected  Addemployeefiled addemp;
	protected	Webdriverutility web;
	protected Addbranches addbran;
	protected DeleteCorporate     delcor;



	@BeforeClass
	public void setup()
	{ 


		url = new  PropertyFile().getDataFromPropertyFile(IconstantPath.PROPERTY_FILE_PATH ,"url");
		Hrmail = new  PropertyFile().getDataFromPropertyFile(IconstantPath.PROPERTY_FILE_PATH ,"Hrmail");
		password = new   PropertyFile().getDataFromPropertyFile(IconstantPath.PROPERTY_FILE_PATH ,"password");


		web = new Webdriverutility();
		//dri=web.launchBrowser("chrome");
		web.openBrowserWithApplication("chrome",dri, 10, url);


		Excelfile exc = new Excelfile();

		empid =exc.Getdatafromexcel("Employee Details", 1, 0);
		firstname =exc.Getdatafromexcel("Employee Details", 1, 1);
		lastname =exc.Getdatafromexcel("Employee Details", 1, 2);
		middlename =exc.Getdatafromexcel("Employee Details", 1, 3);
		datefrom =exc.Getdatafromexcel("Employee Details", 1, 4);
		recentdate =exc.Getdatafromexcel("Employee Details", 1, 5);
		position =exc.Getdatafromexcel("Employee Details", 1, 6);
		contact =exc.Getdatafromexcel("Employee Details", 1, 7);
		sss =exc.Getdatafromexcel("Employee Details", 1, 8);
		tin =exc.Getdatafromexcel("Employee Details", 1, 9);
		hdmf_pagibig =exc.Getdatafromexcel("Employee Details", 1, 10);
		gsis =exc.Getdatafromexcel("Employee Details", 1, 11);
		files =exc.Getdatafromexcel("addingfiles", 1, 1);
		filesss =exc.Getdatafromexcel("addingfiles", 2, 1);
		branchnm=exc.Getdatafromexcel("Employee Details", 3, 1);


		lo = new Loginpage(dri);
		hm = new Homepage(dri);
		addemp = new Addemployeefiled(dri);
		addbran=new Addbranches(dri);
		delcor= new DeleteCorporate (dri);

	}
	@BeforeMethod
	public void login()
	{
		lo.loginaction(Hrmail, password);
		lo.Hrtypedropdown("→ HR Head");
		lo.loginbutton();
		web. handlingpopul(dri);

	}
	@AfterMethod
	public void logout()
	{

		addemp.clickinglogout1();
		addemp.clickinglogout2();




	}

	@AfterClass

	public void closedirver()
	{
		web.closeBrowser(dri);
	}


 

}
