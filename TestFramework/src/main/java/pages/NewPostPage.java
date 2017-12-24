package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewPostPage {

	public static void goTo() {
	
		WebElement element = Driver.Instance
				.findElement(By.linkText("Posts"));
		element.click();
		
		element = Driver.Instance
				.findElement(By.linkText("Add New"));
		element.click();
	}

	public static CreatePostCommand CreatePost(String Title) {
		
		return new CreatePostCommand(Title);
	}

	public static void goToNewPost() {
		
		Driver.Instance
		.findElement(By.linkText("View post")).click();
		
	}

	public static boolean isInEditMode() {
		
		
		return (Driver.Instance.findElement(By.tagName("H1")).getText().equals("Edit Page"));
		
	}

	public static String getTitle() {
		
		WebElement element = Driver.Instance.findElement(By.id("title"));
		String title = element.getAttribute("value");
		return title;

	}

}
