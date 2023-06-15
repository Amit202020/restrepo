package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Rest;


@RestController
public class RestaurantController {
	
	
	List<Rest>   list = Arrays.asList(
			new  Rest(1001,"KFC","non veg"),
			new  Rest(1002,"A2B","veg"),
			new  Rest(1003,"H2C","fast food"),
		        new  Rest(1004,"XYZ","fast food")
			);
	
	@GetMapping("/allRest")
	public  List<Rest>  getAllRest(){
		
		return list;
	}
	
	

}
