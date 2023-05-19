import java.util.Scanner;
public class UsluNum {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int a,b,exponent=1;
		System.out.print("Enter the number: ");
		a=inp.nextInt();
		System.out.print("Enter the base: ");
		b=inp.nextInt();
		for(int i=0;i<b;i++) {
			exponent*=a;
		}
		System.out.println("Exponential number= "+exponent);
		inp.close();
	}
}
