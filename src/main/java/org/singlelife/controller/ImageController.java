package org.singlelife.controller;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
	
	@RequestMapping("/image")
	public ResponseEntity<byte[]> dailyWebtoonImage(String image) throws Exception
	{
		
		//'감염자', 'http://thumb.comic.naver.net/webtoon/675823/thumbnail/title_thumbnail_20160309184041_t83x90.jpg', '/webtoon/list.nhn?titleId=675823&amp;weekday=sun', 'webtoon', '2016-07-08 16:24:19', NULL

		String img = "";
		if(!image.contains("postfile"))
		{
			img = image;
		}
		else
		{			
			String[] spl = image.split("/");
			for(String s : spl)
			{
				if(s.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*"))
				{
					String[] temp = s.split("\\?");
					s=URLEncoder.encode(temp[0],"UTF-8")+"?"+temp[1];
				}
				img+=s;
				if(!s.contains("type="))	img+='/';
			}
		}
		System.out.println(img);
		//System.out.println(image);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		URL url = new URL(img);
		
		InputStream in = url.openStream();
		
		IOUtils.copy(in, bos);
		
		in.close();
		bos.close();
		
		 HttpHeaders responseHeaders = new HttpHeaders();
	        responseHeaders.setContentType(MediaType.valueOf("image/jpeg"));
		
		ResponseEntity<byte[]> entity = 
				new ResponseEntity<byte[]>(bos.toByteArray(),responseHeaders,HttpStatus.OK);
		
	    return entity;
		
		
		
	}	


}
