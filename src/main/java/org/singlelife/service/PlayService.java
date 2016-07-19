package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import vo.PlayVO;

public interface PlayService {
	
	public List<PlayVO> listAll(Integer pageNo,Integer pageSize) throws Exception;
	public List<PlayVO> youtube(Integer pageNo,Integer pageSize) throws Exception;
	public List<PlayVO> webtoon(Integer pageNo,Integer pageSize) throws Exception;
	public List<PlayVO> webtoon(String day,Integer pageNo,Integer pageSize) throws Exception;
	public List<PlayVO> game(Integer pageNo,Integer pageSize) throws Exception;
} 
