package org.singlelife.persistence;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import vo.ApiVO;

@Repository
public class ApiMapperImpl implements ApiMapper {
	
	@Inject
	private SqlSessionTemplate session;
	
	private String namespace = "org.singlelife.persistence.ApiMapper";

	@Override
	public ApiVO chkInfo(ApiVO vo) throws Exception {
		return session.selectOne(namespace+".chkInfo",vo);
	}
	@Override
	public ApiVO selectKey(ApiVO vo) throws Exception {
		return session.selectOne(namespace+".selectKey",vo);
	}

	@Override
	public String chkEmail(ApiVO apiVO) throws Exception {
		return session.selectOne(namespace + ".chkEmail", apiVO);
	}

	@Override
	public void insertKey(ApiVO apiVO) throws Exception {
		session.insert(namespace + ".insertKey", apiVO);
	}

	@Override
	public void deleteKey(ApiVO apiVO) throws Exception {
		session.delete(namespace+".deleteKey");
	}

	@Override
	public void updateKey(ApiVO apiVO) throws Exception {
		session.delete(namespace+".updateKey");
	}

}
