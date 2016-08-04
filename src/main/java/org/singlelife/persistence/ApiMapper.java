package org.singlelife.persistence;

import vo.ApiVO;

public interface ApiMapper {

	public ApiVO chkInfo(ApiVO vo) throws Exception;
	public ApiVO selectKey(ApiVO vo) throws Exception;
	public String chkEmail(ApiVO apiVO) throws Exception;
	public void insertKey(ApiVO apiVO) throws Exception;
	public void deleteKey(ApiVO apiVO) throws Exception;
	public void updateKey(ApiVO apiVO) throws Exception;
}
