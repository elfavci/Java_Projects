import java.util.Scanner;
public class Heat {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int heat;
		System.out.println("Enter temperature value:");
		heat=inp.nextInt();
		if(heat<5) {
			System.out.println("You can go skiing");
		}
		else if(heat>=5 && heat<15) {
			System.out.println("You can go to the cinema");
		}
		else if(heat>=15 && heat<=25) {
			System.out.println("You can go on a picnic");
		}
		else {
			System.out.println("You can go swimming");
		}
		inp.close();
	}
}
