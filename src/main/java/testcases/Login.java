package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.HomePage;
import pages.LoginPage;
import wrappers.Annotations;

// TC001 - Login with valid Active_Postpaid_E28 credentials


public class Login extends Annotations {
	
	// @BeforeTest public void setData() { excelFileName = "TC001"; }
	 
	
	@Test(priority =0)
	@Description("Login with valid credentials")
	public void Login_with_valid_credentials() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.EnterMobileNumber()
		.EnterPin();
		//.Click_Send_Button();
	}
	
	
	@Test(priority =1)
	@Description("Login with In-valid credentials")
	public void Login_with_Invalid_credentials() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.Invalid_NUmber()
		.Invalid_Pin()
		.Get_ErrorAlert_InvalidCredentials();
		//.Click_Send_Button();
	}
	
	
	@Test(priority =2)
	@Description("Login with Invalid pin")
	public void Login_with_Invalid_MobileNumber() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.EnterMobileNumber()
		.Invalid_Pin();
		
		//.Click_Send_Button();
	}
	
	
	
	

}
