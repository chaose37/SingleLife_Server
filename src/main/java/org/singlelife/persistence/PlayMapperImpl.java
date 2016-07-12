package org.singlelife.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import util.ImageToBytes;
import vo.PlayVO;


@Repository
public class PlayMapperImpl implements PlayMapper{
	
	private String namespace="org.singlelife.persistence.PlayMapper"; 
	@Inject
	private SqlSessionTemplate session;

	@Override
	public List<PlayVO> selectPlay()throws Exception {
		
		return session.selectList(namespace+".selectPlay");
	}

	@Override
	public List<PlayVO> selectYoutube(Integer pageNo)throws Exception {
		Integer start = (pageNo-1)*6;
		Map<String,Integer> map = new HashMap<>();
		map.put("start", start);
		return session.selectList(namespace+".selectYoutube",map);
	}

	@Override
	public List<PlayVO> selectWebtoon()throws Exception {
		return session.selectList(namespace+".selectWebtoon");
	}

	@Override
	public List<PlayVO> selectWebtoon(String day) throws Exception {
		day = "%weekday="+day+'%';
		Map<String,String> map = new HashMap<>();
		map.put("day", day);
		List<PlayVO> list = session.selectList(namespace+".selectWebtoon",map);
		return list;
	}

	

}
