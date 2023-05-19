import java.util.Scanner;
public class DiaDraw {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the digits: ");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int p=n;p>=0;p--) {
			for(int y=1;y<=n-p;y++) {
				System.out.print(" ");
			}
			for(int x=1;x<=(2*p)-1;x++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		input.close();
	}
}
