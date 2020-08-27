package com.pcschool.ocp.d17_io.case3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("src/com/pcschool/ocp/d17_io/report.txt");
		try (FileReader fr = new FileReader(file)) {
			char[] cbuf = new char[1];
			while(fr.read(cbuf) != -1) 
				System.out.print(cbuf[0]);
		} catch (IOException e) {
		}
	}
}
