package org.singlelife.service;

import java.util.List;

import vo.RestaurantVO;

public interface RestaurantService {
	
	public List<RestaurantVO> selectRestaurant(Integer pageNo, Integer pageSize) throws Exception;
	
}
