import java.util.Scanner;
public class NumberSorting {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int x,y,z;
		System.out.print("Enter first number:");
		x=inp.nextInt();
		System.out.print("Enter second number:");
		y=inp.nextInt();
		System.out.print("Enter third number:");
		z=inp.nextInt();
		if(x>y && x>z) {
			if(y>z) {
				System.out.println(z+"<"+y+"<"+x);
			}
			else if(z>y) {
				System.out.println(y+"<"+z+"<"+x);
			}
			else {
				System.out.println("Two numbers are equal");
			}
		}
		else if(y>x && y>z) {
			if(x>z) {
				System.out.println(z+"<"+x+"<"+y);
			}
			else if(z>x) {
				System.out.println(x+"<"+z+"<"+y);
			}
			else {
				System.out.println("Two numbers are equal");
			}	
		}
		else if(z>x && z>y) {
			if(x>y) {
				System.out.println(y+"<"+x+"<"+z);
			}
			else if(y>x) {
				System.out.println(x+"<"+y+"<"+z);
			}
			else {
				System.out.println("Two numbers are equal");
			}
		}
		else if(x==y && y==z) {
			System.out.println("Three numbers are equal");
		}
		else {
			System.out.println("Two numbers are equal");
		}
		inp.close();
	}
}
