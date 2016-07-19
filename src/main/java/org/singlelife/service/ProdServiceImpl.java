package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.persistence.ProdMapper;
import org.springframework.stereotype.Service;

import vo.ProdVO;

@Service
public class ProdServiceImpl implements ProdService{
	
	@Inject
	private ProdMapper mapper;

	@Override
	public List<ProdVO> selectProd(Integer pageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectProd(pageNo, pageSize);
	}

}
