import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		int n,total=0;
		Scanner input=new Scanner(System.in);
		do {
			System.out.println("Enter the number:");
			n=input.nextInt();
			if(n%4==0) {
				total=total+n;
			}
		}while(n%2!=1);
		System.out.println("Total = " +total);
		input.close();
	}
}
