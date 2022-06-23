package org.arraystring;

public class Duplicate {
	public static void main(String[] args) {
		String string = "Great responsibility";
		int count;  
		char charray[]= string.toCharArray();
		
		System.out.println("String is : " + string);
		
		System.out.println("Duplicate characters in the string : ");
		
		for (int i = 0; i < charray.length; i++) {
			count = 1;
			for (int j = i+1; j < charray.length; j++) {
				if (charray[i] == charray[j] && charray[i] != ' ') {
					count++;
					charray[j] = '0';
				}
			}
			  if(count > 1 && charray[i] != '0')  
	          System.out.println(charray[i]);
		}
	}
}
