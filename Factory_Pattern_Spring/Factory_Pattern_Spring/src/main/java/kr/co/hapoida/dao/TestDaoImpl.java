package kr.co.hapoida.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao{

	@Override
	public void doAction() {
		System.out.println("DAO Running~!!");
		
	}

}
