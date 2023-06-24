import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		int k;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number for the base:");
		k=input.nextInt();
		for(int i=0;i<k;i++) {
			for(int j=i; j<k;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
