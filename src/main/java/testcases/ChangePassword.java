package testcases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.ChangePasswordPage;
import pages.Dashboard_Page;
import pages.HomePage;
import pages.SettingPage;
import wrappers.Annotations;

public class ChangePassword extends Annotations
{
	@Test(priority = 0)
	@Description("Change Password with valid Currenrt Pin, New Pin and Confirm New Pin")
	public void Change_Password() throws Exception {
	new HomePage()
	.HomePage_clikLogin()
	.EnterMobileNumber()
	.EnterPin();
	new Dashboard_Page()
	.menu_button_click()
	.Setting();
	new SettingPage()
	.ChangePIN();
	new ChangePasswordPage()
	.ChangePassword();
	
}
	@Test(priority = 1)
	@Description("Change Password with Invalid Currenrt Pin, New Pin and Confirm New Pin")
	public void Invalid_Current_Pin() throws Exception {
	new HomePage()
	.HomePage_clikLogin()
	.EnterMobileNumber()
	.EnterPin();
	new Dashboard_Page()
	.menu_button_click()
	.Setting();
	new SettingPage()
	.ChangePIN();
	new ChangePasswordPage()
	.ChangePasswordWithInvalidPin();
	
}
	
	@Test(priority = 2)
	@Description("Change Password with Invalid Currenrt Pin, New Pin and Confirm New Pin")
	public void Invalid_Confirm_Pin() throws Exception {
	new HomePage()
	.HomePage_clikLogin()
	.EnterMobileNumber()
	.EnterPin();
	new Dashboard_Page()
	.menu_button_click()
	.Setting();
	new SettingPage()
	.ChangePIN();
	new ChangePasswordPage()
	.ChangePasswordWithInvalidConfirmPin();
	
}
	
	@Test(priority = 3)
	@Description("Change Password with Invalid Currenrt Pin, New Pin and Confirm New Pin")
	public void Null_New_Pin() throws Exception {
	new HomePage()
	.HomePage_clikLogin()
	.EnterMobileNumber()
	.EnterPin();
	new Dashboard_Page()
	.menu_button_click()
	.Setting();
	new SettingPage()
	.ChangePIN();
	new ChangePasswordPage()
	.ChangePasswordWithNullNewPin();
	
}
	@Test(priority = 4)
	@Description("Change Password with Invalid Currenrt Pin, New Pin and Confirm New Pin")
	public void Null_New_ConfirmPin() throws Exception {
	new HomePage()
	.HomePage_clikLogin()
	.EnterMobileNumber()
	.EnterPin();
	new Dashboard_Page()
	.menu_button_click()
	.Setting();
	new SettingPage()
	.ChangePIN();
	new ChangePasswordPage()
	.ChangePasswordWithNullConfirmPin();
	
}
}
