package kr.co.hapoida.factory;

import kr.co.hapoida.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;

public class TestType1 {
	
	@Autowired
	TestService testService;
	
	public void testService(){
		testService.doAction();
	}
}
