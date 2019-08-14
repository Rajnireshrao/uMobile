package testcases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.HomePage;
import wrappers.Annotations;

public class ForgetPassword extends Annotations {

	@Test(priority = 0)
	@Description("Enter valid mobile number for forget password")
	public void Forget_Password() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.ForgetPassword();
	}
}
