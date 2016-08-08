package org.singlelife.persistence;

import java.util.List;

import vo.ApiVO;
import vo.ChartVO;
import vo.HistoryVO;

public interface ApiMapper {

	public ApiVO chkInfo(ApiVO vo) throws Exception;
	public ApiVO selectKey(ApiVO vo) throws Exception;
	public String chkEmail(ApiVO apiVO) throws Exception;
	public void insertKey(ApiVO apiVO) throws Exception;
	public void deleteKey(ApiVO apiVO) throws Exception;
	public void updateKey(ApiVO apiVO) throws Exception;
	
	public void history(HistoryVO his) throws Exception;
	
	
	
	
	public List<ChartVO> selectMonthly(String email, String day) throws Exception;
	public List<ChartVO> selectWeekend(String email, String day) throws Exception;
	public List<ChartVO> selectHourly(String email, String day) throws Exception;
	
	
	public List<HistoryVO> selectDaily(String email, String day) throws Exception;
}
