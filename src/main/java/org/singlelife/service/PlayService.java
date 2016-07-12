package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import vo.PlayVO;

public interface PlayService {
	
	public List<PlayVO> listAll() throws Exception;
	public List<PlayVO> youtube(int pageNo) throws Exception;
	public List<PlayVO> webtoon() throws Exception;
	public List<PlayVO> webtoon(String day) throws Exception;
} 
