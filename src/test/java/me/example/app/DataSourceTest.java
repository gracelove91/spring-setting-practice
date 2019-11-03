package me.example.app;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.example.app.mapper.SampleMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {
	
	private static final Logger log =  LoggerFactory.getLogger(DataSourceTest.class);
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SampleMapper sampleMapper;
	
	@Test
	public void test() {
		log.info(dataSource.toString());
	}
	
	@Test
	public void testGetTime() {
		log.info(sampleMapper.getTime());
	}

}
