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
	public List<PlayVO> listAll(Integer pageNo,Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectPlay(pageNo,pageSize);
	}

	@Override
	public List<PlayVO> youtube(Integer pageNo,Integer pageSize) throws Exception{
		// TODO Auto-generated method stub
		return mapper.selectYoutube(pageNo,pageSize);
	}

	@Override
	public List<PlayVO> webtoon(Integer pageNo,Integer pageSize)throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectWebtoon(pageNo,pageSize);
	}

	@Override
	public List<PlayVO> webtoon(String day,Integer pageNo,Integer pageSize)throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectWebtoon(day,pageNo,pageSize);
	}

	@Override
	public List<PlayVO> game(Integer pageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectGame(pageNo, pageSize);
	}



}
