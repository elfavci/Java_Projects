import java.util.Scanner;
public class Digit {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int number,tempNumber,digTotal=0,basValue,basNumber = 0;
		
		  System.out.print("Enter the number :");
	        number = inp.nextInt();
	        tempNumber = number;
	        while (tempNumber != 0) {
	        	tempNumber /= 10;
	            basNumber++;
	        }
	        for(int i=0;i<basNumber;i++) {
	           basValue=number%10;
	           digTotal+=basValue;
	           number=number/10;
		    }
	        System.out.println(digTotal);
		inp.close();
	}
}
