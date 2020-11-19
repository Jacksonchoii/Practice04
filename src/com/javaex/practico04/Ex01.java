package com.javaex.practico04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
		// intArray.length < 문법을 쓸 때 조심할 것!
		// 메모리 갯수는 5개 번호는 4번까지
	}

}
