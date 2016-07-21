package org.singlelife.controller;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.service.TravelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.TravelVO;

@RestController
public class TravelController {
	
	@Inject
	private TravelService service;
	
	@RequestMapping("/travel")
	public List<TravelVO> selectTravel(Integer pageNo, Integer pageSize) throws Exception {
		
		return service.selectTravel(pageNo, pageSize);
		
	}
	
}
