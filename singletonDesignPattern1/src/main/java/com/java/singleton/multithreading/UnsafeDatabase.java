package com.java.singleton.multithreading;

public class UnsafeDatabase {
	private static UnsafeDatabase instance;
	
	private UnsafeDatabase() {
		System.out.println("Instance created by " + Thread.currentThread().getName());
	}
	
	public static UnsafeDatabase getInstance() {
		// Gets different Hashcode
		if(instance == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			instance = new UnsafeDatabase();
		}
		
		// Always get the same hashcode
//		if(instance == null) {
//			synchronized(Database.class) {
//				if(instance == null) {
//					instance = new UnsafeDatabase();
//				}
//			}
//		}
		return instance;
	}
}
