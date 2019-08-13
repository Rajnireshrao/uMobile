package pages;

import org.openqa.selenium.By;

import wrappers.Annotations;

public class Dashboard_Page extends Annotations {

	public Menu_Options menu_button_click() throws Exception {
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]")).click();
		
		Thread.sleep(5000);
		System.out.println("Menu button is clicked");
	
		return new Menu_Options();
		
	}
	
	
}
