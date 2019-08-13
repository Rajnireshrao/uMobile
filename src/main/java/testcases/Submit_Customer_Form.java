package testcases;

import org.testng.annotations.Test;

import pages.Dashboard_Page;
import pages.HomePage;
import pages.customer_support_form;
import wrappers.Annotations;

public class Submit_Customer_Form extends Annotations
{
	@Test()
	public void Login_with_valid_credentials() throws Exception {
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
}
