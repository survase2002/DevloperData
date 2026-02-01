package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Developer;
import com.example.demo.repository.DeveloperRepository;

@Service
public  class DeveloperServiceImpl implements DeveloperService{

	@Autowired
	private DeveloperRepository dr;
	
	@Override
	public void add(Developer dev) {
		// TODO Auto-generated method stub
		dr.save(dev);
		
	}

	@Override
	public List<Developer> Display() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	@Override
	public Developer Delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(Developer dev, Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Developer Search(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAll(List<Developer> list) {
		// TODO Auto-generated method stub
		
	}

}
