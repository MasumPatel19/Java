package com.training.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter String : ");

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			System.out.println(str);
		}

//		finally {
//			br.close();
//			System.out.println("BufferReader object closed.");
//
//		}

	}
}
