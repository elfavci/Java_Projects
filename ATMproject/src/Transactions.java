import java.util.Scanner;
public class Transactions {

	public static void main(String[] args) {
		String userName,password;
		Scanner inp=new Scanner(System.in);
		int right=3; //giris hakki
		int balance=1500; //bakiye
		int select; //secim
		boolean cikis = false;
		while(right>0) {
			System.out.println("User name: ");
			userName=inp.nextLine();
			System.out.println("Password: ");
			password=inp.nextLine();
			
			if(userName.equals("darkElf") && password.equals("9dark9")) {
				System.out.println("Hello,welcome to Coding bank");
				while(!cikis) {
					System.out.println("1-Deposit\n"+"2-Withdraw\n"+"3-Balance\n"+"4-Log out\n");
					System.out.print("Select the action you want to do: ");
					select = inp.nextInt();
                 
					switch (select) {
						case 1:System.out.print("Amount of money : ");
							   int price = inp.nextInt();
							   balance += price; break;
						case 2: System.out.print("Amount of money : ");
                				int money = inp.nextInt();
                				if (money > balance) {
                					System.out.println("Insufficient balance.");
                				} 
                				else {
                					balance -= money;
                				}break;
						case 3:System.out.println("Your balance : " + balance);break;
						case 4:cikis = true;
								System.out.println("See you soon...");break;
						default:System.out.println("Invalid transaction");break;
					}
				}
				right=0;
			}
			else {
				 right--;
	             System.out.println("Wrong username or password. Try again.");
	             if (right == 0) {
	                    System.out.println("Your account has been blocked, please contact the bank.");
	             } else {
	                    System.out.println("Your remaining right : " + right);
	             }
			}
		}
		inp.close();
	}
}
