package com.pcschool.ocp.d17_io.case3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile2 {
	public static void main(String[] args) {
		File file = new File("src/com/pcschool/ocp/d17_io/report.txt");
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8")) {
			char[] cbuf = new char[1];
			while(isr.read(cbuf) != -1) 
				System.out.print(cbuf[0]);
		} catch (IOException e) {
		}
	}
}
