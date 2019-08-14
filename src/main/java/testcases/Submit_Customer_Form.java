package testcases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.Dashboard_Page;
import pages.HomePage;
import pages.customer_support_form;
import wrappers.Annotations;

public class Submit_Customer_Form extends Annotations
{
	@Test(priority=0)
	@Description("Submit a form with all mandatory fields")
	public void Submit_Form() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.EnterMobileNumber()
		.EnterPin();
		new Dashboard_Page()
		.menu_button_click()
		.Support();
		new customer_support_form()
		.Submit_a_form_in_customer_support();
		
	}
	
//	@Test(priority=1)
//	@Description("Submit a form with null issue type")
//	public void Submit_Form_With_Null_Issue() throws Exception {
//		new HomePage()
//		.HomePage_clikLogin()
//		.EnterMobileNumber()
//		.EnterPin();
//		new Dashboard_Page()
//		.menu_button_click()
//		.Support();
//		new customer_support_form()
//		.Submit_a_form_with_Null_Issue_Type();
//		
//	}
//	
//	@Test(priority=2)
//	@Description("Submit a form with null feedback")
//	public void Submit_Form_With_Null_Feedback() throws Exception {
//		new HomePage()
//		.HomePage_clikLogin()
//		.EnterMobileNumber()
//		.EnterPin();
//		new Dashboard_Page()
//		.menu_button_click()
//		.Support();
//		new customer_support_form()
//		.Submit_a_form_with_Null_feedback();
//		
//	}
}
