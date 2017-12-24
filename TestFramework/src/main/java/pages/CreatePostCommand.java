package pages;

import org.openqa.selenium.By;

public class CreatePostCommand {
	
	private String title;
	private String body;
	
	

	public CreatePostCommand(String Title) {
	
		this.title = Title;
	}



	public CreatePostCommand withBody(String Body) {

		this.body = Body;
		return this;
	}



	public void publish() throws InterruptedException {

		Driver.Instance
		.findElement(By.id("title")).sendKeys(title);
		
		Driver.Instance
		.switchTo().frame("content_ifr");
		Driver.Instance
		.switchTo().activeElement().sendKeys(body);
		Driver.Instance
		.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		Driver.Instance
		.findElement(By.id("publish")).click();
	}

}
