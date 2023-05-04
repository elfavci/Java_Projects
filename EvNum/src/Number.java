import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num,i=0,counter=0,sum=0,avg=0;
		System.out.print("Deger gir:");
		num=input.nextInt();
		System.out.println("---3'e ve 4'e bolunen sayilar---");
		while(i<num) {
			if(i%3==0 && i%4==0) {
				System.out.println("i = " +i);
				sum=sum+i;
				counter=counter+1;	
				
			}
			i++;
		}
		avg=sum/counter;
		System.out.println("Ortalama = "+avg);
		input.close();
	}
}
