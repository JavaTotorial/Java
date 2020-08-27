package com.pcschool.ocp.d18_nio.case4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileWalk {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/com/pcschool/ocp");
		Files.walk(path).parallel()
		.filter(p -> p.toFile().isFile())
		.filter(p -> {
			try {
				return Files.readAllLines(p).parallelStream().filter(s -> s.contains("apple")).findFirst().isPresent();
			} catch (IOException e) {
			}
			return false;
		})
		.forEach(p ->System.out.println(p));
	}
}
