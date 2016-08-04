package org.singlelife.interceptor;

import java.lang.reflect.Method;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.singlelife.service.ApiService;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import vo.ApiVO;

public class ApiInterceptor extends HandlerInterceptorAdapter {
	
	@Inject
	private ApiService service;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		
		
		ApiVO api = new ApiVO();
		api.setApikey((String)request.getParameter("apikey"));
		System.out.println(request.getParameter("apikey"));
		String ipAddr = getClientIP(request);
		api.setIp(ipAddr);
		System.out.println(ipAddr);
		if(ipAddr.equals("0:0:0:0:0:0:0:1"))
		{
			System.out.println("호스트 접속함");
			return true;
		}
		if(api.getApikey() == null) {
			System.out.println("키 입력 없음");
			return false;
		}
		if(api.getIp() == null) {
			System.out.println(api.getIp());
			System.out.println("IP Address 호출 오류");
			return false;
		}
		if(service.chkInfo(api) == null) {
			System.out.println("잘못된 키 또는 IP");
			return false;
		}
		
		HandlerMethod method = (HandlerMethod) handler;
		Method methodObj = method.getMethod();
		
		System.out.println("Bean: " + method.getBean());
		System.out.println("Method: " + methodObj.getDeclaringClass());
		System.out.println("Method: " + methodObj.getClass());
		System.out.println("Method: " + methodObj.getModifiers());
		return true;
	}
	 public String getClientIP(HttpServletRequest request) {

	     String ip = null;
	     
	     ip = request.getHeader("X-FORWARDED-FOR"); 
	     
	     if(ip == null || ip.length() == 0) {
	         ip = request.getHeader("Proxy-Client-IP");
	     }
	     if(ip == null || ip.length() == 0) {
	         ip = request.getHeader("WL-Proxy-Client-IP");  // 웹로직
	     }
	     if (ip == null || ip.length() == 0)
	     { 
	    	  ip = request.getHeader("HTTP_X_FORWARDED_FOR"); 
	     } 
	     if(ip == null || ip.length() == 0)
	     {
	    	 ip = request.getHeader("HTTP_CLIENT_IP");
	     }
	     if(ip == null || ip.length() == 0) {
	         ip = request.getRemoteAddr() ;
	     }
	     
	     return ip;
	 }
}