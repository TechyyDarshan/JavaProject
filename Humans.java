package com.darshan;

public class Humans {
	public void dataBehave() {
		String name="Alice";
		int age=20;
		System.out.println(name+ age);
		
		String behaviour = "Shy";
		System.out.println(behaviour);
	}
	public static void main(String[] args) {
		Humans men= new Humans();
		men.dataBehave();
		
	}

}
