package org.singlelife.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import vo.ApiVO;
import vo.ChartVO;
import vo.HistoryVO;

@Repository
public class ApiMapperImpl implements ApiMapper {
	
	@Inject
	private SqlSessionTemplate session;
	
	private String namespace = "org.singlelife.persistence.ApiMapper";

	@Override
	public ApiVO chkInfo(ApiVO vo) throws Exception {
		return session.selectOne(namespace+".chkInfo",vo);
	}
	@Override
	public ApiVO selectKey(ApiVO vo) throws Exception {
		return session.selectOne(namespace+".selectKey",vo);
	}

	@Override
	public String chkEmail(ApiVO apiVO) throws Exception {
		return session.selectOne(namespace + ".chkEmail", apiVO);
	}

	@Override
	public void insertKey(ApiVO apiVO) throws Exception {
		session.insert(namespace + ".insertKey", apiVO);
	}

	@Override
	public void deleteKey(ApiVO apiVO) throws Exception {
		session.delete(namespace+".deleteKey");
	}

	@Override
	public void updateKey(ApiVO apiVO) throws Exception {
		session.delete(namespace+".updateKey");
	}
	
	
	
	@Override
	public void history(HistoryVO his) throws Exception {
		session.insert(namespace+".history",his);
		
	}
	@Override
	public List<ChartVO> selectMonthly(String email, String day) throws Exception {
		Map<String,String> map = new HashMap<>(); 
		map.put("email", email);
		map.put("day", day);
		return session.selectList(namespace+".selectMonthly",map);
	}
	@Override
	public List<ChartVO> selectWeekend(String email, String day) throws Exception {
		Map<String,String> map = new HashMap<>(); 
		map.put("email", email);
		map.put("day", day);
		
		return session.selectList(namespace+".selectWeekend",map);
	}
	@Override
	public List<ChartVO> selectHourly(String email, String day) throws Exception {
		Map<String,String> map = new HashMap<>(); 
		map.put("email", email);
		map.put("day", day);
		
		return session.selectList(namespace+".selectHourly",map);
	}
	@Override
	public List<HistoryVO> selectDaily(String email, String day) throws Exception {
		
		Map<String,String> map = new HashMap<>(); 
		map.put("email", email);
		map.put("day", day);
		
		return session.selectList(namespace+".selectDaily",map);	}

}
