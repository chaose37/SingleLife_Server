package org.singlelife.persistence;

import java.util.List;

import vo.RestaurantVO;

public interface RestaurantMapper {
	
	public List<RestaurantVO> selectRestaurant(Integer pageNo, Integer pageSize) throws Exception;
	
}
