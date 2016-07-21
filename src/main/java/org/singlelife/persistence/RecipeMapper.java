package org.singlelife.persistence;

import java.util.List;

import vo.RecipeVO;

public interface RecipeMapper {
	
	public List<RecipeVO> selectRecipe(Integer pageNo, Integer pageSize) throws Exception;
	
}
