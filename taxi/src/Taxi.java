import java.util.Scanner;
public class Taxi {

	public static void main(String[] args) {
		double price=2.20,sonuc,op=10;
		int km;
		Scanner in=new Scanner(System.in);
		System.out.println("kilometre:");
		km=in.nextInt();
		sonuc= op+price*km;
		if(sonuc>20) {
			System.out.println(sonuc+" TL odenecek");
		}
		else {
			System.out.println("20 TL odenecek");
		}
		in.close();
	}

}
