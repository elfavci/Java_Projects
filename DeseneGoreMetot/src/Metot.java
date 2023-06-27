import java.util.Scanner;
public class Metot {
	  static void Pattern(int number) {
	        if (number <= 0) {
	            System.out.println(number);
	            return;
	        }
	        
	        System.out.println(number);
	        Pattern(number - 5);
	        System.out.println(number);
	    }

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int n = scan.nextInt();
	        Pattern(n);
	        scan.close();
	}
}
