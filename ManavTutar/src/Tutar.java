import java.util.Scanner;
public class Tutar {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int a,e,d,m,p;
		double ar=2.14,el=3.67,dm=1.11,mz=0.95,pt=5.0,tutar;
		System.out.print("Armut kac kilo ?:");
		a=inp.nextInt();
		System.out.print("Elma kac kilo ?:");
		e=inp.nextInt();
		System.out.print("Domates kac kilo ?:");
		d=inp.nextInt();
		System.out.print("Muz kac kilo ?:");
		m=inp.nextInt();
		System.out.print("Patlican kac kilo ?:");
		p=inp.nextInt();
		if(a>=0 && e>=0 && d>=0 && m>=0 && p>=0) {
			tutar=a*ar+e*el+d*dm+m*mz+p*pt;
			System.out.print("Toplam tutar:"+tutar+" TL");
		}
		else {
			System.out.println("kilo degeri negatif sayi olamaz!");
		}
		inp.close();
	}
}
