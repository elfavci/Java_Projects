import java.util.Scanner;
public class Daire {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double r,a,alan,pi=3.14;
		System.out.println("dairenin yariçapini girin:");
		r=in.nextDouble();
		System.out.println("dairenin merkez açısını girin:");
		a=in.nextDouble();
		alan=(pi*(r*r)*a)/360;
		System.out.println(alan);
		in.close();
	}
}
