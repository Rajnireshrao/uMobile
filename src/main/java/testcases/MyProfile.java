package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.Dashboard_Page;
import pages.HomePage;
import pages.Menu_Options;
import pages.My_ProfilePage;
import wrappers.Annotations;


//TC002 - Check all the values in Active_Postpaid_E28 credentials are correct and Edit and update fields.

public class MyProfile extends Annotations
{
	//@BeforeTest public void setData() { excelFileName = "TC001"; }
	
	@Test(priority = 0)
	@Description("Enter all mandatory fields")
	public void Edit_MyProfile() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.EnterMobileNumber()
		.EnterPin();
		new Dashboard_Page()
		.menu_button_click();
		new Menu_Options()
		.My_Account_My_Profile_Button()
		.editProfile();
		//new My_ProfilePage()
		//.VerifyEditedDetails();
		//.Click_Send_Button();
	}
	
	@Test(priority=1)
	@Description("Validate by not filling Mandatory values")
	public void Validate_My_Address() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.EnterMobileNumber()
		.EnterPin();
		new Dashboard_Page()
		.menu_button_click();
		new Menu_Options()
		.My_Account_My_Profile_Button()
		.validateMyAddress();
		//new My_ProfilePage()
		//.VerifyEditedDetails();
		//.Click_Send_Button();
	}
}
