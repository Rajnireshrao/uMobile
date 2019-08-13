package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.Annotations;

public class ForgetPassword extends Annotations {

	@Test()
	public void Forget_Password() throws Exception {
		new HomePage()
		.HomePage_clikLogin()
		.ForgetPassword();
	}
}
