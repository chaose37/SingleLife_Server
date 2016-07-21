package org.singlelife.controller;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.service.RestaurantService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.RestaurantVO;

@RestController
public class RestaurantController {
	
	@Inject
	private RestaurantService service;
	
	@RequestMapping("/restaurant")
	public List<RestaurantVO> selectRestaurant(Integer pageNo, Integer pageSize) throws Exception {
		
		return service.selectRestaurant(pageNo, pageSize);
		
	}
}
