package com.chsyam.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContatController {
	@GetMapping("/contact")
	public String saveContactInquiryDetails(){
		return "Inquiry details are saved to DB";
	}
}
