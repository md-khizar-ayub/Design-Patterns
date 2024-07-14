package com.singleton;

public class Singleton {
	
	private static Singleton instance;
	private String value;
	
	public Singleton(String value2) {
		this.value = value2;
	}

	public static Singleton getInstance(String value) {
		return new Singleton(value);
	}
	public String getValue() {
		return this.value;
	}
}
