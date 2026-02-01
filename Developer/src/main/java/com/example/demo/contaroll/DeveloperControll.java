package com.example.demo.contaroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BackEnd;
import com.example.demo.model.Developer;
import com.example.demo.model.FrontEnd;
import com.example.demo.service.DeveloperService;

@RestController
public class DeveloperControll {

	@Autowired
	private DeveloperService ds;
	
	@PostMapping("add/backend")
	public void add(@RequestBody BackEnd c) {
		ds.add(c);
	}
	@PostMapping("add/frontend")
	public void add(@RequestBody FrontEnd c) {
		ds.add(c);
	}
	@GetMapping("Display")
	public List<Developer> Display() {
		return ds.Display();
	}
}
