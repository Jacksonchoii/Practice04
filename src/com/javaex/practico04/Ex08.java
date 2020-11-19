package com.javaex.practico04;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] lottonum = {(int)(Math.random()*45)+1, (int)(Math.random()*45)+1, (int)(Math.random()*45)+1, (int)(Math.random()*45)+1, (int)(Math.random()*45)+1, (int)(Math.random()*45)+1};
		
		int dc = 0;
		
		for(int i=0; i<lottonum.length; i++) {
			
			if(dc==lottonum[i]) {
				break;
			}
			dc = lottonum[i]+0;
			System.out.print(lottonum[i]+" ");
				
			
		}
		
	}

}
