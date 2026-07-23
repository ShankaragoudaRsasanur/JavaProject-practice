package strings;

public class login {

	public static void main(String[] args) {
		String username = "admin";
        String password = "Java123";

        if (username.equals("admin") && password.equals("Java123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
	}
	}