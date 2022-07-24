package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {

	public int a;

	public String b;

	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

public class SerializationExample {

	public static void main(String[] args) throws IOException {
		Demo d = new Demo(1, "Simplilearn");

		FileOutputStream fout = new FileOutputStream("file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(d);

		oos.close();
		fout.close();

	}
}