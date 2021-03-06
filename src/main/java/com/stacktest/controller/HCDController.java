package com.stacktest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HCDController {	
	@GetMapping("/hcd/display")
    public String display(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hcd/display";
    }
	
	@GetMapping("/hcd/displayfulldto")
    public String displayfulldto(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hcd/displayfulldto";
    }
}
