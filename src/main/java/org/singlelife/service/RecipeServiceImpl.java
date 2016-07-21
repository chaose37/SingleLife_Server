package org.singlelife.service;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.persistence.RecipeMapper;
import org.springframework.stereotype.Service;

import vo.RecipeVO;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Inject
	private RecipeMapper mapper;

	@Override
	public List<RecipeVO> selectRecipe(Integer pageNo, Integer pageSize) throws Exception {
		return mapper.selectRecipe(pageNo, pageSize);
	}
}
