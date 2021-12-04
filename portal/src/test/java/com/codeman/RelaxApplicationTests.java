package com.codeman;

import com.codeman.mapper.CmsHelpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RelaxApplicationTests {
	@Resource
	private CmsHelpMapper cmsHelpMapper;
	@Test
	public void test() {
		System.out.println(cmsHelpMapper.selectById(1));
	}
}
