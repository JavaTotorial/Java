package com.pcschool.ocp.d18_nio.case3;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class StreamCopy {
	public static void main(String[] args) throws Exception {
		String surl = "https://melonbooks.akamaized.net/user_data/packages/resize_image.php?image=212001191978d.jpg";
		URL url = new URL(surl);
		Path dest = Paths.get("src/com/pcschool/ocp/d18_nio/misaka.jpg");
		Files.copy(url.openStream(), dest, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Copy Sucess");
	}
}
