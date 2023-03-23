import java.util.Scanner;
public class KDVhesap {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		double money,calc,calcTwo,price,priceTwo;
		System.out.print("Money:");
		money=inp.nextDouble();
		System.out.println(money<0?"":"price without VAT: "+money);
		calc=(1+0.18)*money;
		price=calc-money;
		calcTwo=(1+0.08)*money;
		priceTwo=calcTwo-money;
		System.out.println(money<0?"cannot be less then zero":money>1000?"price with VAT= "+calcTwo+"\nVAT rate=0.08"+"\nVAT price="+priceTwo:
				"price with VAT="+calc+"\nVAT rate=0.18"+"\nVAT price="+price);
	}
}
