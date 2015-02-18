package com;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {
	
	public static List<String> loadEntireFile(String fileName) {
		try {
			List<String> lines = Files.readAllLines(Paths.get(fileName),
					Charset.defaultCharset());
			return lines;
		} catch (IOException e) {
			throw new RuntimeException("No such file", e);
		}
	}

}
