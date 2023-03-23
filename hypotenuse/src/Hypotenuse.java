
import java.util.Scanner;
public class Hypotenuse {
		
	public static void main(String[] args) {
		int f,s,t,u;
		double area;
		Scanner input= new Scanner(System.in);
		System.out.print("enter the first side of the triangle:");
		f=input.nextInt();
		System.out.print("enter the second side of the triangle:");
		s=input.nextInt();
		System.out.print("enter the third side of the triangle:");
		t=input.nextInt();
		u=(f+s+t)/2;
		area=Math.sqrt(u*(u-f)*(u-s)*(u-t));
		System.out.print("area of ​​triangle="+area);
	}
}
