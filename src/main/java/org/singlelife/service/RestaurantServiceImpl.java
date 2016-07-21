package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.persistence.RestaurantMapper;
import org.springframework.stereotype.Service;

import vo.RestaurantVO;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Inject
	private RestaurantMapper mapper;
	
	@Override
	public List<RestaurantVO> selectRestaurant(Integer pageNo, Integer pageSize) throws Exception {
		return mapper.selectRestaurant(pageNo, pageSize);
	}
	
}
