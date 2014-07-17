package kr.co.hapoida.factory;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

public interface Factory {
	
	public TestType1 create();
}
