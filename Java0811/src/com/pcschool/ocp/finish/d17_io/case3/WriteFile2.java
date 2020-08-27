package com.pcschool.ocp.finish.d17_io.case3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class WriteFile2 {
	public static void main(String[] args) {
		File file = new File("src/com/pcschool/ocp/d17_io/report.txt");
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8)){
			osw.write("\n洋蔥 x 2");
		}catch (IOException e) {
		}
	}
}
