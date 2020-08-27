package com.pcschool.ocp.d18_nio.case2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FindBug {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/com/pcschool/ocp/d18_nio/report.txt");
		
		// paralled -> 多執行緒, sequential -> 單執行緒
		Optional<String> data = Files.readAllLines(path)
									.stream()
									.parallel()
//									.sequential()
									.filter(s -> s.contains("bug"))
									.findFirst();
		
		if (data.isPresent())
			System.out.println("找到了: " + data.get());
		else
			System.out.println("找不到");
	}
}
