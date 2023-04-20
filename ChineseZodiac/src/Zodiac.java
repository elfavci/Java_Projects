import java.util.Scanner;
public class Zodiac {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int date,value;
		System.out.print("Enter your birthyear: ");
		date=inp.nextInt();
		value=date%12;
		switch (value) {
			case 0: System.out.print("Monkey");break;
			case 1: System.out.print("Cockerel");break;
			case 2: System.out.print("Dog");break;
			case 3: System.out.print("Pig");break;
			case 4: System.out.print("Mouse");break;
			case 5: System.out.print("Ox");break;
			case 6: System.out.print("Tiger");break;
			case 7: System.out.print("Rabbit");break;
			case 8: System.out.print("Dragon");break;
			case 9: System.out.print("Snake");break;
			case 10: System.out.print("Horse");break;
			case 11: System.out.print("Sheep");break;
			default:System.out.print("none");break;
		}
		inp.close();
	}
}
