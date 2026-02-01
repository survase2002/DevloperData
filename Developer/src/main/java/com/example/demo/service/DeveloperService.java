package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Developer;

public interface DeveloperService {

	void add(Developer dev);

	List<Developer> Display();
	
	Developer Delete(Integer id);

	void Update(Developer dev, Integer id);

	Developer Search(Integer id);

	void addAll(List<Developer> list);
	
   
}
