package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.InitializationService;

@Controller
@Transactional
public class IndexController {
	@Autowired
	private InitializationService initializationService;

	@RequestMapping(value = "/")
	public @ResponseBody String index1() {
		return "Index";
	}

	@RequestMapping(value = "/index")
	public @ResponseBody String index2() {
		return "Index";
	}

	@RequestMapping(value = "/initData")
	public @ResponseBody String initData() {
		initializationService.initData();
		System.out.println("Init data end");
		return "Done Init Data";
	}
}
