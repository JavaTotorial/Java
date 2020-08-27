package com.pcschool.ocp.d18_nio.case2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAll2 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/com/pcschool/ocp/d18_nio/report.txt");
		Files.readAllLines(path)
				.parallelStream()
				.forEach(System.out::println);
	}
}
