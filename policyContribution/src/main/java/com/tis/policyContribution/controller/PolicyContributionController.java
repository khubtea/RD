package com.tis.policyContribution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/Contrib")
@RestController
public class PolicyContributionController {

	@GetMapping("/{ID}")
	public double getPolicyContrib() {
		
		return 100.00;
	}
}
