package org.singlelife.controller;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.inject.Inject;
import javax.xml.bind.DatatypeConverter;

import org.singlelife.service.ApiService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vo.ApiVO;

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
	
	public static String generate(final int keyLen) throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(keyLen);
		SecretKey secretKey = keyGen.generateKey();
		byte[] encoded = secretKey.getEncoded();
		return DatatypeConverter.printHexBinary(encoded).toLowerCase();
	}
}
