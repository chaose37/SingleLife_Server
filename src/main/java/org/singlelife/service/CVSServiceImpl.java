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
	public List<CVSVO> listAll() {
		// TODO Auto-generated method stub
		return mapper.select();
	}

	@Override
	public List<CVSVO> listStore(String store) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectStore(store);
	}

	@Override
	public List<CVSVO> listEvent(String event) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectEvent(event);
	}
	
	
}
