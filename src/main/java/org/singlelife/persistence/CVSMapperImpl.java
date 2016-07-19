package org.singlelife.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import vo.CVSVO;

@Repository
public class CVSMapperImpl implements CVSMapper{

	@Inject
	private SqlSessionTemplate session;
	
	private String namespace = "org.singlelife.persistence.cvsMapper";

	
	@Override
	public List<CVSVO> select(Integer pageNo,Integer pageSize) {
		
		if(pageSize == null) pageSize = 20;
		Map<String,Object> map = new HashMap<>();
		
		if(pageNo != null)
		{
			Integer start = (pageNo-1)*pageSize;
			map.put("start", start);
			map.put("size", pageSize);
		}

		return session.selectList(namespace+".select",map);
	}

	@Override
	public List<CVSVO> selectStore(String store,Integer pageNo,Integer pageSize) {
		// TODO Auto-generated method stub
		if(pageSize == null) pageSize = 20;
		Map<String,Object> map = new HashMap<>();
		if(pageNo != null)
		{
			Integer start = (pageNo-1)*pageSize;
			map.put("start", start);
			map.put("size", pageSize);
		}
		map.put("store", store);
		return session.selectList(namespace+".select",map);
	}

	@Override
	public List<CVSVO> selectEvent(String event,Integer pageNo,Integer pageSize) {
		event ="%"+event+"%";
		if(pageSize == null) pageSize = 20;
		Map<String,Object> map = new HashMap<>();
		if(pageNo != null)
		{
			Integer start = (pageNo-1)*pageSize;
			map.put("start", start);
			map.put("size", pageSize);
		}
		map.put("event", event);
		return session.selectList(namespace+".select",map);
	}

}
