package org.singlelife.service;

import java.util.List;

import vo.ProdVO;

public interface ProdService {
	
	public List<ProdVO> selectProd(Integer pageNo, Integer pageSize) throws Exception;
	public List<ProdVO> selectStoreProd(String store,Integer pageNo, Integer pageSize) throws Exception;

}
