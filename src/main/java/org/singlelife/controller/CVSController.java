package org.singlelife.controller;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.service.CVSService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.CVSVO;

@RestController
@RequestMapping("/cvs")
public class CVSController {
	
	@Inject
	private CVSService service;
	 
	@RequestMapping("/all")
	public List<CVSVO> listAll() throws Exception
	{
		return service.listAll();
	}
	@RequestMapping("/store/{store}")
	public List<CVSVO> listStore(@PathVariable("store") String store) throws Exception
	{
		return service.listStore(store);
	}
	@RequestMapping("/event/{event}")
	public ResponseEntity<List<CVSVO>> listEvent(@PathVariable("event") String event) throws Exception
	{
		ResponseEntity<List<CVSVO>> entity = null;
		if(event.equals("add"))					event = "증정";
		else if(event.equals("sale"))			event = "할인";
		else if(event.equals("plus1"))			event = "1+1";
		else if(event.equals("plus2"))			event = "2+1";
		else 									
		{
			entity = new ResponseEntity<List<CVSVO>>(HttpStatus.BAD_REQUEST);
			return entity;
			}
			
		entity = new ResponseEntity<List<CVSVO>>(service.listEvent(event),HttpStatus.OK);
		return entity;
	}


}
