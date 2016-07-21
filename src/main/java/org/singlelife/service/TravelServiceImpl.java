package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.persistence.TravelMapper;
import org.springframework.stereotype.Service;

import vo.TravelVO;

@Service
public class TravelServiceImpl implements TravelService {

	@Inject
	private TravelMapper mapper;
	
	@Override
	public List<TravelVO> selectTravel(Integer pageNo, Integer pageSize) throws Exception {
		
		return mapper.selectTravel(pageNo, pageSize);
		
	}
}
