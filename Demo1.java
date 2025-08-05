package com.darshan;

public class Demo1 {

	public static void main(String[] args) {
		try {
			int x = 2/0;
			System.out.println(x);
			} catch(Exception e) {
				System.out.println("Zero Cannot Divide");
			}finally {
				System.out.println("Thank You Have a Good Day!!");
			}
		

	}

}
