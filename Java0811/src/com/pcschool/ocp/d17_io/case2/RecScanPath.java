package com.pcschool.ocp.d17_io.case2;

import java.io.File;

public class RecScanPath {
	static int count;

	public static void main(String[] args) {
		String path = "src/com/pcschool/ocp";
		scan(new File(path));
		System.out.printf("有 %d 隻 Java 程式\n", count);
	}

	public static void scan(File path) {
		try {
			File file;
			for (String fname : path.list()) {
				file = new File(path, fname);
				System.out.printf("%s　是　%s\n", file.getName(), file.isFile() ? "檔案" : "目錄");
				if (file.isDirectory())
					scan(file);
				else
					if(file.getName().contains(".java")) {
						count++;
						if(count == 150) {
//							System.out.println("第 150 支是: " + file.getName());
						}
					}
			}
		} catch (Exception e) {
		}
	}
}
