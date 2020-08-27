package com.pcschool.ocp.d17_io.case2;

import java.io.File;

public class ScanPath {
	public static void main(String[] args) {
		File path = new File("src/com/pcschool/ocp/d17_io");
		for(String fname : path.list())
			System.out.printf("%s 是 %s\n", fname, new File(path, fname).isDirectory() ? "目錄" : "檔案");
	}
}
