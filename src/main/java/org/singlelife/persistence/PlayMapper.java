package org.singlelife.persistence;

import java.util.List;

import vo.PlayVO;

public interface PlayMapper {
	
	public List<PlayVO> selectPlay(Integer pageNo,Integer pageSize) throws Exception;
	public List<PlayVO> selectYoutube(Integer pageNo,Integer pageSize) throws Exception;
	public List<PlayVO> selectWebtoon(Integer pageNo,Integer pageSize) throws Exception;
	public List<PlayVO> selectWebtoon(String day,Integer pageNo,Integer pageSize) throws Exception;
	public List<PlayVO> selectGame(Integer pageNo,Integer pageSize) throws Exception;
	

}
