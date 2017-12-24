package pages;

import org.openqa.selenium.By;

public class ListPostPage {
	
	public static void goTo(PostType post)
	{
		switch(post)
		{
		case Page:
			Driver.Instance.findElement(By.linkText("Pages")).click();
			Driver.Instance.findElement(By.linkText("All Pages")).click();
			break;
		
		}
	}

	public static void SelectPost(String title) {
		
		Driver.Instance.findElement(By.linkText("Sample Page")).click();
		
	}
	
	

}
