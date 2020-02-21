package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<User> userAuth = user -> user.getUsername().equals("Nag") && user.getPwd().equals("java");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter User Name");

		String userName = sc.next();

		System.out.println("Enter User Pasword");

		String Password = sc.next();
		
		
		User user =new User(userName, Password);
		if(userAuth.test(user))
		{
			System.out.println("Valid User......login suceess....");
		}
		else
		{
			System.out.println("Not Valid user... please login again....");
		}
		sc.close();

	}

}

class User {
	String username;
	String pwd;

	User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
