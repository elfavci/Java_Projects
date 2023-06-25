import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int number,total=0,first=0,second=1,i;
		System.out.print("Number of elements: ");
		number=inp.nextInt();
		inp.close();
		System.out.print(first+" "+second);
		for(i=2;i<=number;i++) {
			total=first+second;
			System.out.print(" "+total);
			first=second;
			second=total;
		}	
	}
}