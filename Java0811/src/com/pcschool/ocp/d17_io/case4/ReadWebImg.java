package com.pcschool.ocp.d17_io.case4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class ReadWebImg {
	public static void main(String[] args) throws MalformedURLException {
		String path = "https://melonbooks.akamaized.net/user_data/packages/resize_image.php?image=212001191978.jpg";
		URL url = new URL(path);
		File file = new File("src/com/pcschool/ocp/d17_io/case4/misaka.jpg");
		
		try(InputStream is = url.openStream(); // 取得網路串流
			FileOutputStream fos = new FileOutputStream(file);) {
			
			byte[] b = new byte[1];
			while(is.read(b) != -1)
				fos.write(b);
			System.out.println("寫入完成...");
		}catch (Exception e) {
		}
	}
}
