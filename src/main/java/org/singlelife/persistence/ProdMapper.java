package org.singlelife.persistence;

import java.util.List;

import vo.ProdVO;

public interface ProdMapper {
	
	public List<ProdVO> selectProd(Integer pageNo, Integer pageSize) throws Exception;

}
