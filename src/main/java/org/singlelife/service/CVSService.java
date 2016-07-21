package org.singlelife.service;

import java.util.List;

import vo.CVSVO;

public interface CVSService {
	
	public List<CVSVO> listStore(String store,Integer pageNo,Integer pageSize) throws Exception;
	public List<CVSVO> list(String store,String event,Integer pageNo,Integer pageSize) throws Exception;
	public List<CVSVO> listEvent(String event,Integer pageNo,Integer pageSize) throws Exception;
	public List<CVSVO> listAll(Integer pageNo,Integer pageSize);

}
