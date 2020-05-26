package com.example.mavidev.dao;

import org.springframework.data.repository.Repository;

import com.example.mavidev.entity.Data;

public interface DataDao extends Repository<Data, Long> {
	
	public void save(Data data);

}
