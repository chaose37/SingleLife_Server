package org.singlelife.service;

import java.util.List;

import vo.CVSVO;

public interface CVSService {
	
	public List<CVSVO> listStore(String store) throws Exception;
	public List<CVSVO> listEvent(String event) throws Exception;
	public List<CVSVO> listAll();

}
