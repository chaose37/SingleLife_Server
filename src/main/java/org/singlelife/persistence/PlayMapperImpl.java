package org.singlelife.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import vo.PlayVO;


@Repository
public class PlayMapperImpl implements PlayMapper{
	
	private String namespace="org.singlelife.persistence.PlayMapper"; 
	@Inject
	private SqlSessionTemplate session;

	@Override
	public List<PlayVO> selectPlay(Integer pageNo,Integer pageSize)throws Exception {
		Map<String,Integer> map = new HashMap<>();
		if(pageSize == null) pageSize = 6;
		if(pageNo != null)
		{
			Integer start = (pageNo-1)*pageSize;
			map.put("size", pageSize);
			map.put("start", start);
		}	
		return session.selectList(namespace+".selectPlay",map);
	}

	@Override
	public List<PlayVO> selectYoutube(Integer pageNo,Integer pageSize)throws Exception {
		Map<String,Integer> map = new HashMap<>();
		if(pageSize == null) pageSize = 6;
		if(pageNo != null)
		{
			Integer start = (pageNo-1)*pageSize;
			map.put("size", pageSize);
			map.put("start", start);
		}	
		return session.selectList(namespace+".selectYoutube",map);
	}

	@Override
	public List<PlayVO> selectWebtoon(Integer pageNo,Integer pageSize,String origin)throws Exception {
		Map<String,Object> map = new HashMap<>();
		map.put("origin", origin);
		if(pageSize == null) pageSize = 20;
		if(pageNo != null)
		{
			Integer start = (pageNo-1)*pageSize;
			map.put("size", pageSize);
			map.put("start", start);
		}	
		return session.selectList(namespace+".selectWebtoon",map);
	}

	@Override
	public List<PlayVO> selectWebtoon(String day,Integer pageNo,Integer pageSize,String origin) throws Exception {
		Map<String,Object> map = new HashMap<>();
		map.put("origin", origin);
		if(pageSize == null) pageSize = 20;
		map.put("day", day);
		if(pageNo != null)
		{
			Integer start = (pageNo-1)*pageSize;
			map.put("size", pageSize);
			map.put("start", start);
		}	
		List<PlayVO> list = session.selectList(namespace+".selectWebtoon",map);
		return list;
	}

	@Override
	public List<PlayVO> selectGame(Integer pageNo, Integer pageSize) throws Exception {
		Map<String,Object> map = new HashMap<>();
		if(pageSize == null) pageSize = 20;
		if(pageNo != null)
		{
			Integer start = (pageNo-1)*pageSize;
			map.put("size", pageSize);
			map.put("start", start);
		}	
		return session.selectList(namespace+".selectGame",map);
	}

	

}
