package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.persistence.CVSMapper;
import org.springframework.stereotype.Service;

import vo.CVSVO;

@Service
public class CVSServiceImpl implements CVSService{

	@Inject
	private CVSMapper mapper;


	@Override 
	public List<CVSVO> listAll(Integer pageNo,Integer pageSize) {
		// TODO Auto-generated method stub
		return mapper.select(pageNo,pageSize);
	}

	@Override
	public List<CVSVO> listStore(String store,Integer pageNo,Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectStore(store,pageNo,pageSize);
	}

	@Override
	public List<CVSVO> listEvent(String event,Integer pageNo,Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectEvent(event,pageNo,pageSize);
	}
	
	
}
