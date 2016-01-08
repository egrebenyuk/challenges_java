/*
* Task: Queue implementations
*
* Description: Create an interface for character queue and three implementations.
* All three implementations will use an array to store the characters. One queue is 
* the fixed-size, linear queue. Second is the circular queue. Third is the dynamic 
* queue, which grows as necessary when its size is exceeded.
*
* Compile: javac IQDemo.java
* Run: java IQDemo
*/

class FixedQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;

	public FixedQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println("Queue is full!");
			return;
		}
		q[putloc++] = ch;
	}

	public char get() {
		if(putloc == getloc) {
			System.out.println("Queue is empty!");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class CircularQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;

	public CircularQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}

	public void put(char ch) {
		if(putloc+1 == getloc | ((putloc == q.length-1) & (getloc == 0))) {
			System.out.println("Queue is full!");
			return;
		}
		q[putloc++] = ch;
		if(putloc == q.length) putloc = 0;
	}

	public char get() {
		if(putloc == getloc) {
			System.out.println("Queue is empty!");
			return (char) 0;
		}
		char ch = q[getloc++];
		if(getloc == q.length) getloc = 0;
		return ch;
	}
} 

class DynamicQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;

	public DynamicQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	public void put(char ch) {
		if(putloc == q.length) {
			char t[] = new char[q.length * 2];
			for(int i=0; i<q.length; i++) 
				t[i] = q[i];
			q = t;
		}
		q[putloc++] = ch;
		
	}

	public char get() {
		if(putloc == getloc) {
			System.out.println("Queue is empty!");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class IQDemo {
	public static void main(String args[]) {
		FixedQueue fq = new FixedQueue(10);
		CircularQueue cq = new CircularQueue(10);
		DynamicQueue dq = new DynamicQueue(5);

		ICharQ iq;
		char ch;
		int i;

		iq = fq;
		System.out.println("FixedQueue:");
		for(i=0; i<10; i++)
			iq.put((char) ('A'+i));
		
		for(i=0; i<10; i++) {
			ch = iq.get();
			System.out.print(ch);
		}
		System.out.println();

		iq = cq;
		System.out.println("CircularQueue:");
		for(i=0; i<10; i++)
			iq.put((char) ('Z'-i));
		
		for(i=0; i<10; i++) {
			ch = iq.get();
			System.out.print(ch);
		}
		System.out.println();	

		System.out.println("Put More to CircularQueue:");
		for(i=10; i<20; i++)
			iq.put((char) ('Z'-i));
		for(i=0; i<10; i++) {
			ch = iq.get();
			System.out.print(ch);
		}
		System.out.println();

		System.out.println("Store and get CircularQueue:");
		for(i=0; i<20; i++) {
			iq.put((char) ('Z'-i));
			ch = iq.get();
			System.out.print(ch);
		}
		System.out.println();

		iq = dq;
		System.out.println("DynamicQueue:");
		for(i=0; i<10; i++)
			iq.put((char) ('A'+i));
		
		for(i=0; i<10; i++) {
			ch = iq.get();
			System.out.print(ch);
		}
		System.out.println();	
	}
}