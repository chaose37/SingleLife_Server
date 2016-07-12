package org.singlelife.persistence;

import java.util.List;

import vo.PlayVO;

public interface PlayMapper {
	
	public List<PlayVO> selectPlay() throws Exception;
	public List<PlayVO> selectYoutube(Integer pageNo) throws Exception;
	public List<PlayVO> selectWebtoon() throws Exception;
	public List<PlayVO> selectWebtoon(String day) throws Exception;
		

}
