package com.wusd.readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 一个基本的集成测试类
 * @SpringRunner: 继承了SpringJUnitClassRunner
 * @SpringApplicationConfiguration: 通过spring boot加载上下文, 绝大部分代替@ContextConfiguration
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadingListApplicationTests {

	/**
	 * 测试加载的上下文
	 */
	@Test
	public void contextLoads() {
	}

}
