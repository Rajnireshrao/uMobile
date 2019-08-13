package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.Annotations;

// TC001 - Login with valid Active_Postpaid_E28 credentials


public class Login extends Annotations {
	
	// @BeforeTest public void setData() { excelFileName = "TC001"; }
	 
	
	@Test()
	public void Login_with_valid_credentials() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.EnterMobileNumber()
		.EnterPin();
		//.Click_Send_Button();
	}
	
	
	
	
	
	
	
	
	
	

}
