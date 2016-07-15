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
	public List<CVSVO> select() {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".select");
	}

	@Override
	public List<CVSVO> selectStore(String store) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		map.put("store", store);
		return session.selectList(namespace+".select",map);
	}

	@Override
	public List<CVSVO> selectEvent(String event) {
		event ="%"+event+"%";
		Map<String,String> map = new HashMap<>();
		System.out.println(event);
		map.put("event", event);
		return session.selectList(namespace+".select",map);
	}

}
