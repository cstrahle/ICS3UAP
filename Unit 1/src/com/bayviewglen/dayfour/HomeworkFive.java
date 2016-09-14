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
		System.out.println("");
	// b)
		System.out.println((x - y) * (x + ( i - j)));
		
		double bbracketOne = i - j;
		double bbracketTwo = x + bracketOne;
		double bbracketThree = x - y;
		
		double sum = bbracketThree * bbracketTwo;
		
		System.out.println(sum);
		System.out.println("");
	// c)
		System.out.println((x - y) - (y - x) - (x - y) - (y - x));
		
		double cbracket13 = x - y;
		double cbracket24 = y - x;
		
		sum = cbracket13 - cbracket24 - cbracket13 - cbracket24;
		
		System.out.println(sum);
		System.out.println("");
	// d)
		System.out.println((x - y) - ((y - x) - ((x - y) - (y - x))));
		
		double dBracketOne = x - y;
		double dBracketTwo = y - x;
		double dBracketThree = x - y;
		double dBracketFour = y - x;
		
		double dBracketSumOne = dBracketOne - dBracketTwo;
		double dBracketSumTwo = dBracketFour - dBracketSumOne;
		double dBracketSumThree = dBracketOne - dBracketSumTwo;
		
		System.out.println(dBracketSumThree);
		System.out.println("");
	// e)
		System.out.println(i + j - k * i / j);
		
		double eMultiply = k * i;
		double eDivision = eMultiply / j;
		double eSubtraction = j - eDivision;
		double eAddition = i + eSubtraction;
		
		
		//double eProductOne = eMultiply / eDivision;
		//double eProductTwo = ;
		
		System.out.println(eAddition);
		System.out.println("");
	// f)
		System.out.println(i * j / k + i - j);
		
		double fMultiply = i * j;
		double fDivision = fMultiply / k;
		double fAddition = fDivision + i;
		
		double fProduct = ((int)fAddition - j);
		
		System.out.println(fProduct);
		System.out.println("");
	// g)
		System.out.println(((i + k) * (i - k)) / ((i + j) * ( i - j)));
		
		double gBracketOne = i + k;
		double gBracketTwo = i - k;
		double gBracketThree = i + j;
		double gBracketFour = i - j;
		
		double gSumOne = gBracketOne * gBracketTwo;
		double gSumTwo = gBracketThree * gBracketFour;
		double gProduct = ((int)gSumOne / (int)gSumTwo);
		
		System.out.println(gProduct);
		System.out.println("");
	// h)
		System.out.println((double) i + j / k);
		
		double hDivision = j / k;
		double hAddition = i + hDivision;
		
		double hProduct = hAddition;
		
		System.out.println(hAddition);
		System.out.println("");
	// i)
		System.out.println((int) x / k - x / k);
		
		double iDivisionOne = x / k;
		double iDivisionTwo = x / k;
		
		double iProduct = ((int)iDivisionOne - iDivisionTwo);
		
		System.out.println(iProduct);
		System.out.println("");
		// j)
		System.out.println((double) i / j - (double) (i / j));
		
		double jBracketOne = (double)i / j;
		double jDivision = i / j;
		
		double jProduct = jBracketOne - jDivision;
		
		System.out.println(jProduct);

	}

}
