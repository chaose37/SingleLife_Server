package org.singlelife.daotest;


import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.singlelife.persistence.TimeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class TimeMapperTest {
	
	private static Logger logger = LoggerFactory.getLogger(TimeMapperTest.class);
	
	@Inject
	TimeMapper mapper;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws Exception  {
		logger.info(mapper.toString());
		logger.info("=========================");
		logger.info(mapper.getTime());
		
	}

}
