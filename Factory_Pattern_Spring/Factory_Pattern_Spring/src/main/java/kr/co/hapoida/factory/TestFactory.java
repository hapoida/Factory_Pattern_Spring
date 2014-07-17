package kr.co.hapoida.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestFactory{
	
	@Bean
	public TestType1 create(){
		return new TestType1();
	}
}
