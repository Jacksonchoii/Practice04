package com.javaex.practico04;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char[] text = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		char[] text = new char[16];
		
		text[0] = 'T';
		text[1] = 'h';
		text[2] = 'i';
		text[3] = 's';
		text[4] = ' ';
		text[5] = 'i';
		text[6] = 's';
		text[7] = ' ';
		text[8] = 'a';
		text[9] = ' ';
		text[10] = 'p';
		text[11] = 'e';
		text[12] = 'n';
		text[13] = 'c';
		text[14] = 'i';
		text[15] = 'l';
		
		for(int i=0; i<text.length; i++) {
			
			if(text[i]==' ') {
				System.out.print(",");
				continue;
			}
			System.out.print(text[i]);
		}
		
	}

}
