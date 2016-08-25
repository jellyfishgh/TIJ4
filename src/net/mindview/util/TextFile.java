package net.mindview.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {
	public static String read(String fileName) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(
					fileName).getAbsoluteFile()));
			try {
				String s;
				while ((s = br.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void write(String fileName, String text) {
		try {
			PrintWriter pw = new PrintWriter(
					new File(fileName).getAbsoluteFile());
			try {
				pw.print(text);
			} finally {
				pw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public TextFile(String fileName, String spliter) {
		super(Arrays.asList(read(fileName).split(spliter)));
		if (get(0).equals(""))
			remove(0);
	}

	public TextFile(String fileName) {
		this(fileName, "\n");
	}

	public void write(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(
					new File(fileName).getAbsoluteFile());
			try {
				for (String item : this)
					pw.println(item);
			} finally {
				pw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String file = read("TextFile.java");
		write("test.txt", file);
		TextFile text = new TextFile("test.txt");
		text.write("test2.txt");
		TreeSet<String> words = new TreeSet<String>(new TextFile(
				"TextFile.java", "\\W+"));
		System.out.println(words);
		System.out.println(words.headSet("B"));
	}
}
