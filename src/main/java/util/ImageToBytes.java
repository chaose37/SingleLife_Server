package util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.springframework.util.FileCopyUtils;

public class ImageToBytes {
	
	   public static byte[] getBytes(String imgURL) throws Exception{
		   
	       final int MAX_SIZE = 1024*1024*10;
	       byte[] buf = new byte[MAX_SIZE];
	      
	      HttpURLConnection connection = null;
	       try {
	           // Create connection
	           URL url = new URL(imgURL);
	           connection = (HttpURLConnection) url.openConnection();
	           InputStream is = connection.getInputStream();
	           BufferedInputStream bis = new BufferedInputStream(is);
	           
	           int len=0;
	           len = bis.read(buf, 0, MAX_SIZE);
//	           System.out.println(len);
//	           File file = new File("c://dev/upload/test.jpg");
//	           FileCopyUtils.copy(buf, file);
	           is.close();
	           bis.close();

	       } catch (Exception e) {
	           e.printStackTrace();
	       } finally {
	           if (connection != null) {
	               connection.disconnect();
	           }
	       }
	       return buf;
	   }
	

}
