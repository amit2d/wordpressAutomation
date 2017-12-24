package TestPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.DashboardPage;
import pages.Driver;
import pages.ListPostPage;
import pages.LoginPage;
import pages.NewPostPage;
import pages.PostType;
import pages.Postpage;

public class SmokeTests {

	@Before
	public void setUp() throws Exception {
		Driver.Initialize();
	}

	@After
	public void tearDown() throws Exception {
		Driver.close();
	}

	@Test
	public void AdminUserCanLoginTest() {
		
		LoginPage.goTo();
		LoginPage.loginAs("user").withPassword("S888B4sj").login();
		
		assertTrue(DashboardPage.isAt());
		
	}
	
	@Test
	public void createPostTest() throws InterruptedException
	{
		AdminUserCanLoginTest();
		
		NewPostPage.goTo();
		NewPostPage.CreatePost("This is the test post Title")
		.withBody("Hi, this is the body.")
		.publish();
		
		NewPostPage.goToNewPost();
		
		assertEquals("This is the test post Title", 
				Postpage.getTitle());
	}
	
	@Test
	public void CanEditSamplePost()
	{
		AdminUserCanLoginTest();
		
		ListPostPage.goTo(PostType.Page);
		ListPostPage.SelectPost("Sample Page");
		
		assertTrue(NewPostPage.isInEditMode());
		assertEquals("Sample Page", NewPostPage.getTitle());
	}

}
