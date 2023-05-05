import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		System.out.print("Enter the number:");
		n=input.nextInt();
		System.out.println("multiple of 4");
		for(int i=1; i<=n;i*=4) {
			System.out.println("i = "+i);
		}
		System.out.println("multiple of 5");
		for(int k=1;k<=n;k*=5) {
			System.out.println("k = "+k);
		}
		input.close();
	}
}