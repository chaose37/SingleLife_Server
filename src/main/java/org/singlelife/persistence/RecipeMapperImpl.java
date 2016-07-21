package org.singlelife.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import vo.RecipeVO;

@Repository
public class RecipeMapperImpl implements RecipeMapper {

	@Inject
	private SqlSessionTemplate session;
	
	private final String NAMESPACE = "org.singlelife.persistence.RecipeMapper";

	@Override
	public List<RecipeVO> selectRecipe(Integer pageNo, Integer pageSize) throws Exception {
		
		Map<String, Object> map = new HashMap<>();
		
		if(pageSize == null) pageSize = 20;
		if(pageNo != null) {
			Integer start = (pageNo - 1) * pageSize;
			map.put("size", pageSize);
			map.put("start", start);
		}
		return session.selectList(NAMESPACE + ".selectRecipe", map);
	}
}
