package com.pcschool.ocp.d17_io.case4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

// 當遇到防爬蟲圖片時的處理
public class ReadWebImg2 {
	public static void main(String[] args) throws IOException {
		String path = "https://melonbooks.akamaized.net/user_data/packages/resize_image.php?image=212001191978c.jpg";
		URL url = new URL(path);
		File file = new File("src/com/pcschool/ocp/d17_io/case4/misaka2.jpg");
		/*********************************************************************
		 * 加多一層 "USER-AGENT" 來告訴網站我們是用瀏覽器, 而不是爬蟲, 後面的 KEY 值可以隨意寫 *
		 *********************************************************************/
		URLConnection conn = url.openConnection();
		conn.setRequestProperty("USER-AGENT", "我是瀏覽器");
		
		try(InputStream is = conn.getInputStream(); // 取得網路串流
			FileOutputStream fos = new FileOutputStream(file);) {
			
			byte[] b = new byte[1];
			while(is.read(b) != -1)
				fos.write(b);
			System.out.println("寫入完成...");
		}catch (Exception e) {
		}
	}
}
