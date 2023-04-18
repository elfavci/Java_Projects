import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int mat,fiz,turk,kim,muz,count=0;
		double avg,sonuc=0;
		System.out.println("Matematik notunuzu girin:");
		mat=inp.nextInt();
		System.out.println("Fizik notunuzu girin:");
		fiz=inp.nextInt();
		System.out.println("Turkce notunuzu girin:");
		turk=inp.nextInt();
		System.out.println("Kimya notunuzu girin:");
		kim=inp.nextInt();
		System.out.println("Muzik notunuzu girin:");
		muz=inp.nextInt();
		if(0<=mat && mat<=100) {
			sonuc=mat+sonuc;
		}
		else {
			count++;
		}
		if(0<=fiz && fiz<=100) {
			sonuc=fiz+sonuc;
		}
		else {
			count++;
		}
		if(0<=turk && turk<=100) {
			sonuc=turk+sonuc;
		}
		else {
			count++;
		}
		if(0<=kim && kim<=100) {
			sonuc=kim+sonuc;
		}
		else {
			count++;
		}
		if(0<=muz && muz<=100) {
			sonuc=muz+sonuc;
		}
		else {
			count++;
		}
		avg=sonuc/(5-count);
		if(avg>=55) {
			System.out.println("Tebrikler gectiniz. Notunuz = "+avg);
		}
		else {
			System.out.println("Maalesef gecemediniz. Notunuz = "+avg);
		}
		inp.close();
	}
}
