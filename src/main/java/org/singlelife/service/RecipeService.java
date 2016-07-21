package org.singlelife.service;

import java.util.List;

import vo.RecipeVO;

public interface RecipeService {
	
	public List<RecipeVO> selectRecipe(Integer pageNo, Integer pageSize) throws Exception;

}
