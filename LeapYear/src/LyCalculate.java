import java.util.Scanner;
public class LyCalculate {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int year;
		System.out.println("Hesaplamak istedigin yili gir: ");
		year=inp.nextInt();
		if(year%100==0) {
			if(year%400==0) {
				System.out.println(year +" bir artik yildir !");
			}
			else {
				System.out.println(year+" bir artik yil degildir !");
			}
		}
		else if(year%100!=0) {
			if(year%4==0) {
				System.out.println(year +" bir artik yildir !");
			}
			else {
				System.out.println(year+" bir artik yil degildir !");
			}
		}
		else {
			System.out.println(year+" bir artık yil degildir !");
		}
		inp.close();
	}
}
