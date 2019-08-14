package pages;

import org.openqa.selenium.By;

import wrappers.Annotations;

public class SettingPage extends Annotations

{
	public void ChangePIN() {
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
		System.out.println("Change Password button is clicked");
		
	}

	
}
