import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		String user,pswd,npswd,choice;
		System.out.println("Enter your username:");
		user=inp.nextLine();
		System.out.println("Enter your password:");
		pswd=inp.nextLine();
		if(user.equals("darkelf") && pswd.equals("abcde123")) {
			System.out.println("Login successful :) ");
		}
		else if(pswd.equals("abcde123")){
			System.out.println("username is wrong!!");
		}
		else if(user.equals("darkelf")){
			System.out.println("Password is wrong!!");
			System.out.println("Do you want to reset password? (yes or no)");
			choice=inp.nextLine();
			if(choice.equals("yes")) {
				System.out.println("Enter the new password:");
				npswd=inp.nextLine();
				if(npswd.equals(pswd) || npswd.equals("abcde123")) {
					System.out.println("Could not create password, please enter another password.");
				}
				else {
					System.out.println("Password created");
				}
			}
			else {
				System.out.println("Goodbye...");
			}
		}
		else {
			System.out.println("Login failed");
		}
		inp.close();
	}
}
