package org.singlelife.controller;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.service.PlayService;
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
	public List<PlayVO> listAll(){
		return service.listAll();
	}
	

}
