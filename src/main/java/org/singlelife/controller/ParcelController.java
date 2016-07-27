package org.singlelife.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParcelController {
	
	@RequestMapping("/parcel")
	public ResponseEntity<String> parcel(String code, String invoice) throws Exception {
		String url = "http://tracking.sweettracker.net/tracking"; // 서비스  URL
        String key = "FYruI1RApROgoyBW9SDmlQ"; // 신청해서 받은 KEY
        String furl = String.format("%s/?t_key=%s&t_code=%s&t_invoice=%s", url, key, code, invoice);
        
        URL obj = new URL(furl);
        HttpURLConnection httpConn = (HttpURLConnection) obj.openConnection();

        // 전송방식 GET 지정
        httpConn .setRequestMethod("GET");

        // 요청헤더 추가
        httpConn .setRequestProperty("User-Agent", "Mozilla/5.0");
        httpConn .setRequestProperty("Accept", "application/json");
        
        int responseCode = httpConn.getResponseCode();
        // 응답코드 확인(정상호출 시 200)
        System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(),"UTF-8"));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.add("Content-Type","text/html;charset=UTF-8");
        ResponseEntity<String> entity = new ResponseEntity<>(response.toString(),responseHeaders,HttpStatus.OK);

        // 결과 확인
        System.out.println(entity);
		return entity;
	}
}
