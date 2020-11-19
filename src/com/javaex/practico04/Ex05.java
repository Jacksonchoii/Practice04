package com.javaex.practico04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] intArray = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		
		double result = 0;
		int i;
		
		for (i=0; i<intArray.length; i++) {
			result = result+intArray[i];
		}
		System.out.println("평균은 "+result/i+" 입니다.");
		
		sc.close();
		
	}

}
