import java.util.Scanner;
public class Power {

	static int PowFunc(int a,int b) {
		  if (b == 0) {
	            return 1;
	        }
	        return a * PowFunc(a, b - 1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Us degeri giriniz :");
        int power=scan.nextInt();
        System.out.println(PowFunc(base, power));
	}
}
