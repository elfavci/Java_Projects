import java.util.Scanner;
public class PrimeRecursive {
	
	static boolean isPrime(int a,int i) {
		if (a < 2) {
	         return false;
	    }
	    if (a == 2){ 
	         return true;
	    }
	    if (a % i == 0) {
            return false;
        }
        if (i*i>a){ 
            return true;
        }
        return isPrime(a, i +1);
    }

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("Enter the number :");
		number=scanner.nextInt();
		if (isPrime(number,2)){
            System.out.println(number + " it is a prime number.");
        } else {
            System.out.println(number + " it is not a prime number.");
        }
		scanner.close();
	}
}
