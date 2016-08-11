package org.singlelife.controller;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.inject.Inject;
import javax.xml.bind.DatatypeConverter;

import org.singlelife.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vo.ApiVO;
import vo.ChartVO;
import vo.HistoryVO;

@RestController
@RequestMapping("/api/*")
public class ApiController {
	
	@Inject
	private ApiService service;
	
	@RequestMapping("/getapikey")
	public String getApikey(ApiVO api) throws Exception
	{
		String key ="Fail";
		if(service.selectKey(api)!=null)
			key = service.selectKey(api).getApikey();
		return key;
	}
	@RequestMapping("deletekey")
	public String deleteKey(ApiVO api) throws Exception
	{
		System.out.println(api.getEmail());
		service.deleteKey(api);
		return "delete";
	}
	@RequestMapping(value="/registkey",method=RequestMethod.POST)
	public String insertKEY(ApiVO api) throws Exception {
		if(api.getIp() == null) {
			System.out.println("ip값이 비어있음");
			return "Fail";
		}
		try{
			if(service.chkEmail(api) != null) {
				System.out.println("이미 등록된 키가 존재함");
				return "Fail";
			}
			String key = null;
			key = ApiController.generate(128);
			System.out.println(key);
			api.setApikey(key);
			service.insertKey(api);
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Fail";
		}
		return api.getApikey();
	}
	
	
	
	@ResponseBody
	@RequestMapping("/selectMonthly")
	public List<ChartVO> selectMonthly(String email, String day) throws Exception{
		System.out.println("Monthly통계 반환");
		return service.selectMonthly(email, day);
	}
	
	@ResponseBody
	@RequestMapping("/selectWeekend")
	public List<ChartVO> selectWeekend(String email, String day) throws Exception{
		System.out.println("Weekend통계 반환");
		return service.selectWeekend(email, day);
	}
	@ResponseBody
	@RequestMapping("/selectHourly")
	public List<ChartVO> selectHourly(String email, String day) throws Exception{
		System.out.println("Hourly통계 반환");
		return service.selectHourly(email, day);
	}
	
	
	@ResponseBody
	@RequestMapping("/selectDaily")
	public List<Map<String,Object>> selectDaily(String email, String day) throws Exception{
		System.out.println("Daily통계 반환");
		List<HistoryVO> list = service.selectDaily(email, day);
		List<Map<String,Object>> mList = new ArrayList<Map<String,Object>>();
		for(HistoryVO vo: list)
		{
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("value",vo.getCount());
			map.put("label",vo.getService());
			mList.add(map);
		}
			
		return mList;
	}
//	@ResponseBody
//	@RequestMapping("/selectDaily")
//	public List<HistoryVO> selectDaily(String email, String day) throws Exception{
//		System.out.println("Daily통계 반환");
//		
//		return service.selectDaily(email, day);
//	}
	
	
	
	
	
	public static String generate(final int keyLen) throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(keyLen);
		SecretKey secretKey = keyGen.generateKey();
		byte[] encoded = secretKey.getEncoded();
		return DatatypeConverter.printHexBinary(encoded).toLowerCase();
	}
}
