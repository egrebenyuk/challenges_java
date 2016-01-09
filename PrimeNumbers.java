/* 
* Task: Prime Numbers
*
* Description: A prime number (or a prime) is a natural number greater than 1 
* that has no positive divisors other than 1 and itself. A natural number greater 
* than 1 that is not a prime number is called a composite number. For example, 
* 5 is prime because 1 and 5 are its only positive integer factors, whereas 
* 6 is composite because it has the divisors 2 and 3 in addition to 1 and 6. 
*
* Compile: javac PrimeNumbers.java
* Run: java PrimeNumbers
*/

class PrimeNumbers {
	public static void main(String args[]) {
		System.out.println("Prime numbers!");
		System.out.println("Prime number: " + 1);
		for(int i = 2; i < 100; i++) {
			boolean isPrime = true;
			for(int j = 2; j < i; j++) {
				if((i%j) == 0)
					isPrime = false;	
			}
			if(isPrime)
				System.out.println("Prime number: " + i);
		}
	}
}