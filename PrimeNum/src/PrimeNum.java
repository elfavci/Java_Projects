//bug: koddaki mantiksal hatalara verilen ad
public class PrimeNum {

	public static void main(String[] args) {
		int number = -1;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Is not a prime number");
			return;
		}
		if(number < 1) {
			System.out.println("Invalid number");
			return;
		}
		
		for( int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Is a prime number");
		}
		else {
			System.out.println("Is not a prime number");
		}

	}

}
