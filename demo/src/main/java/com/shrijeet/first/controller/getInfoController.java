package com.shrijeet.first.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class getInfoController {
	
	
	@RequestMapping("/getFirstName")
	String getFirstName() {
		return "Shrijeet";
	}
	
	@RequestMapping("/getLastName")
	String getLastName() {
		return "Savadikar";
	}
	
	@RequestMapping("/getMobNo")
	String getMobNo() {
		return "8484947881";
	}
}
