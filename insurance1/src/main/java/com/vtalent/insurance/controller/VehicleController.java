package com.vtalent.insurance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle1")
public class VehicleController {
	
	@GetMapping("/")
	public String init(HttpServletRequest req, HttpServletResponse res) {
		return "vehicle1";
	}
	
	@PostMapping("/success")
	public String success(HttpServletRequest req, HttpServletResponse res) {
		return "driver";
	}

}
