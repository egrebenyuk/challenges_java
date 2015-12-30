/*
* Task: FizzBuzz
*
* Description: Write a program that prints the numbers from 1 to 50. But for multiples 
* of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
* For numbers which are multiples of both three and five print “FizzBuzz”.
*
* Compile: javac FizzBuzz.java
* Run: java FizzBuzz 20
*/

class FizzBuzz {
	public static void main(String args[]) {
		int num;
		String value;

		if(args.length != 1) {
			System.out.println("Usage: java FizzBuzz number");
			return;
		}
		
		num = Integer.parseInt(args[0]);
		if(num < 1) {
			System.out.println("Usage: number should be positive");
			return;
		}

		for(int i = 1; i < num; i++) {
			value = "";
			if(i%3 == 0) value += "Fizz";
			if(i%5 == 0) value += "Buzz";
			if(value == "") value += i;
			System.out.println(value);
		}
	}
}