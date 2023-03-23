package com.training.programs;

public class ForExample {

	public static void main(String[] args) {
		
		int b = 4;
		for (int a = 1; b != 1; System.out.println("Iterate")) {
			b = b - a;
		}
		
//		int arr=1234;	// Error : Can only iterate over an array
		int [] arr= {1,2,3,4,5};
		for(int n : arr) {
			System.out.println(n);
		}
		
		
		String [] str = {"one","two","three"};
//		set an object reference to each string
		for(Object obj : str) 
		{
			System.out.println(obj);
		}		
	}
}
