import java.util.Scanner;
public class Kitle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("kilonuzu girin:");
		int kilo = scanner.nextInt();
		System.out.print("boyunuzu girin:(metre cinsinden ornek 1,72)");
		double boy = scanner.nextDouble();
		
		double bki = kilo/(boy*boy);
		System.out.print("beden kitle indeksiniz:" + bki);
		scanner.close();
	}
}
