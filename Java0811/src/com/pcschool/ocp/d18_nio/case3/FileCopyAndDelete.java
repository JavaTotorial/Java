package com.pcschool.ocp.d18_nio.case3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyAndDelete {
	public static void main(String[] args) throws IOException {
		Path source = Paths.get("src/com/pcschool/ocp/d18_nio/a.txt");
		Path target = Paths.get("src/com/pcschool/ocp/d18_nio/b.txt");
		
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(source);
	}
}
