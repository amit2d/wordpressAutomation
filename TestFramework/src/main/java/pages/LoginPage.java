package pages;

public class LoginPage {

	public static void goTo() {
	
		Driver.Instance.get("http://127.0.0.1/wordpress/wp-login.php");
	}

	public static LoginCommand loginAs(String username) {
	
		return new LoginCommand(username);
	}

}
