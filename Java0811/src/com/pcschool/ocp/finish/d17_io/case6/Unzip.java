package com.pcschool.ocp.finish.d17_io.case6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.ZipInputStream;

public class Unzip {
	public static void main(String[] args) {
		File zipFile = new File("src/com/pcschool/ocp/d17_io/salary.zip");
		try (FileInputStream fis = new FileInputStream(zipFile);
				ZipInputStream zis = new ZipInputStream(fis);
				Reader reader = new InputStreamReader(zis);) {
			
			
			System.out.printf("zip: %s\n", zis.getNextEntry().getName());

			char[] buffer = new char[1];
			StringBuilder sb = new StringBuilder();

			while (reader.read(buffer) != -1)
				sb.append(buffer);
			System.out.println(sb);
		} catch (Exception e) {
		}
	}
}
