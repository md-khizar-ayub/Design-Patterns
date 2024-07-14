package com.singleton;

public class Singleton {
	
	private static Singleton instance;
	private String value;
	
	private Singleton(String value2) {
		this.value = value2;
	}

	public static Singleton getInstance(String value) {
		synchronized (Singleton.class) {
			if(instance==null) {
				return new Singleton(value);
			}
			return instance;
		}
		
	}
	public String getValue() {
		return this.value;
	}
}
