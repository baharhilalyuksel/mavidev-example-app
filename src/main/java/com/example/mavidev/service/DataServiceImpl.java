package com.example.mavidev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mavidev.dao.DataDao;
import com.example.mavidev.entity.Data;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private DataDao dataDao;

	@Override
	public void saveData(Data data) {
		dataDao.save(data);
	}

}
