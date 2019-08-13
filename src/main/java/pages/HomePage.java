package pages;

import org.openqa.selenium.By;

import wrappers.Annotations;

public class HomePage extends Annotations

{
	public LoginPage HomePage_clikLogin()
	{
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.View")).click();
		System.out.println("Login button is clicked");	
		return new LoginPage();
	
	}
	}
	
	
	
	
	
	
	
	


