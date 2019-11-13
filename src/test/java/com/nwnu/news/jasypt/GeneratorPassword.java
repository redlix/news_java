package com.nwnu.news.jasypt;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/11/13     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/11/13 8:50 AM
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class GeneratorPassword {
	@Autowired
	StringEncryptor encryptor;

	@Test
	public void getPass() {
		String url = encryptor.encrypt(
				"jdbc:mysql://202.201.48.69:3306/news?charset=utf8mb4&useSSL=false&serverTimezone=GMT%2b8");
		String name = encryptor.encrypt("root");
		String password = encryptor.encrypt("redli9600,.0@");
		log.info("url = ENC({})", url);
		log.info("name = ENC({})", name);
		log.info("password = ENC({})", password);
		Assert.assertTrue(name.length() > 0);
		Assert.assertTrue(password.length() > 0);
	}
}