package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password) {
		// Match a fixed user name and password.
		//
		if ("akshar".equals(username) && "akshar123".equals(password)) {
			return true;
		}
		return false;
	}
	
	
}
