public class Not_Square{ //3x3 ve 3x1 => 3x1
	//kare matris olmayan matrislerin carpimi:
	public static void main(String[] args) {
		int a[][] = {{5,8,-4},{6,9,-5},{4,7,-2}};
		int b[][] = {{2},{-3},{1}};
		matris_yaz(a);
		matris_yaz(b);
		Carp(a,b);
	}
	
	public static void Carp(int a[][] , int b[][]) {
		int  i ,j, k;
		int sonuc[][] = new int[3][1];
		
		for(i = 0; i <3; i++) {
			for(k = 0; k<1; k++) {
				for(j = 0; j<3; j++) {
					sonuc[i][k] += a[i][j]*b[j][k];
				}
			}
		}
		System.out.println("\n****matris carpimi****\n");
		for(i = 0; i<3; i++) {
			for(k = 0; k<1; k++) {
				System.out.printf("%d ", sonuc[i][k]);
			}
			System.out.printf("\n");
		}
	}
	
	public static void matris_yaz(int x[][]) {
		int i,j;
		System.out.println("\n****matris****\n");
		for( i= 0; i< x.length;i++) {
			for(j = 0; j<x[0].length;j++) {
				System.out.printf("%d " , x[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
