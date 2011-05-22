package com.gaespringcrud.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/snowboards")
public class SnowboardsController {
	
	@RequestMapping(value="/create")
	public String createView() {
		System.out.println("SnowboardsController: Passing through createView...");
		return "snowboards/createSnowboard";
	}
	
	
/*	
	@RequestMapping("/snowboards/{name}")
	public String create(@PathVariable String name, Model model) {
		System.out.println("SnowboardsController: Passing through...");
		return "snowboards/createSnowboard";
	}
*/	
}
