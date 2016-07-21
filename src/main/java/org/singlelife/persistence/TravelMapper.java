package org.singlelife.persistence;

import java.util.List;

import vo.TravelVO;

public interface TravelMapper {
	public List<TravelVO> selectTravel(Integer pageNo, Integer pageSize) throws Exception;
}
