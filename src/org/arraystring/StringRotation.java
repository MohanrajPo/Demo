package org.arraystring;

public class StringRotation {
	
	public static boolean checkRotation (String s1, String s2) {
		if (s1.length() != s2.length())
		return false;
		
		String concat = s1 + s1;
		if (concat.contains(s2)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		String a = "helloworld";
		String b = "worldhello";
		if (checkRotation (a,b)) {
			System.out.println("Given strings are rotation");
		}
		else {
			System.out.println("Given strings are not rotation");
		}
	}
}
