package com.gaespringcrud.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestbookController {

	@RequestMapping("/guestbook/{name}")
	public String hello(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "guestbook/guestbook";
	}
}
