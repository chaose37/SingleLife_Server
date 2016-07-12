package util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.util.FileCopyUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConnectGS2 {

   public static void main(String[] args) throws Exception{
	   
       final int MAX_SIZE = 1024*1024*10;
       byte[] buf = new byte[MAX_SIZE];
      
      HttpURLConnection connection = null;
      String targetURL = "http://thumb.comic.naver.net/webtoon/358422/thumbnail/title_thumbnail_20130708165713_t83x90.jpg";
      
       try {
           // Create connection
           URL url = new URL(targetURL);
           connection = (HttpURLConnection) url.openConnection();
          
           InputStream is = connection.getInputStream();
           BufferedInputStream bis = new BufferedInputStream(is);
           
           int len=0;
           len = bis.read(buf, 0, MAX_SIZE);


           System.out.println(len);
           File file = new File("c://dev/upload/test.jpg");
           FileCopyUtils.copy(buf, file);

       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           if (connection != null) {
               connection.disconnect();
           }
       }
   }
}