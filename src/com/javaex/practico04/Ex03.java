package com.javaex.practico04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		
	}

}
