import java.util.Scanner;
public class PerfectNum {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int num,total=0;
		System.out.print("Enter the number:");
		num=inp.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				total+=i;
			}		
		}
		//System.err.println(total+" "+num); 
		if(total==num) {
			System.out.println("It is a Perfect Number");
		}
		else {
			System.out.println("It is not a Perfect Number");
		}
		inp.close();
	}
}
