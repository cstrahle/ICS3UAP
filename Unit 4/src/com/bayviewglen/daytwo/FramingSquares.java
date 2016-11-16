package com.bayviewglen.daytwo;

public class FramingSquares {

	public static void main(String[] args) {
		int m = 3;
		int n = 4;
		int p = 1;
		int q = 2;
		
		for (int i = 0; i < 10; i ++){
			for (int j = 0; j < n + 2*p + 2*q; ++j);
			System.out.print("#");
		}
		System.out.println("");
		
		for (int i = 0; i < 10; i ++){
			for (int j = 0; j < n + 2*p + 2*q; ++j);
			System.out.print("#");
		}
		System.out.println("");
		
		for (int i = 0; i < 10; i ++){
			for (int j = 0; j < q; ++j){
				System.out.print("#");
			}
			for (int k = 0; k < n; ++k);
				System.out.print("+");
			System.out.println("");
		}

	}

}
