package com.pcschool.ocp.finish.d12_exception.case2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {
	public static void main(String[] args) {
		String path = "src/com/pcschool/ocp/d12_exception/case2/news.txt";
		
		File file = new File(path);
		
		try {
			String data = new Scanner(file).useDelimiter("/A").next();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.err.println("檔案路徑不存在: " + e);
		}
	
	}
}
