import java.util.Scanner;
public class Combination {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int n,r,comb,nfact=1,rfact=1,s=0,sfact=1;
		System.out.print("n eleman sayisini girin:");
		n=inp.nextInt();
		System.out.print("r alt kume eleman sayisini girin(r'li kombinasyon): ");
		r=inp.nextInt();
		for(int i=1;i<=n;i++) {
			nfact=nfact*i;
		}
		for(int k=1;k<=r;k++) {
			rfact=rfact*k;
		}
		s=n-r;
		for(int p=1;p<=s;p++) {
			sfact=sfact*p;
		}
		comb=nfact/(rfact*sfact);
		System.out.println("Kombinasyon = "+comb);
		inp.close();
	}
}
