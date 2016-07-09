package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.persistence.PlayMapper;
import org.springframework.stereotype.Service;

import vo.PlayVO;


@Service
public class PlayServiceImpl implements PlayService{
	
	@Inject
	private PlayMapper mapper;

	@Override
	public List<PlayVO> listAll() {
		// TODO Auto-generated method stub
		return mapper.selectPlay();
	}

}
