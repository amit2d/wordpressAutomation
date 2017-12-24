package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginCommand {

	private String userName;
	private String passWord;

	public LoginCommand(String username) {
		
		this.userName = username;
	}

	public LoginCommand withPassword(String password) {
		
		this.passWord = password;
		return this;
	}

	public void login() {
		
		WebElement element = Driver.Instance.findElement(By.id("user_login"));
		element.sendKeys(userName);
		
		element = Driver.Instance.findElement(By.id("user_pass"));
		element.sendKeys(passWord);
		
		element.submit();
	}

}
