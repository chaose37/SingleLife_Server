package org.singlelife.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import vo.ProdVO;

@Repository
public class ProdMapperImpl implements ProdMapper{
	
	
	@Inject
	private SqlSessionTemplate session;
	
	private String namespace = "org.singlelife.persistence.ProdMapper";

	@Override
	public List<ProdVO> selectProd(Integer pageNo, Integer pageSize) throws Exception {
		Map<String,Object> map = new HashMap<>();
		if(pageSize == null) pageSize = 20;
		if(pageNo != null)
		{
			Integer start = (pageNo-1) * pageSize;
			map.put("size",pageSize);
			map.put("start", start);
		}
		return session.selectList(namespace+".selectProd",map);
	}

	@Override
	public List<ProdVO> selectStoreProd(String store, Integer pageNo, Integer pageSize) throws Exception {
		Map<String,Object> map = new HashMap<>();
		map.put("store", store);
		if(pageSize == null) pageSize = 20;
		if(pageNo != null)
		{
			Integer start = (pageNo-1) * pageSize;
			map.put("size",pageSize);
			map.put("start", start);
		}
		return session.selectList(namespace+".selectStoreProd",map);
	}

}
