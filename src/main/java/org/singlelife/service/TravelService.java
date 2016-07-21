package org.singlelife.service;

import java.util.List;

import vo.TravelVO;

public interface TravelService {
	
	public List<TravelVO> selectTravel(Integer pageNo, Integer pageSize) throws Exception;
	
}
