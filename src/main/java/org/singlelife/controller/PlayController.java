package org.singlelife.controller;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.singlelife.service.PlayService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vo.PlayVO;

@RestController
@RequestMapping("/play")
public class PlayController {
	
	@Inject
	private PlayService service;
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<PlayVO> listAll()throws Exception{
		return service.listAll();
	}
	@RequestMapping("/youtube/{pageNo}")
	public List<PlayVO> youtube(@PathVariable("pageNo") Integer pageNo) throws Exception
	{
		return service.youtube(pageNo);
	}
	
	@RequestMapping("/webtoon")
	public List<PlayVO> webtoon() throws Exception
	{
		return service.webtoon();
	}
	@RequestMapping("/webtoon/{day}")
	public List<PlayVO> dailyWebtoon(@PathVariable("day") String day) throws Exception
	{
		System.out.println(day);
		return service.webtoon(day);
	}
	
	@RequestMapping("/getimg")
	public ResponseEntity<byte[]> dailyWebtoonImage(String image) throws Exception
	{
		
		//'감염자', 'http://thumb.comic.naver.net/webtoon/675823/thumbnail/title_thumbnail_20160309184041_t83x90.jpg', '/webtoon/list.nhn?titleId=675823&amp;weekday=sun', 'webtoon', '2016-07-08 16:24:19', NULL

		System.out.println(image);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		URL url = new URL(image);
		
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
