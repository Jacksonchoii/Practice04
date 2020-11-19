package com.javaex.practico04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		
		int sum = 0;
		int g = 0;
		
		for(int i=0; i<data.length; i++) {
			if(data[i]%3==0) {
				sum=sum+data[i];
				g=g+1;
			}
		}
		
		
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+g);
		System.out.println("주어진 배열에서 3의 배수의 합=>"+sum);
		
	}

}
