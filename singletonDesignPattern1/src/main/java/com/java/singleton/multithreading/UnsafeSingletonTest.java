package com.java.singleton.multithreading;

public class UnsafeSingletonTest {

	public static void main(String[] args) {
		Runnable task = () -> {
			UnsafeDatabase db = UnsafeDatabase.getInstance();
			System.out.println("Got instance: " + db.hashCode());
		};
		
		Thread t1 = new Thread(task, "Thread-A");
		Thread t2 = new Thread(task, "Thread-B");
		
		t1.start();
		t2.start();
	}
}
