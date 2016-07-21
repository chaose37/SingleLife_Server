package org.singlelife.controller;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.service.RecipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.RecipeVO;

@RestController
public class RecipeController {

	@Inject
	private RecipeService service;
	
	@RequestMapping("/recipe")
	public List<RecipeVO> selectRecipe(Integer pageNo, Integer pageSize) throws Exception {
		
		return service.selectRecipe(pageNo, pageSize);
		
	}
}
