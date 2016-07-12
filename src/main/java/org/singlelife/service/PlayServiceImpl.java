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
	public List<PlayVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectPlay();
	}

	@Override
	public List<PlayVO> youtube(int pageNo) throws Exception{
		// TODO Auto-generated method stub
		return mapper.selectYoutube(pageNo);
	}

	@Override
	public List<PlayVO> webtoon()throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectWebtoon();
	}

	@Override
	public List<PlayVO> webtoon(String day)throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectWebtoon(day);
	}



}
