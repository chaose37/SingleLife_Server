package org.singlelife.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;

import vo.TravelVO;

public class TravelMapperImpl implements TravelMapper {

	@Inject 
	private SqlSessionTemplate session;
	private final String NAMESPACE = "org.singlelife.persistence.TravelMapper";
	
	@Override
	public List<TravelVO> selectTravel(Integer pageNo, Integer pageSize) throws Exception {
		Map<String, Object> map = new HashMap<>();
		if (pageSize == null) pageSize = 20;
		if (pageNo != null) {
			Integer start = (pageNo - 1) * pageSize;
			map.put("size", pageSize);
			map.put("start", start);
		}
		return session.selectList(NAMESPACE + ".selectTravel", map);
	}
}
