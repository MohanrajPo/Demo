package org.arraystring;

public class MissingNum {
	public static void main(String[] args) {
		int missingElement = findMissingElement(new int[] {1,2,3,4,5,6}, 6);
		System.out.println("Missing Element is : " + missingElement);
		
		int missingElement1 = findMissingElement(new int[] {1,2,3,4,5,6,7,9,10}, 10);
		System.out.println("Missing Element is : " + missingElement1);
	}
	
	private static int findMissingElement(int [] numbers, int totalCount) {
		int expectedSum = totalCount * (totalCount + 1) /2;
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		return expectedSum - actualSum;

	}

}

