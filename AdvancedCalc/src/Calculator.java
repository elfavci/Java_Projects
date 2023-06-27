import java.util.Scanner;

public class Calculator {
	static void plus() {
		Scanner scanner= new Scanner(System.in);
		int number,result=0,i=1;
		while(true) {
			System.out.print(i++ +".sayi : ");
			number=scanner.nextInt();
			if(number==0) {
				break;
			}
			result+=number;
		}
		System.out.println("Sonuc : " + result);
		
	}
	
	static void minus() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kac adet sayi gireceksiniz : ");
		int counter=scanner.nextInt();
		int number,result=0;
		
		for(int i=1;i<=counter;i++) {
			System.out.print(i + ".sayi : ");
			number=scanner.nextInt();
			if(i==1) {
				result+=number;
				continue;
			}
			result-=number;
		}
		System.out.println("Sonuc : " + result);
		
	}
	
	static void times() {
		Scanner scanner=new Scanner(System.in);
		int number,result=1,i=1;
		
		while(true) {
			System.out.print(i++ + ".sayi : ");
			number=scanner.nextInt();
			
			if(number==1) {
				break;
			}
			if(number==0) {
				result=0;
				break;
			}
			result*=number;
		}
		System.out.println("Sonuc : " + result);
		
	}

	static void divided() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kac adet sayi gireceksiniz : ");
		int counter=scanner.nextInt();
		double number,result=0.0;
		
		for(int i=1;i<=counter;i++) {
			System.out.print(i + ". sayi : ");
			number=scanner.nextDouble();
			if(i!=1 && number==0) {
				System.out.println("Boleni 0 giremezsiniz");
				continue;
			}
			if(i==1) {
				result=number;
				continue;
			}
			result/=number;
		}
		System.out.println("Sonuc : " + result);
		
	}
	
	static void power() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Taban degerini giriniz : ");
		int base=scanner.nextInt();
		System.out.print("Us degeri giriniz : ");
		int exponent=scanner.nextInt();
		int result=1;
		
		for(int i=1;i<=exponent;i++) {
			result*=base;
		}
		System.out.println("Sonuc : " + result);
		
	}
	
	static void factorial() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		int n=scanner.nextInt();
		int result=1;
		
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		System.out.println("Sonuc : " + result);
		
	}
	
	static void mode() {
		Scanner scanner=new Scanner(System.in);
		int num1,num2,result=0;
		System.out.print("Bolunen sayiyi giriniz : ");
		num1=scanner.nextInt();
		System.out.print("Bolen sayiyi giriniz : ");
		num2=scanner.nextInt();
        result=num1%num2;
		System.out.println("Sonuc : " + result);
		
	}
	
	static void rectangular() {
		Scanner scanner=new Scanner(System.in);
		int a,b,choose,result;
		System.out.println("Dikdortgenin buyuk kenar degerini giriniz : ");
		a=scanner.nextInt();
		System.out.println("Dikdortgenin kucuk kenar degerini giriniz : ");
		b=scanner.nextInt();
		if (a == 0 || b == 0){
            System.out.print("Uzunluk degeri 0 olamaz ");
            rectangular();
        }
		else {
			System.out.print("Yapmak istediginiz islemi giriniz.\n"+"Cevre hesaplama icin 1'e tiklayiniz\n"+"Alan hesaplamak icin 2'ye tiklayiniz.");
			choose=scanner.nextInt();
		 
			if(choose==1) {
				result=(a+b)*2;
				System.out.println("Dikdortgenin Cevresi : "+ result);
			}
			else if(choose==2) {
				result=(a*b);
				System.out.println("Dikdortgenin Cevresi : "+ result);
			}
			else {
				System.out.print("Hatali deger girdiniz.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";
        
        do {
            System.out.println(menu);
            System.out.print("Lutfen bir islem seciniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                	mode();
                	break;
                case 8:
                	rectangular();
                	break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
	}
}
