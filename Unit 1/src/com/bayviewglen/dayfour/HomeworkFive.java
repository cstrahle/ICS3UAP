package com.bayviewglen.dayfour;

public class HomeworkFive {

	public static void main(String[] args) {
		double x = 5.5, y = 3.0, z = -2.0;
		int i = 5, j = 4, k = 3;
	// a)	
		System.out.println(i - (i - (i - ( i - j))));
		
		int bracketOne = i - j;
		int bracketTwo = i - bracketOne;
		int bracketThree = i - bracketTwo;
		int bracketFour = i - bracketThree;
		
		System.out.println(bracketFour);
	// b)
		System.out.println((x - y) * (x + ( i - j)));
		
		double bbracketOne = i - j;
		double bbracketTwo = x + bracketOne;
		double bbracketThree = x - y;
		
		double sum = bbracketThree * bbracketTwo;
		
		System.out.println(sum);
	// c)
		System.out.println((x - y) - (y - x) - (x - y) - (y - x));
		
		double cbracket13 = x - y;
		double cbracket24 = y - x;
		
		sum = cbracket13 - cbracket24 - cbracket13 - cbracket24;
		
		System.out.println(sum);
	// h)
		System.out.println((double) i + j / k);
		
		double hDivision = j / k;
		double hAddition = i + hDivision;
		
		double hProduct = hAddition;
		
		System.out.println(hAddition);
	// i)
		System.out.println((int) x / k - x / k);
		
		double iDivisionOne = x / k;
		double iDivisionTwo = x / k;
		
		double iProduct = ((int)iDivisionOne - iDivisionTwo);
		
		System.out.println(iProduct);
	// j)
		System.out.println((double) i / j - (double) (i / j));
		
		double jBracketOne = (double)i / j;
		double jDivision = i / j;
		
		double jProduct = jBracketOne - jDivision;
		
		System.out.println(jProduct);

	}

}
