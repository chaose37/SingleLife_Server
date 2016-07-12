package util;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConnectGS {

   public static void main(String[] args) throws Exception{
      URL url = new URL("http://gs25.gsretail.com/gscvs/ko/products/event-goods");
      URLConnection conn = url.openConnection();
      
//      System.out.println("===========================================");
      
      String jsessionIDStr = conn.getHeaderField("Set-Cookie");
      
      String sessionID = jsessionIDStr.split(";")[0].split("=")[1]+";";
      
      String csrfToken = null;
      
      Scanner scanner= new Scanner(conn.getInputStream());
      
      while(true){
         //<form id="CSRFForm"
         try{
            String line = scanner.nextLine();
            
            if(line.startsWith("<form id=\"CSRFForm\"")){
               int idx = line.lastIndexOf("value=");
               String temp = line.substring(idx + 7);
               csrfToken = temp.substring(0, temp.length()-4);
               break;
            }
         }catch(Exception e){
            break;
         }
      }
      
      HttpURLConnection connection = null;
      String targetURL = "http://gs25.gsretail.com/gscvs/ko/products/event-goods-search?CSRFToken=" + csrfToken;
      String postParams = "pageNum=1&pageSize=1000&searchType=&searchWord=&parameterList=TOTAL";
      
       try {
           // Create connection
           url = new URL(targetURL);
           connection = (HttpURLConnection) url.openConnection();
           connection.setRequestProperty("Cookie", "JSESSIONID=" + sessionID);
           
           //Accept-Language:ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
           connection.setRequestProperty("Accept-Language", "ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4");
           
           //Accept:application/json, text/javascript, */*; q=0.01
           connection.setRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");
           connection.setUseCaches(false);
           connection.setDoInput(true);
           connection.setDoOutput(true);

           // Send request
           DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
           wr.writeBytes(postParams);
           wr.flush();
           wr.close();

           // Get Response
           InputStream is = connection.getInputStream();
           
//           System.out.println(connection.getHeaderField("Content-Type"));
           
           Scanner sc = new Scanner(is,"UTF-8");
           String line = sc.nextLine();
           System.out.println(line);
           
           line = line.replaceAll("\\\\", "");
           
           System.out.println(line);
           
           line = line.substring(1, line.length()-1);
           HashMap<String,Object> rs = new ObjectMapper().readValue(line, HashMap.class);
           ArrayList<Map> resultInfoArray = (ArrayList<Map>) rs.get("results");
           
           for (int i = 0; i < resultInfoArray.size(); i++) {
              System.out.println("=============================RESULT_" + i + "==================================");
              
              // 배열 안에 있는것도 JSON 형식 이기 때문에 JSON Object 로 추출
              HashMap<String,Object> resultObject = (HashMap<String, Object>)resultInfoArray.get(i);
              
              // JSON name 으로 추출
              System.out.println("resultInfo : store --> GS");
              System.out.println("resultInfo : goodsName --> " + resultObject.get("goodsNm"));
              System.out.println("resultInfo : price --> " + resultObject.get("price"));
              System.out.println("resultInfo : attFileNm --> " + resultObject.get("attFileNm"));
              System.out.println("resultInfo : giftGoodsNm --> " + resultObject.get("giftGoodsNm"));
              System.out.println("resultInfo : giftAttFileNm --> " + resultObject.get("giftAttFileNm"));
              System.out.println("resultInfo : eventTypeNm --> " + resultObject.get("eventTypeNm"));
           }
           
//           FileOutputStream fos = new FileOutputStream("sample.json");
//           
//           byte[] buffer2 = new byte[1024*8];
//           
//           while(true){
//              
//              int count = is.read(buffer2);
//              if(count == -1) { break; }
//              fos.write(buffer2, 0, count);
//              
//           }
//           
//           fos.close();
           
//           BufferedReader rd = new BufferedReader(new InputStreamReader(is));
//           String line;
//           StringBuffer response = new StringBuffer();
//           while ((line = rd.readLine()) != null) {
//               response.append(line);
//               response.append('\r');
//           }
//           rd.close();
//           System.out.println(response);

       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           if (connection != null) {
               connection.disconnect();
           }
       }
   }
}