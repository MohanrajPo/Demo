package org.languageconstructor;

//Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, 
//such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
//
//shareDigit(12, 23) ? true
//shareDigit(12, 43) ? false
//shareDigit(12, 44) ? false
//Test your logic at : http://codingbat.com/prob/p153748

public class Six {
	public boolean shareDigit(int a, int b) {
  int aL = a / 10;
  int aR = a % 10;
  int bL = b / 10;
  int bR = b % 10;
  if (aL == bL || aL == bR || aR == bL || aR == bR)
    return true;
  else
    return false;
}

}
