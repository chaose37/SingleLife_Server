package org.singlelife.persistence;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TimeMapperImpl implements TimeMapper {
	@Inject
	private SqlSessionTemplate sqlSession;
	
	private static final String NAMESPACE = "org.singlelife.persistence.TimeMapper";

	@Override
	public String getTime() throws RuntimeException {
		
		return sqlSession.selectOne(NAMESPACE + ".getTime");
	}

}
