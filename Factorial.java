/* 
* Task: Factorial
*
* Description: A factorial is a function that multiplies a number by every number below it. 
* For example 5!= 5*4*3*2*1=120. The factorial of 0 is 1.
*
* Compile: javac Factorial.java
* Run: java Factorial 5
*/

class Factorial {
	public static void main(String args[]) throws java.io.IOException {
		int num = 0;
		int result = 0;
		
		if(args.length != 1) {
			System.out.println("Usage: java Factorial number");
			return;
		}
		
		num = Integer.parseInt(args[0]);
		if(num < 0) {
			System.out.println("Usage: number should be positive");
			return;
		}
		else result = 1; 
		
		for (int i = 1; i <= num; i++)
			result*=i;
		
		System.out.println("Factorial of " + num + " is " + result);
	}
}