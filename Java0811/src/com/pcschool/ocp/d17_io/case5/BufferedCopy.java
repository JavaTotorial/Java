package com.pcschool.ocp.d17_io.case5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BufferedCopy {
	public static void main(String[] args) {
		File file = new File("src/com/pcschool/ocp/d17_io/report.txt");
		
		try(FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader bis = new BufferedReader(isr);) {
			
			String data = null;
			while((data = bis.readLine()) != null)
				System.out.println(data);
		} catch (Exception e) {
		}
	}
}
