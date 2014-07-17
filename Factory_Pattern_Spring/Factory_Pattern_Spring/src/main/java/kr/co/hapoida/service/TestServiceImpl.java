package kr.co.hapoida.service;

import kr.co.hapoida.dao.TestDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TestDao testDao;
	
	@Override
	public void doAction() {
		System.out.println("It's doing...");
		testDao.doAction();
	}

}
