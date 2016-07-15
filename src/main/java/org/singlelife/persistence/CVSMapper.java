package org.singlelife.persistence;

import java.util.List;

import vo.CVSVO;

public interface CVSMapper {
	public List<CVSVO> select();
	public List<CVSVO> selectStore(String store);
	public List<CVSVO> selectEvent(String event);


}
