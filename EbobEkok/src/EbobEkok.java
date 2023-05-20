import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int numOne,numTwo,ebob=1,ekok=1;
		System.out.print("Enter the number one: ");
		numOne=inp.nextInt();
		System.out.print("Enter the number two: ");
		numTwo=inp.nextInt();
		int i=1,k=1;
		while(i<=numOne || i<=numTwo) {
			if(numOne%i==0 && numTwo%i==0) {
				ebob=i;
			}
			i++;
		}
		while(k<=(numOne*numTwo)) {
			if(k%numOne==0 && k%numTwo==0) {
				ekok=k;
				System.out.println("EKOK: "+ekok);
				break;
			}
			k++;
		}
		System.out.println("EBOB: "+ebob);	
		inp.close();
	}
}
