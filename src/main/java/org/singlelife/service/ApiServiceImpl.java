package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.persistence.ApiMapper;
import org.springframework.stereotype.Service;

import vo.ApiVO;
import vo.ChartVO;
import vo.HistoryVO;

@Service
public class ApiServiceImpl implements ApiService {

	@Inject
	private ApiMapper mapper;
	
	@Override
	public ApiVO chkInfo(ApiVO vo) throws Exception {
		return mapper.chkInfo(vo);
	}

	@Override
	public String chkEmail(ApiVO apiVO) throws Exception {
		return mapper.chkEmail(apiVO);
	}

	@Override
	public void insertKey(ApiVO apiVO) throws Exception {
		mapper.insertKey(apiVO);
	}

	@Override
	public void deleteKey(ApiVO apiVO) throws Exception {
		mapper.deleteKey(apiVO);
	}

	@Override
	public void updateKey(ApiVO apiVO) throws Exception {
		mapper.updateKey(apiVO);
	}

	@Override
	public ApiVO selectKey(ApiVO apiVO) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectKey(apiVO);
	}

	@Override
	public void history(HistoryVO his) throws Exception {
		mapper.history(his);
	}

	@Override
	public List<ChartVO> selectMonthly(String email, String day) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectMonthly(email, day);
	}
	
	@Override
	public List<ChartVO> selectWeekend(String email, String day) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectWeekend(email, day);
	}
	
	@Override
	public List<ChartVO> selectHourly(String email, String day) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectHourly(email, day);
	}

	@Override
	public List<HistoryVO> selectDaily(String email, String day) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectDaily(email, day);
	}



}
