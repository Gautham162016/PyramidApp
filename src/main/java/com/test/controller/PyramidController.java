package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.PyramidService;
import services.impl.PyramidServiceImpl;




@RestController
@RequestMapping("/pyramidApp")
public class PyramidController{

//	@Autowired
//	private static TestServiceImpl testService;
	
	@GetMapping(value = "/{inputKey}")
	public static boolean checkPyramid(@PathVariable("inputKey") String inputKey) {
		
		PyramidServiceImpl t = new PyramidServiceImpl();
		boolean result = t.isPyramid(inputKey);
		return result;
		
	}

	
}
