package com.bayviewglen.dayone;

public class ExampleThree {

	public static void main(String[] args) {
		int sum = 0;
		
		int current = 1;
		
		while(current < 1000000001){
			sum += current;
			current++;
			System.out.println(current);
		}
	
		//System.out.println("The sum of the numbers from 1 to 1000 is: " + sum);

	}

}
