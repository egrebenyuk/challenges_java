/* 
* Task: Compare two files
*
* Description: File comparison utility. It works by opening both files to be compared and then 
* reading and comparing each corresponding set of bytes. If a mismatch is found, the files differ.
* If the end of each file is reached at the same time and if no mismatches have been found, then 
* the files are the same.
*
* Compile: javac CompareFiles.java
* Run: java CompareFiles First.txt Second.txt
*/

import java.io.*;

class CompareFiles {
	public static void main(String args[]) {
		int i = 0; 
		int j = 0;
		if(args.length != 2) {
			System.out.println("Usage: java CompareFiles First.txt Second.txt");
			return;
		}
		try(FileInputStream f1 = new FileInputStream(args[0]);
			FileInputStream f2 = new FileInputStream(args[1])) {
			do {
				i = f1.read();
				j = f2.read();
				if (i != j) break;
			} while(i != -1 && j != -1);
			if (i != j) System.out.println("Files are different!");
			else System.out.println("Files are the same!");
		} catch(IOException exc) {
			System.out.println("Exc: " + exc);
		}
	}
}