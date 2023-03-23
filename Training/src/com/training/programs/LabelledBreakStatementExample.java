package com.training.programs;

public class LabelledBreakStatementExample {

	public static void main(String[] args) {
		outer: for (int i = 0; i <= 3; i++) {
			inner: for (int j = 0; j <= 2; j++) {
				if (i == 2) {
					break inner;
				}
				System.out.println("J : " + j);
			}
			System.out.println("I : " + i);
		}
	}

}
