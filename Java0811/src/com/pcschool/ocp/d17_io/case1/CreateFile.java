package com.pcschool.ocp.d17_io.case1;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		String path = "src/com/pcschool/ocp/d17_io/case1/hello.txt";
		File file = new File(path);
		System.out.println("檢查檔案是否存在: " + file.exists());
		if(!file.exists()) {
			try {
				System.out.println("建立檔案是否成功: " + file.createNewFile());
			} catch (IOException e) {
				System.err.println("失敗: " + e);
			}
		}
		System.out.println("再次檢查檔案是否存在: " + file.exists());
	}
}
