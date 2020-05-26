package com.example.mavidev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mavidev.entity.Data;
import com.example.mavidev.service.DataService;

@Controller
public class DataController {
	
	@Autowired
	private DataService dataService;
	
	@GetMapping("/editText")
	public String editText(Model model) {
		
		model.addAttribute("data", new Data());
		
		return "editText";
	}
	
	@PostMapping("/saveText")
	public String saveText(@ModelAttribute Data data) {
		
		dataService.saveData(data);
		
		return "list-city-town";
	}
	
	@GetMapping("/city-town")
	public String showCityTown() {
		return "list-city-town";
	}
	

}
