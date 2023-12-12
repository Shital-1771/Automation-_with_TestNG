package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annot {
	
	@Test
	public void testCase1(){
		//selenium code composemail
		System.out.println("composemail");
	}
	@BeforeMethod
	public void bmethod(){
		System.out.println("OpenBrowser,Enter url, Login");
	}
	
	@AfterMethod
	public void amethod(){
		System.out.println("logout,CloseBrowser");
	}
	@Test
	public void testCase2(){
		//selenium code Savemail
		System.out.println("Savemail");
	}
	@BeforeClass
	public void bclass(){
		System.out.println("Start server...");
	}
	@AfterClass
	public void aclass(){
		System.out.println("Shutdown server...");
	}
	@Test
	public void testCase3(){
		//selenium code Deletemail
		System.out.println("Deletemail");
	}



}
