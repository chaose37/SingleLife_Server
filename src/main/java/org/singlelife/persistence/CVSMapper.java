package org.singlelife.persistence;

import java.util.List;

import vo.CVSVO;

public interface CVSMapper {
	public List<CVSVO> select(Integer pageNo
			,Integer pageSize);
	public List<CVSVO> selectStore(String store
			,Integer pageNo,Integer pageSize);
	public List<CVSVO> selectEvent(String event
			,Integer pageNo,Integer pageSize);
	public List<CVSVO> select(String store,String event
			,Integer pageNo,Integer pageSize);


}
