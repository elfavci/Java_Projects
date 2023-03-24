import java.util.Scanner;
public class GradeAvg {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int mat,fiz,kim,tur,tar,muz;
		float avg;
		System.out.print("Matemetik ders notu:");
		mat=input.nextInt();
		System.out.print("Fizik ders notu:");
		fiz=input.nextInt();
		System.out.print("Kimya ders notu:");
		kim=input.nextInt();
		System.out.print("Turkce ders notu:");
		tur=input.nextInt();
		System.out.print("Tarih ders notu:");
		tar=input.nextInt();
		System.out.print("Muzik ders notu:");
		muz=input.nextInt();
		
		avg= (mat+fiz+kim+tur+tar+muz)/6;
		System.out.print((avg>60)?"Sinifi gecti":"Sinifta kaldi");
		input.close();

	}

}
