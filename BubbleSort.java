/* 
* Task: Bubble sort 
*
* Description: Starting from the beginning of the list, compare every adjacent pair, 
* swap their position if they are not in the right order (the latter one is smaller 
* than the former one). After each iteration, one less element (the last one) is needed 
* to be compared until there are no more elements left to be compared.
*
* Compile: javac BubbleSort.java
* Run: java BubbleSort
*/

class BubbleSort {
	public static void main(String args[]) {
		int nums[] = {9,3,2,6,4,8};
		int temp;

		System.out.println("Input: ");
		for(int i = 0; i < 6; i++) {
			System.out.print(nums[i] + " ");
		}

		for(int j = 6; j > 0; j--)  {
			for(int i = 0; i < 5; i++) {
				// asc order
				if(nums[i] > nums[i+1]) {
				// desc order
				// if(nums[i] < nums[i+1]) {		
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}
		} 
		System.out.println("\nResult: ");
		for(int i = 0; i < 6; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}