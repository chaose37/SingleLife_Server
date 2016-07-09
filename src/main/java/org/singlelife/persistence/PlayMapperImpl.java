package org.singlelife.persistence;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import vo.PlayVO;


@Repository
public class PlayMapperImpl implements PlayMapper{
	
	private String namespace="org.singlelife.persistence.PlayMapper"; 
	@Inject
	private SqlSessionTemplate session;

	@Override
	public List<PlayVO> selectPlay() {
		
		return session.selectList(namespace+".selectPlay");
	}
	

}
