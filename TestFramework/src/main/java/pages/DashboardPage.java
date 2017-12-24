package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	public static boolean isAt() {

		WebElement element = Driver.Instance.findElement(By.tagName("H1"));
		
		if ("Dashboard".equals(element.getText()))
			return true;
		else 
			return false;
	}

}
