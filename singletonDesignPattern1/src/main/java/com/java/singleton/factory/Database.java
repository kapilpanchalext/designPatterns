package com.java.singleton.factory;

public class Database {

	private static volatile Database instance;
	
  // The singleton's constructor should always be private to prevent direct construction.
  private Database() {
      // Initialization logic (e.g., connect to database)
      System.out.println("Connecting to the database...");
  }
	
	public static Database getInstance() {
		if(instance == null) {
			synchronized(Database.class) {
				if(instance == null) {
					instance = new Database();
				}
			}
		}
		return instance;
	}
	
	public void query(String sql) {
		System.out.println("Executing Query: " + sql);
	}
}
