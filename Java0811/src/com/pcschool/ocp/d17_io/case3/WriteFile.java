package com.pcschool.ocp.d17_io.case3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		File file = new File("src/com/pcschool/ocp/d17_io/report.txt");
		try(FileWriter fw = new FileWriter(file, true)){
			fw.write("洋蔥 x 2");
		}catch (IOException e) {
		}
	}
}
