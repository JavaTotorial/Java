package com.pcschool.ocp.d18_nio.case2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/com/pcschool/ocp/d18_nio/report.txt");
		List<String> list = Files.readAllLines(path);
		System.out.println(list); // 單工模式
	}
}
