package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException {
		createFileUsingFileObject();
		writingFileContentUsingFileOutputStream();
		createAndWriteUsingNioPackage();
	}

	private static void createAndWriteUsingNioPackage() throws IOException {
		String data = "Hey, this is from NIO";
		Files.write(Paths.get("c://temp//simplilearn2.txt"), data.getBytes());
		
		ArrayList<String> lines = new ArrayList<>();
		lines.add("1st line");
		lines.add("2nd line");
		lines.add("3rd line");
		
		Files.write(Paths.get("c://temp//simplilearn3.txt"), lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	}

	private static void writingFileContentUsingFileOutputStream() throws FileNotFoundException, IOException {
		String data = "Hello World! Using FileOutputStream";
		FileOutputStream fos = new FileOutputStream("c://temp//simplilearn1.txt");
		fos.write(data.getBytes());
		fos.close();
	}

	private static void createFileUsingFileObject() throws IOException {
		File file = new File("c://temp//simplilearn1.txt");

		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exist!");
		}

		FileWriter writer = new FileWriter(file);
		writer.write("Welcome to simplilearn");
		writer.close();
	}
}
