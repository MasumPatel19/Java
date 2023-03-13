package com.training.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Save implements Serializable {
	int i;
}

public class Serialization_Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Save obj = new Save();
		obj.i = 5;

		//	Serialization 
		FileOutputStream fos = new FileOutputStream("test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		//	Deserialization
		FileInputStream fis = new FileInputStream("test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1 = (Save) ois.readObject();

		System.out.println("Object Value is : " + obj1.i);

	}
}
