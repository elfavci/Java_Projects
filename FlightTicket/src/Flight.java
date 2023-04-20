import java.util.Scanner;
public class Flight {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int km,age,type;
		double trip,discount;
		System.out.print("Mesafeyi km turunden giriniz :");
		km=inp.nextInt();
		System.out.print("Yasinizi giriniz :");
		age=inp.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
		type=inp.nextInt();
		if(km>=0 && age>=0 && type==1 || type==2) {
			trip=km*0.10;
			if(age<12) {
				discount=trip*0.50;
				trip=trip-discount;
				if(type==2) {
					discount=trip*0.20;
					trip=(trip-discount)*2;
					System.out.println("Toplam Tutar = "+trip+" TL");
				}
				else {
					System.out.println("Toplam Tutar = "+trip+" TL");
				}
			}
			else if(age>=12 && age<=24) {
				discount=trip*0.10;
				trip=trip-discount;
				if(type==2) {
					discount=trip*0.20;
					trip=(trip-discount)*2;
					System.out.println("Toplam Tutar = "+trip+" TL");
				}
				else {
					System.out.println("Toplam Tutar = "+trip+" TL");
				}
			}
			else if(age>24 && age<=65) {
				if(type==2) {
					discount=trip*0.20;
					trip=(trip-discount)*2;
					System.out.println("Toplam Tutar = "+trip+" TL");
				}
				else {
					System.out.println("Toplam Tutar = "+trip+" TL");
				}
			}
			else if(age>65) {
				discount=trip*0.30;
				trip=trip-discount;
				if(type==2) {
					discount=trip*0.20;
					trip=(trip-discount)*2;
					System.out.println("Toplam Tutar = "+trip+" TL");
				}
				else {
					System.out.println("Toplam Tutar = "+trip+" TL");
				}
			}
		}
		else {
			System.out.println("Hatali Veri Girdiniz !");
		}
		inp.close();
	}
}
