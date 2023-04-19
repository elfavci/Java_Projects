import java.util.Scanner;
public class FindHoroscope {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int birthday;
		String month;
		System.out.print("Enter your month of birth: ");
		month=inp.nextLine();
		System.out.print("Enter your birthday: ");
		birthday=inp.nextInt();
		
		if(month.equals("january")){
			if(birthday>=1 && birthday<=21) {
				System.out.print("Capricorn");
			}
			else if(birthday<=31) {
				System.out.print("Aquarius");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("february")){
			if(birthday>=1 && birthday<=19) {
				System.out.print("Aquarius");
			}
			else if(birthday<=28) {
				System.out.print("Pisces");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("march")){
			if(birthday>=1 && birthday<=20) {
				System.out.print("Pisces");
			}
			else if(birthday<=31) {
				System.out.print("Aries");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("april")){
			if(birthday>=1 && birthday<=20) {
				System.out.print("Aries");
			}
			else if(birthday<=30) {
				System.out.print("Taurus");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("may")){
			if(birthday>=1 && birthday<=21) {
				System.out.print("Taurus");
			}
			else if(birthday<=31) {
				System.out.print("Gemini");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("june")){
			if(birthday>=1 && birthday<=22) {
				System.out.print("Gemini");
			}
			else if(birthday<=30) {
				System.out.print("Cancer");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("july")){
			if(birthday>=1 && birthday<=22) {
				System.out.print("Cancer");
			}
			else if(birthday<=31) {
				System.out.print("Leo");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("august")){
			if(birthday>=1 && birthday<=22) {
				System.out.print("Leo");
			}
			else if(birthday<=31) {
				System.out.print("Virgin");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("september")){
			if(birthday>=1 && birthday<=22) {
				System.out.print("Virgin");
			}
			else if(birthday<=30) {
				System.out.print("Scales");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("october")){
			if(birthday>=1 && birthday<=22) {
				System.out.print("Scales");
			}
			else if(birthday<=31) {
				System.out.print("Scorpio");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("november")){
			if(birthday>=1 && birthday<=21) {
				System.out.print("Scorpio");
			}
			else if(birthday<=30) {
				System.out.print("Sagittarius");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		else if(month.equals("december")){
			if(birthday>=1 && birthday<=21) {
				System.out.print("Sagittarius");
			}
			else if(birthday<=31) {
				System.out.print("Capricorn");		
			}
			else {
				System.out.print("wrong value");
			}
		}
		inp.close();
	}
}
