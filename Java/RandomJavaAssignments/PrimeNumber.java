
public class PrimeNumber {
	public static void main (String[] args) {
		final int NUMBER_OF_PRIMES = 50; //number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; //display 10 per line
		int count = 0; // count the number of prime numbers
		int number = 2; // a number to be tested for primeness
		
		System.out.println("The first 50 prime numbers are \n");
		
		//repeatedly find prime numbers
		while (count < NUMBER_OF_PRIMES) {
			//assume the number is prime
			boolean isPrime = true; // is current number prime?
			
			//test whether number is prime
			for (int divisor = 2; divisor <= number / 2 && isPrime;
					divisor++) {
				if (number % divisor ==0) {//if true, number is not prime
					isPrime = false; //set isPRime to false, if the number is not prime
				}
			}
			
			//display the prime number and increase the count
			if (isPrime) {
				count++; //increase the count
				
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					//DISPLAY THE NUMBER AND ADVANCE TO THE NEW LINE
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
			//check if the next number is prime
			number++;
		}
	}

}
