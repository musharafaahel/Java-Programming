package com.hit;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first = 120, second = 220;
		
		System.out.println("----Before Swap----");
		System.out.println("First Number : "+ first);
		System.out.println("Second Number : "+ second);
		
		float temporary = first;
		first = second;
		second = (int) temporary;
		
		System.out.println("----After Swap----");
		System.out.println("First Number : "+ first);
		System.out.println("Second Number : "+ second);
		
	}
}
