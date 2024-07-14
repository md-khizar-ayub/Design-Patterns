package com.singleton;

public class MainClass {
	public static void main(String[] args) {
		String str = Singleton.getInstance("My name is Perry").getValue();
		System.out.println(str);
	}
}
