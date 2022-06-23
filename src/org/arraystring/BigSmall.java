package org.arraystring;

public class BigSmall {
	
	public static void main(String[] args) {
		int big, small;
		int arr[] = new int [] {10,20,30,40,50};
		big = small = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (arr[i] > big)
				big = arr[i];
			else if (arr[i]< small)
				small = arr[i];
			}
		System.out.println("Smallest number is : " + small);
		System.out.println("Biggest number is : " + big);
	}
}