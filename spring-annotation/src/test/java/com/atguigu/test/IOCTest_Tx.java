package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.tx.TxConfig;
import com.atguigu.tx.UsersService;

public class IOCTest_Tx {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(TxConfig.class);
	
		UsersService usersService = applicationContext.getBean(UsersService.class);
		
		usersService.insertUser();
		applicationContext.close();
	}

}
