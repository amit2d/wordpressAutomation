package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Postpage {

	public static Object getTitle() {
		
		WebElement element = 
		Driver.Instance
		.findElement(By.className("entry-title"));
		
		if (element.getText() != null)
			return element.getText();
		else 
			return "";
	}

}
