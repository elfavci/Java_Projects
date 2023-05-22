import java.util.Scanner;
public class Mfind {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int n,num;
		System.out.print("How many numbers will you enter: ");
		n=inp.nextInt();
		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++) {
        	System.out.print(i+". number:");
        	num=inp.nextInt();
        	if(num<min) {
        		min=num;
        	}
        	if(num>max) {
        		max=num;
        	}
        }
        System.out.println("Minimum number: "+min);
        System.out.print("Maximum number: "+max);
		inp.close();
	}
}
